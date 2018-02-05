package derek.disguisedsnowman.apps.main.character.races.shifter;

import derek.disguisedsnowman.apps.main.character.races.Shifter;

public class BeasthideShifter extends Shifter {
	{
		raceName = "Beasthide Shifter";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score and your Constitution score increases by 1.";
		
		racialFeatures.add("Shifting Feature. While shifting, you gain a +1 " +
				"bonus to AC.");
		
		abilityScoreIncrease[2] = 1;
		
		extraAc = true;
	}
}
