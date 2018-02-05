package derek.disguisedsnowman.apps.main.character.races.shifter;

import derek.disguisedsnowman.apps.main.character.races.Shifter;

public class RazorclawShifter extends Shifter {
	{
		raceName = "Razorclaw Shifter";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2.";
		
		racialFeatures.add("Shifting Feature. While shifting, you can make " +
				"an unarmed strike as a bonus action. You can use your " +
				"Dexterity for its attack roll and damage bonus, and this " +
				"attack deals slashing damage.");
		
		abilityScoreIncrease[1] = 2;
	}
}
