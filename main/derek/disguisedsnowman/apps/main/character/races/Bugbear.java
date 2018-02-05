package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Bugbear extends PlayerRace {
	{
		raceName = "Bugbear";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Strength " +
				"score increases by 2, and your Dexterity score increases " +
				"by 1.";
		ageDesc = "Age. Bugbears reach adulthood at age 16 and live up to " +
				"80 years.";
		alignmentDesc = "Alignment. Bugbears endure a harsh existence that " + 
				"demands each of them to remain self-sufficient, even at " + 
				"the expense of their fellows. They tend to be chaotic evil.";
		sizeDesc = "Size. Bugbears are between 6 and 8 feet tall and weigh" +
				"between 250 and 350 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Goblin.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Long-Limbed. When you make a melee attack on " +
				"your turn, your reach for it is 5 feet greater than normal.");
		racialFeatures.add("Powerful Build. You count as one size larger " +
				"when determining your carrying capacity and the weight you " + 
				"can push, drag, or lift.");
		racialFeatures.add("Sneaky. You are proficient in the Stealth skill.");
		racialFeatures.add("Surprise Attack. If you surprise a creature and " +
				"hit it with an attack on your first turn in combat, the " +
				"attack deals an extra 2d6 damage to it. You can use this " +
				"trait only once per combat.");
		
		abilityScoreIncrease[0] = 2;
		abilityScoreIncrease[1] = 1;
		speed = 30;
		languageProfs = "Common, Goblin";
		
		extraSkillProf = true;
	}
}
