package derek.disguisedsnowman.apps.main.character.races.gnome;

import derek.disguisedsnowman.apps.main.character.races.Gnome;

public class Svirfneblin extends Gnome {
	{
		raceName = "Svirfneblin";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Intelligence score increases by 2 and your Dexterity score " +
				"increases by 1.";
		languageDesc = "Languages. You can speak, read, and write Common, " +
				"Gnomish, and Undercommon. The Gnomish language, which uses " +
				"the Dwarvish script, is renowned for its technical " +
				"treatises and its catalogs of knowledge about the natural " +
				"world.";
		source = "SCAG";
		
		racialFeatures.set(0, "Darkvision. Accustomed to life underground, " +
				"you have superior vision in dark and dim conditions. You " +
				"can see in dim light within 120 feet of you as if it were " +
				"bright light, and in darkness as if it were dim light. You " +
				"can't discern color in darkness, only shades of gray.");
		racialFeatures.add("Stone Camouflage. You have advantage on " +
				"Dexterity(Stealth) checks to hide in rocky terrain.");
		
		abilityScoreIncrease[1] = 1;
		languageProfs = "Common, Gnomish, Undercommon";
	}
}
