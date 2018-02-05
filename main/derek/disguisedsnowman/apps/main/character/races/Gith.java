package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Gith extends PlayerRace {
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Intelligence score increases by 1.";
		ageDesc = "Age. Gith reach adulthood in their late teens and live " +
				"for about a century.";
		sizeDesc = "Size. Gith are taller and leaner than humans, with most " +
				"a slender 6 feet in height.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Gith.";
		source = "UA";
		
		abilityScoreIncrease[3] = 1;
		speed = 30;
		languageProfs = "Common, Gith";
	}
}
