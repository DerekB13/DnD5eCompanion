package derek.disguisedsnowman.apps.main.character.races.tiefling;

import derek.disguisedsnowman.apps.main.character.races.Tiefling;

public class FiernaTiefling extends Tiefling {
	{
		raceName = "Fierna Tiefling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Charisma score increases by 2, and your Wisdom score " +
				"increases by 1.";
		source = "UA";
		
		racialFeatures.add("Legacy of Phlegethos. You know the friends " + 
				"cantrip. When you reach 3rd level, you can cast the charm " + 
				"person spell as a 2nd-level spell once with this trait and " + 
				"regain the ability to do so when you finish a long rest. " + 
				"When you reach 5th level, you can cast the suggestion spell " +
				"once with this trait and regain the ability to do so when " +
				"you finish a long rest. Charisma is your spellcasting " + 
				"ability for these spells.");
		
		abilityScoreIncrease[4] = 1;
		abilityScoreIncrease[3] = 0;
	}
}
