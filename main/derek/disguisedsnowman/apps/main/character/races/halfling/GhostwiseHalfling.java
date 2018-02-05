package derek.disguisedsnowman.apps.main.character.races.halfling;

import derek.disguisedsnowman.apps.main.character.races.Halfling;

public class GhostwiseHalfling extends Halfling{
	{
		raceName = "Ghostwise Halfling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Wisdom score " +
				"increases by 1.";
		source = "SCAG";

		racialFeatures.add("Silent Speech. You can speak telepathically to " +
				"any creature within 30 feet of you. The creature " +
				"understands you only if the two of you share a language. " + 
				"You can speak telepathically in this way to one creature " +
				"at a time.");
		
		abilityScoreIncrease[4] = 1;
	}
}
