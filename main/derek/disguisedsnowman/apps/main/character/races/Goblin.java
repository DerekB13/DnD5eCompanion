package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Goblin extends PlayerRace {
	{
		raceName = "Goblin";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2, and your Constitution score increases " + 
				"by 1.";
		ageDesc = "Age. Goblins reach adulthood at age 8 and live up to 60 " + 
				"years.";
		alignmentDesc = "Alignment. Goblins are typically neutral evil, as " +
				"they care only for their own needs. A few goblins might " +
				"tend toward good or neutrality, but only rarely.";
		sizeDesc = "Size. Goblins are between 3 and 4 feet tall and weigh " + 
				"between 40 and 80 pounds. Your size is Small.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Goblin.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Fury of the Small. When you damage a creature " +
				"with an attack or a spell and the creature's size is " +
				"larger than yours, you can cause the attack or spell to " +
				"deal extra damage to the creature. The extra damage equals " +
				"your level. Once you use this trait, you can't use it again " +
				"until you finish a short or long rest.");
		racialFeatures.add("Nimble Escape. You can take the Disengage or " +
				"Hide action as a bonus action on each of your turns.");
		
		abilityScoreIncrease[1] = 2;
		abilityScoreIncrease[2] = 1;
		speed = 30;
		languageProfs = "Common, Goblin";
	}
}
