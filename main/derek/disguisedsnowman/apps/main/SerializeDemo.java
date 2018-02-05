package derek.disguisedsnowman.apps.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class SerializeDemo {

	public static String saveRace(PlayerRace c) {
		String pathname = "C:/Users/Derek/Documents/Workspace/DnD5eCompanion/resources/customraces/" + c.getRaceName() + ".ser";
		try {
			FileOutputStream fileOut =
					new FileOutputStream(pathname);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(c);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in " + c.getRaceName() + ".ser");
		} catch (IOException io) {
			io.printStackTrace();
		}
		return pathname;
	}
}
