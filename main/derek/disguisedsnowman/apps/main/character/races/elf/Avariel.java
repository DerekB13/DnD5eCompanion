package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class Avariel extends Elf{
	{
		raceName = "Avariel (Elf)";
		languageDesc = "Languages. You can speak, read, and write Common, " +
				"Elvish, and Auran. Elvish is fluid, with subtle " +
				"intonations and intricate grammar. Elven literature is rich " +
				"and varied, and their songs and poems are famous among " +
				"other races. Many bards learn their language so they can " +
				"add Elvish ballads to their repertoires.";
		source = "UA";
		
		racialFeatures.add("Flight. You have a flying speed of 30 feet. To " +
				"use this speed, you can’t be wearing medium or heavy armor.");
		
		languageProfs = "Common, Elvish, Auran";
	}
}