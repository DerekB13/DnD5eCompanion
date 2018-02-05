package derek.disguisedsnowman.apps.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Demo2 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:/Users/Derek/Documents/Workspace/DnD5eCompanion/main/derek/disguisedsnowman/apps/main/Backup.txt");
		Scanner input = new Scanner(file);
		PlayerRace p = DeserializeDemo.restoreRace(input.nextLine());
		
		System.out.println(p.getRacialFeatures().getFirst());
		System.out.println(p.getAgeDesc());
		
		input.close();
	}
}
