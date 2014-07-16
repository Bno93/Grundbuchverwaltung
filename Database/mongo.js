conn = new Mongo();
db = connect("localhost:27017/Grundbuchverwaltung");
db = db.getSiblingDB("admin");
db.dropDatabase()
db = db.getSiblingDB("Grundbuchverwaltung");
db.dropDatabase()

db.Grundbuch.insert({"name":"Grundbuchname", "Buchnummer":"1"});
db.Grundbuch.insert({"name":"2", "Buchnummer":"2"});
print("+++Zwei Grundbuecher erstellt!+++");
db.Grundbuchblatt.insert({"Grundbuch":"Grundbuchname","Blattnummer":"1","Eigentuemer":"Max Muster", "Eigentumsverhaeltnis":"100%", "Erwerbsgrundlage":"blabla", "Lasten":"keine","Beschraenkungen":"keine","Wiedersprueche":"keine", "Grundpfandrecht":"keins", "Amtsgericht":"Frankfurt", "Buchnummer": "1", "Gemarkung":"irgendwas", "Groesse":"115.5", "Ort":"Blaburg", "PLZ":"77738", "Hausnummer":"23a", "Strasse": "Gasse2", "Wirtschaft":"Wohnhaus", "Zustehende Rechte": "keine"});
db.Grundbuchblatt.insert({"Grundbuch":"2","Blattnummer":"1","Eigentuemer":"Maus Muster", "Eigentumsverhaeltnis":"100%", "Erwerbsgrundlage":"blabla", "Lasten":"keine","Beschraenkungen":"keine","Wiedersprueche":"keine", "Grundpfandrecht":"keins", "Amtsgericht":"Frankfurt", "Buchnummer": "2", "Gemarkung":"irgendwas", "Groesse":"115.5", "Ort":"Blaburg", "PLZ":"77738", "Hausnummer":"23a", "Strasse": "Gasse2", "Wirtschaft":"Wohnhaus", "Zustehende Rechte": "keine"});
db.Grundbuchblatt.insert({"Grundbuch":"2","Blattnummer":"1","Eigentuemer":"Mausi Muster", "Eigentumsverhaeltnis":"100%", "Erwerbsgrundlage":"blabla", "Lasten":"keine","Beschraenkungen":"keine","Wiedersprueche":"keine", "Grundpfandrecht":"keins", "Amtsgericht":"Frankfurt", "Buchnummer": "1", "Gemarkung":"irgendwas", "Groesse":"115.5", "Ort":"Blaburg", "PLZ":"77738", "Hausnummer":"23a", "Strasse": "Gasse2", "Wirtschaft":"Wohnhaus", "Zustehende Rechte": "keine"});
print("+++Drei Blätter erstellt!+++");
db.User.insert({"name":"willi","admin":true});
db.User.insert({"name":"mongo","admin":false,"Ablaufdatum":"01.01.2015 02:06:55"});
db.createUser(
			{
				user:"willi",
				pwd:"bald",
				roles:[{role:"readWrite",db:"Grundbuchverwaltung"}]});
db.createUser(
			{
				user:"mongo",
				pwd:"bald",
				roles:[{role:"read",db:"Grundbuchverwaltung"}]});

print("\n+++Collections: " + db.getCollectionNames() + " ertstellt!+++");
