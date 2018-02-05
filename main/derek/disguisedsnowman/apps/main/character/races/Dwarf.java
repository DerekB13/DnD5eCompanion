package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Dwarf extends PlayerRace{
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2.";
		ageDesc = "Age. Dwarves mature at the same rate as humans, but " +
				"they’re considered young until they reach the age of 50. " +
				"On average, they live about 350 years.";
		alignmentDesc = "Alignment. Most dwarves are lawful, believing " +
				"firmly in the benefits of a well-ordered society. They " +
				"tend toward good as well, with a strong sense of fair play " +
				"and a belief that everyone deserves to share in the " +
				"benefits of a just order.";
		sizeDesc = "Size. Dwarves stand between 4 and 5 feet tall and " +
				"average about 150 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 25 feet. Your speed " +
				"is not reduced by wearing heavy armor.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Dwarvish. Dwarvish is full of hard consonants and " +
				"guttural sounds, and those characteristics spill over into " +
				"whatever other language a dwarf might speak.";
		
		racialFeatures.add("Darkvision. Accustomed to life underground, you " +
				"have superior vision in dark and dim conditions. You can " +
				"see in dim light within 60 feet of you as if it were " + 
				"bright light, and in darkness as if it were dim light. You " +
				"can’t discern color in darkness, only shades of gray.");
		racialFeatures.add("Dwarven Resilience. You have advantage on " +
				"saving throws against poison, and you have resistance " +
				"against poison damage.");
		racialFeatures.add("Dwarven Combat Training. You have proficiency " +
				"with the battleaxe, handaxe, throwing hammer, and warhammer.");
		racialFeatures.add("Tool Proficiency. You gain proficiency with the " +
				"artisan’s tools of your choice: smith’s tools, brewer’s " +
				"supplies, or mason’s tools.");
		racialFeatures.add("Stonecunning. Whenever you make an Intelligence " +
				"(History) check related to the origin of stonework, you " +
				"are considered proficient in the History skill and add " +
				"double your proficiency bonus to the check, instead of " +
				"your normal proficiency bonus.");
		
		
		abilityScoreIncrease[2] = 2;
		speed = 25;
		languageProfs = "Common, Dwarvish";
	}
}
