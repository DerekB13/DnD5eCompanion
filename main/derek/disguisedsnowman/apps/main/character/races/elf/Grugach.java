package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class Grugach extends Elf{
	{
		raceName = "Grugach (Elf)";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Strength score " +
				"increases by 1.";
		languageDesc = "Languages. You can speak, read, and write Elvish " +
				"and Sylvan. Elvish is fluid, with subtle intonations and " +
				"intricate grammar. Elven literature is rich and varied, " +
				"and their songs and poems are famous among other races. " +
				"Many bards learn their language so they can add Elvish " +
				"ballads to their repertoires.";
		source = "UA";
		
		racialFeatures.add("Grugach Weapon Training. You have proficiency " +
				"with the spear, shortbow, longbow, and net.");
		racialFeatures.add("Cantrip. You know one cantrip of your choice " +
				"from the druid spell list. Wisdom is your spellcasting " +
				"ability for it.");
		
		abilityScoreIncrease[0] = 1;
		languageProfs = "Elvish, Sylvan";
	}
}
