package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class YuanTiPureblood extends PlayerRace {
	{
		raceName = "Yuan-Ti Pureblood";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Charisma " +
				"score increases by 2, and your Intelligence score increases " +
				"by 1.";
		ageDesc = "Age. Purebloods mature at the same rate as humans and " + 
				"have lifespans similar in length to theirs.";
		alignmentDesc = "Alignment. Purebloods are devoid of emotion and " +
				"see others as tools to manipulate. They care little for " +
				"law or chaos and are typically neutral evil.";
		sizeDesc = "Size. Purebloods match humans in average size and " + 
				"weight. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common, " + 
				"Abyssal, and Draconic.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Innate Spellcastins. You know the poison spray " + 
				"cantrip. You can cast animal friendship an unlimited " + 
				"number of times with this trait, but you can target only " + 
				"snakes with it. Starting at 3rd level, you can also cast " + 
				"suggestion with this trait. Once you cast it, you can't do " + 
				"so again until you finish a long rest. Charisma is your " + 
				"spellcasting ability for these spells.");
		racialFeatures.add("Magic Resistance. You have advantage on saving " + 
				"throws against spells and other magical effects.");
		racialFeatures.add("Poison Immunity. You are immune to poison " +
				"damage and the poisoned condition.");
		
		abilityScoreIncrease[3] = 1;
		abilityScoreIncrease[5] = 2;
		speed = 30;
		languageProfs = "Common, Abyssal, Draconic";
	}
}
