package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Halfling extends PlayerRace {
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2.";
		ageDesc = "Age. A halfling reaches adulthood at the age of 20 and " +
				"generally lives into the middle of his or her second century.";
		alignmentDesc = "Alignment. Most halflings are lawful good. As a " +
				"rule, they are good-hearted and kind, hate to see others " +
				"in pain, and have no tolerance for oppression. They are " +
				"also very orderly and traditional, leaning heavily on the " +
				"support of their community and the comfort of their old ways.";
		sizeDesc = "Size. Halflings average about 3 feet tall and weigh " +
				"about 40 pounds. Your size is Small.";
		speedDesc = "Speed. Your base walking speed is 25 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Halfling. The Halfling language isn’t secret, but " +
				"halflings are loath to share it with others. They write " + 
				"very little, so they don’t have a rich body of literature. " +
				"Their oral tradition, however, is very strong. Almost all " +
				"halflings speak Common to converse with the people in " + 
				"in whose lands they dwell or through which they are " +
				"traveling.";
		
		racialFeatures.add("Lucky. When you roll a 1 on an attack roll, " +
				"ability check, or saving throw, you can reroll the die and " +
				"must use the new roll.");
		racialFeatures.add("Brave. You have advantage on saving throws " +
				"against being frightened.");
		racialFeatures.add("Halfling Nimbleness. You can move through the " +
				"space of any creature that is of a size larger than yours.");
		
		abilityScoreIncrease[1] = 2;
		speed = 25;
		languageProfs = "Common, Halfling";
	}
}
