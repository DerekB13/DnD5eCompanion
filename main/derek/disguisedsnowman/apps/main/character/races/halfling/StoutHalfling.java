package derek.disguisedsnowman.apps.main.character.races.halfling;

import derek.disguisedsnowman.apps.main.character.races.Halfling;

public class StoutHalfling extends Halfling {
	{
		raceName = "Stout Halfling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Constitution score " +
				"increases by 1.";
		source = "PHB";

		racialFeatures.add("Stout Resilience. You have advantage on saving " +
				"throws against poison, and you have resistance against " +
				"poison damage.");
		
		abilityScoreIncrease[2] = 1;
	}
}
