package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class HalfElf extends PlayerRace{
	{
		raceName = "Half-Elf";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Charisma score increases by 2, and two other ability scores " + 
				"of your choice increase by 1.";
		ageDesc = "Age. Half-elves mature at the same rate humans do and " + 
				"reach adulthood around the age of 20. They live much longer " + 
				"than humans, however, often exceeding 180 years.";
		alignmentDesc = "Alignment. Half-elves share the chaotic bent of " +
				"their elven heritage. They value both personal freedom and " +
				"creative expression, demonstrating neither love of leaders " +
				"nor desire for followers. They chafe at rules, resent " +
				"others’ demands, and sometimes prove unreliable, or at " +
				"least unpredictable.";
		sizeDesc = "Size. Half-elves are about the same size as humans, " + 
				"ranging from 5 to 6 feet tall. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common, " + 
				"Elvish, and one extra language of your choice.";
		source = "PHB";
		
		racialFeatures.add("Darkvision. Thanks to your elf blood, you have " + 
				"superior vision in dark and dim conditions. You can see in " + 
				"dim light within 60 feet of you as if it were bright " + 
				"light, and in darkness as if it were dim light. You can’t " + 
				"discern color in darkness, only shades of gray.");
		racialFeatures.add("Fey Ancestry. You have advantage on saving " + 
				"throws against being charmed, and magic can’t put you to " +
				"sleep.");
		racialFeatures.add("Skill Versatility. You gain proficiency in two " +
				"skills of your choice.");
		
		abilityScoreIncrease[5] = 2;
		speed = 30;
		languageProfs = "Common, Elvish";
		
		asiChoice = true;
		nAsi = 2;
		nExtraLanguages = 1;
		skillChoice = true;
		nSkillProfs = 2;
	}
}
