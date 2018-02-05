package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Lizardfolk extends PlayerRace {
	{
		raceName = "Lizardfolk";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2, and your Wisdom score " +
				"increases by 1.";
		ageDesc = "Age. Lizardfolk reach maturity arqund age 14 and rarely " + 
				"live longer than 60 years.";
		alignmentDesc = "Alignment. Most lizardfolk are neutral. They see " +
				"the world as a place of predators and prey, where life and " + 
				"death are natural processes. They wish only to survive, " + 
				"and prefer to leave other creatures to their own devices.";
		sizeDesc = "Size. Lizardfolk are a little bulkier and taller than " + 
				"humans, and their colorful frills make them appear even " + 
				"larger. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet, and you " + 
				"have a swimming speed of 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Draconic.";
		source = "VG";
		
		racialFeatures.add("Bite. Your fanged maw is a natural weapon, " +
				"which you can use to make unarmed strikes. If you hit with " +
				"it, you deal piercing damage equal to ld6 + your Strength " +
				"modifier, instead of the bludgeoning damage normal for an " + 
				"unarmed strike.");
		racialFeatures.add("Cunning Artisan. As part of a short rest, you " +
				"can harvest bone and hide from a slain beast, construct, " +
				"dragon, monstrosity, or plant creature of size Small or " +
				"larger to create one of the following items: a shield, a " +
				"club, a javelin, or ld4 darts or blowgun needles. To use " +
				"this trait, you need a blade, such as a dagger, or " +
				"appropriate artisan's tools, such as leatherworker's tools.");
		racialFeatures.add("Hold Breath. You can hold your breath for up to " +
				"15 minutes at a time.");
		racialFeatures.add("Hunter's Lore. You gain proficiency with two of " +
				"the following skills of your choice: Animal Handling, " +
				"Nature, Perception, Stealth, and Survival.");
		racialFeatures.add("Natural Armor. You have tough, scaly skin. When " +
				"you aren't wearing armor, your AC is 13 + your Dexterity " + 
				"modifier. You can use your natural armor to determine your " + 
				"AC if the armor you wear would leave you with a lower AC. " + 
				"A shield's benefits apply as normal while you use your " + 
				"natural armor.");
		racialFeatures.add("Hungry Jaws. In battle, you can throw yourself " +
				"into a vicious feeding frenzy. As a bonus action, you can " +
				"make a special attack with your bite. If the attack hits, " +
				"it deals its normal damage, and you gain temporary hit " +
				"points (minimum of 1) equal to your Constitution modifier, " +
				"and you can't use this trait again until you finish a " +
				"short or long rest.");
		
		abilityScoreIncrease[2] = 2;
		abilityScoreIncrease[4] = 1;
		speed = 30;
		languageProfs = "Common, Draconic";
		
		skillChoice = true;
		nSkillProfs = 2;
		extraAc = true;
	}
}
