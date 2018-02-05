package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Elf extends PlayerRace{
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2.";
		ageDesc = "Although elves reach physical maturity at about the same " +
				"age as humans, the elven understanding of adulthood goes " +
				"beyond physical growth to encompass worldly experience. An " +
				"elf typically claims adulthood and an adult name around " +
				"the age of 100 and can live to be 750 years old.";
		alignmentDesc = "Alignment. Elves love freedom, variety, and self " +
				"expression, so they lean strongly toward the gentler " +
				"aspects of chaos. They value and protect others\' freedom " +
				"as well as their own, and they are more often good than " +
				"not. The drow are an exception; their exile into the " +
				"Underdark has made them vicious and dangerous. Drow are " +
				"more often evil than not.";
		sizeDesc = "Size. Elves range from under 5 to over 6 feet tall and " +
				"have slender builds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Elvish. Elvish is fluid, with subtle intonations and " +
				"intricate grammar. Elven literature is rich and varied, " +
				"and their songs and poems are famous among other races. " +
				"Many bards learn their language so they can add Elvish " +
				"ballads to their repertoires.";
		
		racialFeatures.add("Darkvision. Accustomed to twilit forests and " +
				"the night sky, you have superior vision in dark and dim " +
				"conditions. You can see in dim light within 60 feet of " +
				"you as if it were bright light, and in darkness as if it " +
				"were dim light. You can’t discern color in darkness, only " +
				"shades of gray.");
		racialFeatures.add("Keen Senses. You have proficiency in the " +
				"Perception skill.");
		racialFeatures.add("Fey Ancestry. You have advantage on saving " +
				"throws against being charmed, and magic can’t put you to " +
				"sleep.");
		racialFeatures.add("Trance. Elves don’t need to sleep. Instead, " +
				"they meditate deeply, remaining semiconscious, for 4 hours " +
				"a day. (The Common word for such meditation is “trance.”) " +
				"While meditating, you can dream after a fashion; such " +
				"dreams are actually mental exercises that have become " +
				"reflexive through years of practice. After resting in this " +
				"way, you gain the same benefit that a human does from 8 " +
				"hours of sleep.");
		
		abilityScoreIncrease[1] = 2;
		speed = 30;
		languageProfs = "Common, Elvish";
		extraSkillProf = true;
		
	}
}
