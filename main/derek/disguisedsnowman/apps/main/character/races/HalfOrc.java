package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class HalfOrc extends PlayerRace{
	{
		raceName = "Half-Orc";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Strength score increases by 2, and your Constitution score " +
				"increases by 1.";
		ageDesc = "Age. Half-orcs mature a little faster than humans, " +
				"reaching adulthood around age 14. They age noticeably " +
				"faster and rarely live longer than 75 years.";
		alignmentDesc = "Alignment. Half-orcs inherit a tendency toward " +
				"chaos from their orc parents and are not strongly inclined " +
				"toward good. Half-orcs raised among ores and willing to live" +
				"to live out their lives among them are usually evil.";
		sizeDesc = "Size. Half-orcs are somewhat larger and bulkier than " +
				"humans, and they range from 5 to well over 6 feet tall. " +
				"Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Orc. Orc is a harsh, grating language with hard " +
				"consonants. It has no script of its own but is written " +
				"in the Dwarvish script.";
		source = "PHB";
		
		racialFeatures.add("Darkvision. Thanks to your orc blood, you have " +
				"superior vision in dark and dim conditions. You can see in " +
				"dim light within 60 feet of you as if it were bright " +
				"light, and in darkness as if it were dim light. You can't " +
				"discern color in darkness, only shades of gray.");
		racialFeatures.add("Menacing. You gain proficiency in the\r\n" + 
				"Intimidation skill.");
		racialFeatures.add("Relentless Endurance. When you are reduced to 0 " +
				"hit points but not killed outright, you can drop to 1 hit " +
				"point instead. You can’t use this feature again until you " + 
				"finish a long rest.");
		racialFeatures.add("Savage Attacks. When you score a critical hit " +
				"with a melee weapon attack, you can roll one of the " +
				"weapon’s damage dice one additional time and add it to the " +
				"extra damage of the critical hit.");
		
		abilityScoreIncrease[0] = 2;
		abilityScoreIncrease[2] = 1;
		speed = 30;
		languageProfs = "Common, Orc";
		extraSkillProf = true;
	}
}
