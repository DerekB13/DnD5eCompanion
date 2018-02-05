package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Hobgoblin extends PlayerRace {
	{
		raceName = "Hobgoblin";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " + 
				"Constitution score increases by 2, and your Intelligence " +
				"score increases by 1.";
		ageDesc = "Age. Hobgoblins mature at the same rate as humans and " + 
				"have lifespans similar in length to theirs.";
		alignmentDesc = "Alignment. Hobgoblin society is built on fidelity " +
				"to a rigid, unforgiving code of conduct. As such, they " +
				"tend toward lawful evil.";
		sizeDesc = "Size. Hobgoblins are between 5 and 6 feet tall and weigh " + 
				"between 150 and 200 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Goblin.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Martial Training. You are proficient with two " +
				"martial weapons of your choice and with light armor.");
		racialFeatures.add("Saving Face. Hobgoblins are careful not to show " + 
				"weakness in front of their allies, for fear of losing " +
				"status. If you miss with an attack roll or fail an ability " +
				"check or a saving throw, you can gain a bonus to the roll " +
				"equal to the number of allies you can see within 30 feet " +
				"of you (maximum bonus of +5). Once you use this trait, you " + 
				"can't use it again until you finish a short or long rest.");
		
		abilityScoreIncrease[2] = 2;
		abilityScoreIncrease[3] = 1;
		speed = 30;
		languageProfs = "Common, Goblin";
	}
}
