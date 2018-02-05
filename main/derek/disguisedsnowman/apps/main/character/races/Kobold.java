package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Kobold extends PlayerRace {
	{
		raceName = "Kobold";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2, and your Strength score is reduced " +
				"by 2.";
		ageDesc = "Age. Kobolds reach adulthood at age 6 and can live up to " + 
				"120 years but rarely do so.";
		alignmentDesc = "Alignment. Kobolds are fundamentally selfish, " +
				"making them evil, but their reliance on the strength of " +
				"their group makes them trend toward law.";
		sizeDesc = "Size. Kobolds are between 2 and 3 feet tall and weigh " + 
				"between 25 and 35 pounds. Your size is Small.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages, You can speak, read, and write Common " + 
				"and Draconic.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Grovel, Cower, and Bes. As an action on your " +
				"turn, you can cower pathetically to distract nearby foes. " +
				"Until the end of your next turn, your allies gain advantage " +
				"on attack rolls against enemies within 10 feet of you that " + 
				"can see you. Once you use this trait, you can't use it " + 
				"again until you finish a short or long rest.");
		racialFeatures.add("Pack Tactics. You have advantage on an attack " +
				"roll against a creature if at least one of your allies is " +
				"within 5 feet of the creature and the ally isn't " +
				"incapacitated.");
		racialFeatures.add("Sunlight Sensitivity. You have disadvantage on " +
				"attack rolls and on Wisdom (Perception) checks that rely " + 
				"on sight when you, the target of your attack, or whatever " + 
				"you are trying to perceive is in direct sunlight.");
		
		abilityScoreIncrease[1] = 2;
		abilityScoreIncrease[0] = -2;
		speed = 30;
		languageProfs = "Common, Draconic";
	}
}
