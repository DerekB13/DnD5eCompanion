package derek.disguisedsnowman.apps.main.character.races.halfling;

import derek.disguisedsnowman.apps.main.character.races.Halfling;

public class LighfootHalfilng extends Halfling{
	{
		raceName = "Lightfoot Halfling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Charisma increases " +
				"by 1.";
		source = "PHB";

		racialFeatures.add("Naturally Stealthy. You can attempt to hide " +
				"even when you are obscured only by a creature that is at " +
				"least one size larger than you.");
		
		abilityScoreIncrease[5] = 1;
	}
}
