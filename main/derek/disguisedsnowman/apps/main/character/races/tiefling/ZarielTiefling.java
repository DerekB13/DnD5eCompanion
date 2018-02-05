package derek.disguisedsnowman.apps.main.character.races.tiefling;

import derek.disguisedsnowman.apps.main.character.races.Tiefling;

public class ZarielTiefling extends Tiefling {
	{
		raceName = "Zariel Tiefling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Charisma score increases by 2, and your Strength score " + 
				"increases by 1.";
		source = "UA";
		
		racialFeatures.add("Legacy of Avernus. You know the thaumaturgy " + 
				"cantrip. When you reach 3rd level, you can cast the searing " +
				"smite spell as a 2nd-level spell once with this trait and " +
				"regain the ability to do so when you finish a long rest. " +
				"When you reach 5th level, you can cast the branding smite " + 
				"spell once with this trait and regain the ability to do so " + 
				"when you finish a long rest. Charisma is your spellcasting " +
				"ability for these spells.");
	}
}
