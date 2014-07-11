package grundbuch;

import grundbuch.abteilungI.AbteilungI;
import grundbuch.abteilungII.AbetilungII;
import grundbuch.abteilungIII.AbteilungIII;
import grundbuch.aufschrift.Aufschrift;
import grundbuch.aufschrift.Blattnummer;


public class Grundbuchblatt {
	private Blattnummer blattnummer;
	private AbteilungI abteilungI;
	private AbetilungII abetilungII;
	private AbteilungIII abteilungIII;
	private Aufschrift aufschrift;

	//TODO: Mach Grundbuchblatt fertig
	public Grundbuchblatt(Blattnummer blattnummer, AbteilungI abteilungI, AbetilungII abetilungII, AbteilungIII abteilungIII, Aufschrift aufschrift) {
		this.blattnummer = blattnummer;
		this.abteilungI = abteilungI;
		this.abetilungII = abetilungII;
		this.abteilungIII = abteilungIII;
		this.aufschrift = aufschrift;
	}
}
