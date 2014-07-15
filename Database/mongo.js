conn = new Mongo();
db = connect("localhost:27017");
db = db.getSiblingDB("admin");
db.dropDatabase()
db = db.getSiblingDB("Grundbuchverwaltung");
db.dropDatabase()

db.Grundbuch.insert({"name":"Grundbuchname", "Buchnummer":"1"});
db.Grundbuch.insert({"name":"2", "Buchnummer":"2"});
db.Grundbuchblatt.insert({"Grundbuch":"Grundbuchname","Blattnummer":"1","Eigentuemer":"Max Muster", "Eigentumsverhaeltnis":"100%", "Erwerbsgrundlage":"blabla", "Lasten":"keine","Beschraenkungen":"keine","Wiedersprueche":"keine", "Grundpfandrecht":"keins", "Amtsgericht":"Frankfurt", "Buchnummer": "1", "Gemarkung":"irgendwas", "Groesse":"115.5", "Ort":"Blaburg", "PLZ":"77738", "Hausnummer":"23a", "Strasse": "Gasse2", "Wirtschaft":"Wohnhaus", "Zustehende Rechte": "keine"});
db.createUser(
			{
				user:"willi",
				pwd:"bald",
				roles:[{role:"readWrite",db:"TestDB"}]});
db.getCollectionNames();
