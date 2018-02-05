package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Goliath extends PlayerRace {
	{
		raceName = "Goliath";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Strength " +
				"score increases by 2, and your Constitution score increases " +
				"by 1.";
		ageDesc = "Age. Goliaths have lifespans comparable to humans. They " + 
				"enter adulthood in their late teens and usually live less " + 
				"than a century.";
		alignmentDesc = "Alignment. Goliath society, with its clear roles " +
				"and tasks, has a strong lawful bent. The goliath sense of " +
				"fairness, balanced with an emphasis on self-sufficiency and " + 
				"personal accountability, pushes them toward neutrality.";
		sizeDesc = "Size. Goliaths are between 7 and 8 feet tall and weigh " + 
				"between 280 and 340 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Giant.";
		source = "VG";
		
		racialFeatures.add("Natural Athlete. You have proficiency in the " +
				"Athletics skill.");
		racialFeatures.add("Stone's Endurance. You can focus yourself to " +
				"occasionally shrug off injury. When you take damage, you " + 
				"can use your reaction to roll a dl2. Add your Constitution " + 
				"modifier to the number rolled, and reduce the damage by " + 
				"that total. After you use this trait, you can't use it " + 
				"again until you finish a short or long rest.");
		racialFeatures.add("Powerful Build. You count as one size larger " +
				"when determining your carrying capacity and the weight you " +
				"can push, drag, or lift.");
		racialFeatures.add("Mountain Born. You're acclimated to high " +
				"altitude, including elevations above 20,000 feet. You're " +
				"also naturally adapted to cold climates, as described in " +
				"chapter 5 of the Dungeon Master's Guide.");
		
		abilityScoreIncrease[0] = 2;
		abilityScoreIncrease[2] = 1;
		speed = 30;
		languageProfs = "Common, Giant";
		
		extraSkillProf = true;
	}
}
