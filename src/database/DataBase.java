package database;

import grundbuch.Grundbuch;
import grundbuch.GrundbuchList;
import grundbuch.Grundbuchblatt;
import grundbuch.abteilungI.AbteilungI;
import grundbuch.abteilungI.Eigentuemer;
import grundbuch.abteilungI.Eigentumsverhaeltnis;
import grundbuch.abteilungI.Erwerbsgrundlage;
import grundbuch.abteilungII.AbteilungII;
import grundbuch.abteilungII.Beschraenkungen;
import grundbuch.abteilungII.Lasten;
import grundbuch.abteilungII.Wiedersprueche;
import grundbuch.abteilungIII.AbteilungIII;
import grundbuch.abteilungIII.Grundpfandrecht;
import grundbuch.aufschrift.Amtsgericht;
import grundbuch.aufschrift.Aufschrift;
import grundbuch.aufschrift.Blattnummer;
import grundbuch.aufschrift.BuchNummer;
import grundbuch.aufschrift.Gemarkung;
import grundbuch.bestandsverzeichnis.Bestandsverzeichnis;
import grundbuch.bestandsverzeichnis.Groesse;
import grundbuch.bestandsverzeichnis.Lage;
import grundbuch.bestandsverzeichnis.Wirtschaft;
import grundbuch.bestandsverzeichnis.ZustehendeRechte;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;

public class DataBase {
	private String hostname;
	private int portnumber;
	private String databaseName;
	private String username;
	private char[] password;
	private DatabaseConnector connector;

	GrundbuchList buecher = new GrundbuchList();

	public DataBase(String hostname, int portnumber, String databaseName, String username, char[] password) throws UnknownHostException, MongoException, Exception {
		this.databaseName = databaseName;
		this.hostname = hostname;
		this.password = password;
		this.portnumber = portnumber;
		this.username = username;
		this.connector = new DatabaseConnector(hostname,portnumber,databaseName, username,password);
	}

	public GrundbuchList getBuecher() {
		return this.buecher;
	}

	public void loadData(){
		System.out.println("start loding Data");
		DBCursor cursor = this.connector.getGrundbuchCollection().find();
		while(cursor.hasNext()){
			System.out.println("While1");
			List<Grundbuchblatt> blaetterFuerBuch = new ArrayList<Grundbuchblatt>();
			DBObject buch = cursor.next();
			BasicDBObject newSearch = new BasicDBObject("name",buch.get("Grundbuchname"));
			DBCursor buchCursor = this.connector.getGrundbuchblattCollection().find( newSearch );
			while(buchCursor.hasNext()){
				System.out.println("while2");
				DBObject blattCursor = buchCursor.next();
				blaetterFuerBuch.add(new Grundbuchblatt(new Blattnummer(Integer.parseInt(blattCursor.get("Blattnummer").toString())),
						new AbteilungI(new Eigentuemer(blattCursor.get("Eigentuemer").toString()), new Eigentumsverhaeltnis(blattCursor.get("Eigentumsverhaeltnis").toString()), new Erwerbsgrundlage( blattCursor.get("Erwerbsgrundlage").toString())),
						new AbteilungII(new Lasten(blattCursor.get("Lasten").toString()), new Beschraenkungen(blattCursor.get("Beschraenkungen").toString()), new Wiedersprueche(blattCursor.get("Wiedersprueche").toString())),
						new AbteilungIII(new Grundpfandrecht(blattCursor.get("Grundpfandrecht").toString())),
						new Aufschrift(new Amtsgericht(blattCursor.get("Amtsgericht").toString()), new BuchNummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Blattnummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Gemarkung(blattCursor.get("Gemarkung").toString())),
						new Bestandsverzeichnis(new Groesse(Float.parseFloat(blattCursor.get("Groesse").toString())), new Lage(blattCursor.get("Ort").toString(), Integer.parseInt(blattCursor.get("PLZ").toString()), blattCursor.get("Hausnummer").toString(), blattCursor.get("Strasse").toString()), new Wirtschaft(blattCursor.get("Wirtschaft").toString()), new ZustehendeRechte(blattCursor.get("Zustehende Rechte").toString()))));
				System.out.println(new Grundbuchblatt(new Blattnummer(Integer.parseInt(blattCursor.get("Blattnummer").toString())),
						new AbteilungI(new Eigentuemer(blattCursor.get("Eigentuemer").toString()), new Eigentumsverhaeltnis(blattCursor.get("Eigentumsverhaeltnis").toString()), new Erwerbsgrundlage( blattCursor.get("Erwerbsgrundlage").toString())),
						new AbteilungII(new Lasten(blattCursor.get("Lasten").toString()), new Beschraenkungen(blattCursor.get("Beschraenkungen").toString()), new Wiedersprueche(blattCursor.get("Wiedersprueche").toString())),
						new AbteilungIII(new Grundpfandrecht(blattCursor.get("Grundpfandrecht").toString())),
						new Aufschrift(new Amtsgericht(blattCursor.get("Amtsgericht").toString()), new BuchNummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Blattnummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Gemarkung(blattCursor.get("Gemarkung").toString())),
						new Bestandsverzeichnis(new Groesse(Float.parseFloat(blattCursor.get("Groesse").toString())), new Lage(blattCursor.get("Ort").toString(), Integer.parseInt(blattCursor.get("PLZ").toString()), blattCursor.get("Hausnummer").toString(), blattCursor.get("Strasse").toString()), new Wirtschaft(blattCursor.get("Wirtschaft").toString()), new ZustehendeRechte(blattCursor.get("Zustehende Rechte").toString()))).toString());
				System.out.println("Grundpfandrecht:" + blattCursor.get("Grundpfandrecht").toString());
			}

			this.buecher.createNewBuch(new Grundbuch(buch.get("name").toString(), blaetterFuerBuch));
			System.out.println(cursor.next().get("name"));
		}
	}

}
