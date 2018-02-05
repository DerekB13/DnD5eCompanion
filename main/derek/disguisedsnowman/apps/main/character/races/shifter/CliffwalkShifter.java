package derek.disguisedsnowman.apps.main.character.races.shifter;

import derek.disguisedsnowman.apps.main.character.races.Shifter;

public class CliffwalkShifter extends Shifter {
	{
		raceName = "Cliffwalk Shifter";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2.";
		
		racialFeatures.add("Shifting Feature. While shifting, you gain a " +
				"climb speed of 30 feet.");
		
		abilityScoreIncrease[1] = 2;
	}
}
