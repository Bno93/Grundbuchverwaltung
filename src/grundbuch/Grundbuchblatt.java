package grundbuch;

import grundbuch.abteilungI.AbteilungI;
import grundbuch.abteilungII.AbetilungII;
import grundbuch.abteilungIII.AbteilungIII;


public class Grundbuchblatt {
	private Blattnummer blattnummer;
	private AbteilungI abteilungI;
	private AbetilungII abetilungII;
	private AbteilungIII abteilungIII;

	//TODO: Mach Grundbuchblatt fertig
	public Grundbuchblatt(Blattnummer blattnummer, AbteilungI abteilungI, AbetilungII abetilungII, AbteilungIII abteilungIII) {
		this.blattnummer = blattnummer;
		this.abteilungI = abteilungI;
		this.abetilungII = abetilungII;
		this.abteilungIII = abteilungIII;
	}
}
