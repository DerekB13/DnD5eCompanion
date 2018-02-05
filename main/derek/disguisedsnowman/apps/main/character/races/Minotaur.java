package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Minotaur extends PlayerRace {
	{
		raceName = "Minotaur";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Strength " +
				"score increases by 1.";
		ageDesc = "Age. Minotaurs enter adulthood at around the age of 17 " + 
				"and can live up to 150 years.";
		alignmentDesc = "Alignment. Minotaurs believe in a strict code of " +
				"honor, and thus tend toward law. They are loyal to the " +
				"death and make implacable enemies, even as their brutal " +
				"culture and disdain for weakness push them toward evil.";
		sizeDesc = "Size. Minotaurs typically stand well over 6 feet tall " +
				"and weigh an average of 300 pounds. Your size is Medium.";	
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common.";
		source = "UA";
		
		racialFeatures.add("Conqueror’s Virtue. From a young age, you " +
				"focused on one of the three virtues of strength, cunning, " +
				"or intellect. Your choice of your Strength, Intelligence, " +
				"or Wisdom score increases by 1.");
		racialFeatures.add("Horns. You are never unarmed. You are proficient " +
				"with your horns, which are a melee weapon that deals 1d10 " + 
				"piercing damage. Your horns grant you advantage on all " + 
				"checks made to shove a creature, but not to avoid being " + 
				"shoved yourself.");
		racialFeatures.add("Goring Rush. When you use the Dash action during " +
				"your turn, you can make a melee attack with your horns as a " +
				"bonus action.");
		racialFeatures.add("Hammering Horns. When you use the Attack action " + 
				"during your turn to make a melee attack, you can attempt to " + 
				"shove a creature with your horns as a bonus action. You " + 
				"cannot use this shove attempt to knock a creature prone.");
		racialFeatures.add("Labyrinthine Recall. You can perfectly recall " +
				"any path you have traveled.");
		racialFeatures.add("Sea Reaver. You gain proficiency with " +
				"navigator’s tools and vehicles (water).");
		
		abilityScoreIncrease[0] = 1;
		speed = 30;
		languageProfs = "Common";
		
		asiChoice = true;
		nAsi = 1;
	}
}
