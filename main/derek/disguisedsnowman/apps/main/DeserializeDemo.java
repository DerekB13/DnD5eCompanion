package derek.disguisedsnowman.apps.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import derek.disguisedsnowman.apps.main.character.PlayerRace;
import derek.disguisedsnowman.apps.main.character.races.CustomRace;

public class DeserializeDemo {
	
	public static PlayerRace restoreRace(String pathname) {
		PlayerRace n = null;
		
		try {
			FileInputStream fileIn = new FileInputStream(pathname);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			n = (CustomRace) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException io) {
			io.printStackTrace();
			return null;
		} catch (ClassNotFoundException cnf) {
			System.out.println("Employee class not found");
			cnf.printStackTrace();
			return null;
		}
		
		return n;
	}
}
