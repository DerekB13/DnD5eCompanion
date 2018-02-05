package derek.disguisedsnowman.apps.main.character.races.shifter;

import derek.disguisedsnowman.apps.main.character.races.Shifter;

public class LongtoothShifter extends Shifter {
	{
		raceName = "Longtooth Shifter";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score and Strength score increase by 1.";
		
		racialFeatures.add("Shifting Feature. While shifting, you can make a " +
				"bite attack as an action. This is a melee weapon attack " +
				"that uses Strength for its attack roll and damage bonus and " +
				"deals 1d6 piercing damage. If this attack hits a target " +
				"that is your size or smaller, the target is also grappled.");
		
		abilityScoreIncrease[0] = 1;
	}
}
