package grundbuch;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains a Grundbuch with a List of all Blaettern.
 * @author da5254
 *
 */
public class Grundbuch {
	List<Grundbuchblatt> blaetter = new ArrayList<Grundbuchblatt>();

	/**
	 * Check is Blatt exists in Grundbuch.
	 * @param blatt Gruchbuchblatt
	 * @return <code>true</code> if the Blatt exists, otherwise <code>false</code>.
	 */
	public boolean blattExists(Grundbuchblatt blatt){
		if(blatt == null) {
			throw new IllegalArgumentException ("Blatt can not be null!");
		}
		return this.blaetter.contains(blatt);
	}

	/**
	 * Add a Blatt to the Grundbuch.
	 * @param blatt Grundbuchblatt
	 */
	public void createNewBlatt(Grundbuchblatt blatt){
		if(blatt == null) {
			throw new IllegalArgumentException("Blatt can not be null!");
		}
		if(!this.blattExists(blatt)){
			this.blaetter.add(blatt);
		}
	}
}
