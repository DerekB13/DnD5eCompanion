package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class SeaElf extends Elf{
	{
		raceName = "Sea Elf";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Constitution " +
				"increases by 1.";
		languageDesc = "Languages. You can speak, read, and write Common, " +
				"Elvish, and Aquan. Elvish is fluid, with subtle intonations " +
				"and intricate grammar. Elven literature is rich and varied, " +
				"and their songs and poems are famous among other races. " +
				"Many bards learn their language so they can add Elvish " +
				"ballads to their repertoires.";
		source = "UA";
		
		racialFeatures.add("Sea Elf Weapon Training. You have proficiency " +
				"with the spear, trident, light crossbow, and net.");
		racialFeatures.add("Child of the Sea. You have a swimming speed of " +
				"30 feet, and you can breathe air and water.");
		racialFeatures.add("Friend of the Sea. Using gestures and sounds, " +
				"you can communicate simple ideas with Small or smaller " +
				"beasts that have an inborn swimming speed.");
		
		abilityScoreIncrease[2] = 1;
		languageProfs = "Common, Elvish, Aquan";
	}
}
