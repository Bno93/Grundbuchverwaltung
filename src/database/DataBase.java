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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import nutzerverwaltung.TempUser;
import nutzerverwaltung.User;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
/**
 * Is a visual Database. Which loads all Data from a real DB.
 *
 * Momentan nur Grundbücher, Blätter und User!!!!
 * @author da5254
 *
 */
public class DataBase {
	private String hostname;
	private int portnumber;
	private String databaseName;
	private String username;
	private char[] password;
	private DatabaseConnector connector;

	GrundbuchList buecher = new GrundbuchList();
	List<User> userList = new ArrayList<User>();

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

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return this.userList;
	}

	public void loadData(){
		this.loadGrundbuecher();
		this.loadUser();
		this.connector.closeDBConnection();
	}

	private void loadGrundbuecher(){
		System.out.println("\n+++start loding Data+++");

		DBCursor buchCursor = this.connector.getGrundbuchCollection().find();
		while(buchCursor.hasNext()){
			List<Grundbuchblatt> blaetterFuerBuch = new ArrayList<Grundbuchblatt>();
			DBObject buchObject = buchCursor.next();
			DBCursor blattCursor = this.connector.getGrundbuchblattCollection().find();
			while(blattCursor.hasNext()){
				DBObject blattObject = blattCursor.next();
				if(buchObject.get("Buchnummer").equals(blattObject.get("Buchnummer"))){
					blaetterFuerBuch.add(new Grundbuchblatt(new Blattnummer(Integer.parseInt(blattObject.get("Blattnummer").toString())),
							new AbteilungI(new Eigentuemer(blattObject.get("Eigentuemer").toString()), new Eigentumsverhaeltnis(blattObject.get("Eigentumsverhaeltnis").toString()), new Erwerbsgrundlage( blattObject.get("Erwerbsgrundlage").toString())),
							new AbteilungII(new Lasten(blattObject.get("Lasten").toString()), new Beschraenkungen(blattObject.get("Beschraenkungen").toString()), new Wiedersprueche(blattObject.get("Wiedersprueche").toString())),
							new AbteilungIII(new Grundpfandrecht(blattObject.get("Grundpfandrecht").toString())),
							new Aufschrift(new Amtsgericht(blattObject.get("Amtsgericht").toString()), new BuchNummer(Integer.parseInt(blattObject.get("Buchnummer").toString())), new Blattnummer(Integer.parseInt(blattObject.get("Buchnummer").toString())), new Gemarkung(blattObject.get("Gemarkung").toString())),
							new Bestandsverzeichnis(new Groesse(Float.parseFloat(blattObject.get("Groesse").toString())), new Lage(blattObject.get("Ort").toString(), Integer.parseInt(blattObject.get("PLZ").toString()), blattObject.get("Hausnummer").toString(), blattObject.get("Strasse").toString()), new Wirtschaft(blattObject.get("Wirtschaft").toString()), new ZustehendeRechte(blattObject.get("Zustehende Rechte").toString()))));

					//					System.out.println(new Grundbuchblatt(new Blattnummer(Integer.parseInt(blattObject.get("Blattnummer").toString())),
					//							new AbteilungI(new Eigentuemer(blattObject.get("Eigentuemer").toString()), new Eigentumsverhaeltnis(blattObject.get("Eigentumsverhaeltnis").toString()), new Erwerbsgrundlage( blattObject.get("Erwerbsgrundlage").toString())),
					//							new AbteilungII(new Lasten(blattObject.get("Lasten").toString()), new Beschraenkungen(blattObject.get("Beschraenkungen").toString()), new Wiedersprueche(blattObject.get("Wiedersprueche").toString())),
					//							new AbteilungIII(new Grundpfandrecht(blattObject.get("Grundpfandrecht").toString())),
					//							new Aufschrift(new Amtsgericht(blattObject.get("Amtsgericht").toString()), new BuchNummer(Integer.parseInt(blattObject.get("Buchnummer").toString())), new Blattnummer(Integer.parseInt(blattObject.get("Buchnummer").toString())), new Gemarkung(blattObject.get("Gemarkung").toString())),
					//							new Bestandsverzeichnis(new Groesse(Float.parseFloat(blattObject.get("Groesse").toString())), new Lage(blattObject.get("Ort").toString(), Integer.parseInt(blattObject.get("PLZ").toString()), blattObject.get("Hausnummer").toString(), blattObject.get("Strasse").toString()), new Wirtschaft(blattObject.get("Wirtschaft").toString()), new ZustehendeRechte(blattObject.get("Zustehende Rechte").toString()))));
				}
			}
			this.buecher.createNewBuch(new Grundbuch(buchObject.get("name").toString(), blaetterFuerBuch));
			//			System.out.println("Grundbuch erstellt!");
			//			System.out.println(this.connector.getUserCollection().findOne().toString());

		}
		System.out.println("===Grundbuecher geladen===");


	}

	private void loadUser(){

		DBCursor userCursor = this.connector.getUserCollection().find();
		while(userCursor.hasNext()){
			DBObject userObject = userCursor.next();
			if(userObject.get("Ablaufdatum")==null){
				this.userList.add(new User(userObject.get("name").toString(), Boolean.parseBoolean(userObject.get("admin").toString())));
				//				System.out.println(new User(userObject.get("name").toString(), Boolean.parseBoolean(userObject.get("admin").toString())).toString());
			}else{
				try {
					this.userList.add(new TempUser(userObject.get("name").toString(), Boolean.parseBoolean(userObject.get("admin").toString()), new SimpleDateFormat().parse(userObject.get("Ablaufdatum").toString())));
					//					System.out.println(new TempUser(userObject.get("name").toString(), Boolean.parseBoolean(userObject.get("admin").toString()), new SimpleDateFormat().parse(userObject.get("Ablaufdatum").toString())));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("===Load User from Database===");
	}

	//		DBCursor cursor = this.connector.getGrundbuchCollection().find();
	//		while(cursor.hasNext()){
	//			System.out.println("While1");
	//			List<Grundbuchblatt> blaetterFuerBuch = new ArrayList<Grundbuchblatt>();
	//			DBObject buch = cursor.next();
	////			BasicDBObject newSearch = new BasicDBObject("name",buch.get("Grundbuchname"));
	//			DBCursor buchCursor = this.connector.getGrundbuchblattCollection().find();
	//			while(buchCursor.hasNext()){
	//				System.out.println("while2");
	//				DBObject blattCursor = buchCursor.next();
	////				if(buch.get("Buchnummer").toString().equals(blattCursor.get("Buchnummer").toString())){
	//					//				if(blattCursor.get("Buchnummer").toString().equals(blaetterFuerBuch).)
	//					blaetterFuerBuch.add(new Grundbuchblatt(new Blattnummer(Integer.parseInt(blattCursor.get("Blattnummer").toString())),
	//							new AbteilungI(new Eigentuemer(blattCursor.get("Eigentuemer").toString()), new Eigentumsverhaeltnis(blattCursor.get("Eigentumsverhaeltnis").toString()), new Erwerbsgrundlage( blattCursor.get("Erwerbsgrundlage").toString())),
	//							new AbteilungII(new Lasten(blattCursor.get("Lasten").toString()), new Beschraenkungen(blattCursor.get("Beschraenkungen").toString()), new Wiedersprueche(blattCursor.get("Wiedersprueche").toString())),
	//							new AbteilungIII(new Grundpfandrecht(blattCursor.get("Grundpfandrecht").toString())),
	//							new Aufschrift(new Amtsgericht(blattCursor.get("Amtsgericht").toString()), new BuchNummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Blattnummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Gemarkung(blattCursor.get("Gemarkung").toString())),
	//							new Bestandsverzeichnis(new Groesse(Float.parseFloat(blattCursor.get("Groesse").toString())), new Lage(blattCursor.get("Ort").toString(), Integer.parseInt(blattCursor.get("PLZ").toString()), blattCursor.get("Hausnummer").toString(), blattCursor.get("Strasse").toString()), new Wirtschaft(blattCursor.get("Wirtschaft").toString()), new ZustehendeRechte(blattCursor.get("Zustehende Rechte").toString()))));
	//					System.out.println(new Grundbuchblatt(new Blattnummer(Integer.parseInt(blattCursor.get("Blattnummer").toString())),
	//							new AbteilungI(new Eigentuemer(blattCursor.get("Eigentuemer").toString()), new Eigentumsverhaeltnis(blattCursor.get("Eigentumsverhaeltnis").toString()), new Erwerbsgrundlage( blattCursor.get("Erwerbsgrundlage").toString())),
	//							new AbteilungII(new Lasten(blattCursor.get("Lasten").toString()), new Beschraenkungen(blattCursor.get("Beschraenkungen").toString()), new Wiedersprueche(blattCursor.get("Wiedersprueche").toString())),
	//							new AbteilungIII(new Grundpfandrecht(blattCursor.get("Grundpfandrecht").toString())),
	//							new Aufschrift(new Amtsgericht(blattCursor.get("Amtsgericht").toString()), new BuchNummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Blattnummer(Integer.parseInt(blattCursor.get("Buchnummer").toString())), new Gemarkung(blattCursor.get("Gemarkung").toString())),
	//							new Bestandsverzeichnis(new Groesse(Float.parseFloat(blattCursor.get("Groesse").toString())), new Lage(blattCursor.get("Ort").toString(), Integer.parseInt(blattCursor.get("PLZ").toString()), blattCursor.get("Hausnummer").toString(), blattCursor.get("Strasse").toString()), new Wirtschaft(blattCursor.get("Wirtschaft").toString()), new ZustehendeRechte(blattCursor.get("Zustehende Rechte").toString()))).toString());
	////					System.out.println("Grundpfandrecht:" + blattCursor.get("Grundpfandrecht").toString());
	////				}
	//			}
	//
	//			this.buecher.createNewBuch(new Grundbuch(buch.get("name").toString(), blaetterFuerBuch));
	//			//			System.out.println(cursor.next().get("name"));
	//		}


}
