package derek.disguisedsnowman.apps.main.character.races.shifter;

import derek.disguisedsnowman.apps.main.character.races.Shifter;

public class LongstrideShifter extends Shifter {
	{
		raceName = "Longstride Shifter";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2.";
		
		racialFeatures.add("Shifting Feature. While shifting, you can use " + 
				"the Dash action as a bonus action.");
		
		abilityScoreIncrease[1] = 2;
	}
}
