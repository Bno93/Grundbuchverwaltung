package grundbuch;

import java.util.ArrayList;
import java.util.List;

public class GrundbuchList {
	List<Grundbuch> grundbuecher = new ArrayList<Grundbuch>();

	/**
	 * Check if Buch exists in List.
	 * @param buch Gruchbuch
	 * @return <code>true</code> if the Buch exists, otherwise <code>false</code>.
	 */
	public boolean buchExists(Grundbuch buch){
		if(buch == null) {
			throw new IllegalArgumentException ("Buch can not be null!");
		}
		return this.grundbuecher.contains(buch);
	}

	/**
	 * Add a Buch to the List.
	 * @param buch Grundbuchblatt
	 */
	public void createNewBuch(Grundbuch buch){
		if(buch == null) {
			throw new IllegalArgumentException("Buch can not be null!");
		}
		if(!this.buchExists(buch)){
			this.grundbuecher.add(buch);
		}
	}

	public Grundbuch getGrundbuch(int index){
		return this.grundbuecher.get(index);
	}

	public int getSize(){
		return this.grundbuecher.size();
	}
}
