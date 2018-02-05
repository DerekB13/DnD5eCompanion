package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Shifter extends PlayerRace {
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 1.";
		sizeDesc = "Size. Shifters are about the same size as humans. Your " + 
				"size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common and " + 
				"Sylvan.";
		source = "UA";
		
		racialFeatures.add("Darkvision. Your lycanthropic heritage grants " +
				"you the ability to see in dark conditions. You can see in " +
				"dim light within 60 feet of you as if it were bright light, " +
				"and in darkness as if it were dim light. You can’t discern " +
				"color in darkness, only shades of gray.");
		racialFeatures.add("Shifting. On your turn, you can shift as a bonus " +
				"action. Shifting lasts for 1 minute or until you end it on " +
				"your turn asa bonus action.\r\n" + 
				"While shifting, you gain temporary hit points equal to your " + 
				"level + your Constitution bonus (minimum of 1). You also " +
				"gain a feature that depends on your shifter subrace, " +
				"described below.\r\n" + 
				"You must finish a short or long rest before you can shift " + 
				"again.");
		
		abilityScoreIncrease[1] = 1;
		speed = 30;
		languageProfs = "Common, Sylvan";
	}
}
