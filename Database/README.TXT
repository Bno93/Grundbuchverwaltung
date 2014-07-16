MongoDB Downloaden Skript benötigt MINDESTENS version 2.6.0
-----------------------------------------------------------------

+++UNTER LINUX:+++

ordner /data/db anlegen fals nicht vorhanden
§ sudo mkdir /data/db

in MongoDB ordner wechseln und Server starten
§ sudo ./mongo

	um den User zur authentifikation zu zwingen nutze
	§ sudo ./mongo --auth
	
	andernfalls muss Username und benutzer nicht angegeben werden
	Userdaten
	User: willi
	PWD: bald

in neuen Tab das Skript ausführen
§ mongo /pfad/zur/datei/mongo.js

Programm starten

PS:
Server muss beim systemstart gestartet werden oder in den Startprogrammen eingetragen werden

------------------------------------------------------------------

+++UNTER WINDOWS:+++

Downloaden und Installieren von MongoDB wie gehabt!
______________________________________
ACHTUNG: Pfade m�ssen angepasst werden

+++SKRIPT ZUM STARTEN OHNE AUTHENTIFIZIERUNG:+++

start "" "C:\programme\MongoDB 2.6 Standard\bin\mongod.exe" --dbpath "C:\Program Files\MongoDB\Data\DB"
start "" "C:\programme\MongoDB 2.6 Standard\bin\mongo.exe"

+++SKRIPT ZUM STARTEN MIT AUTHENTIFIZIERUNG:+++

start "" "C:\programme\mongodb 2.6 standard\bin\mongod.exe" --dbpath "C:\Program Files\MongoDB\Data\DB" --auth
start "" "C:\programme\mongodb 2.6 standard\bin\mongo.exe"

__________________________________________________________________

Achtung zum laden des Skripts muss der Server ohne Authentifiezierung gestartet werden.