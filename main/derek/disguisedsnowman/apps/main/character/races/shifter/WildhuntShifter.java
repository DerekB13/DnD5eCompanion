package derek.disguisedsnowman.apps.main.character.races.shifter;

import derek.disguisedsnowman.apps.main.character.races.Shifter;

public class WildhuntShifter extends Shifter {
	{
		raceName = "Wildhunt Shifter";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score and your Wisdom score increases by 1.";
		
		racialFeatures.add("Shifting Feature. While shifting, you gain " +
				"advantage on all Wisdom-based checks and saving throws.");
		
		abilityScoreIncrease[1] = 1;
		abilityScoreIncrease[4] = 1;
	}
}
