package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Orc extends PlayerRace {
	{
		raceName = "Orc";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Strength " +
				"score increases by 2, your Constitution score increases by " +
				"1, and your Intelligence score is reduced by 2.";
		ageDesc = "Age. Orcs reach adulthood at age 12 and live up to 50 " + 
				"years.";
		alignmentDesc = "Alignment. Orcs are vicious raiders, who believe " +
				"that the world should be theirs. They also respect strength " + 
				"above all else and believe the strong must bully the " + 
				"weak to ensure that weakness does not spread like a " + 
				"disease. They are usually chaotic evil.";
		sizeDesc = "Size. Orcs are usually over 6 feet tall and weigh " +
				"between 230 and 280 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Orc.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Aggressive. As a bonus action, you can move up " +
				"to your speed toward an enemy of your choice that you can " + 
				"see or hear. You must end this move closer to the enemy " + 
				"than you started.");
		racialFeatures.add("Menacing. You are trained in the Intimidation " +
				"skill.");
		racialFeatures.add("Powerful Build. You count as one size larger " +
				"when determining your carrying capacity and the weight you " + 
				"can push, drag, or lift.");
		
		abilityScoreIncrease[0] = 2;
		abilityScoreIncrease[2] = 1;
		abilityScoreIncrease[3] = -2;
		speed = 30;
		languageProfs = "Common, Orc";
		
		extraSkillProf = true;
	}
}
