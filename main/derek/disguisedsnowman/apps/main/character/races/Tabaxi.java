package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Tabaxi extends PlayerRace {
	{
		raceName = "Tabaxi";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2, and your Charisma score increases by 1.";
		ageDesc = "Age. Tabaxi have lifespans equivalent to humans.";
		alignmentDesc= "Ali;nment. Tabaxi tend toward chaotic alignments, " + 
				"as they let impulse and fancy guide their decisions. They " + 
				"are rarely evil, with most of them driven by curiosity " + 
				"rather than greed or other dark impulses.";
		sizeDesc = "Size. Tabaxi are taller on average than humans and " + 
				"relatively slender. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and one other language of your choice.";
		source = "VG";
		
		racialFeatures.add("Darkvision. You have a cat's keen senses, " +
				"especially in the dark. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. You can't discern color in darkness, " +
				"only shades of gray.");
		racialFeatures.add("Feline Agility. Your reflexes and agility allow " +
				"you to move with a burst of speed. When you move on your " + 
				"turn in combat, you can double your speed until the end of " + 
				"the turn. Once you use this trait, you can't use it again " + 
				"until you move 0 feet on one of your turns.");
		racialFeatures.add("Cat's Claws. Because of your claws, you have a " +
				"climbing speed of 20 feet. In addition, your claws are " +
				"natural weapons, which you can use to make unarmed strikes. " + 
				"If you hit with them, you deal slashing damage equal to " + 
				"ld4 + your Strength modifier, instead of the bludgeoning " + 
				"damage normal for an unarmed strike.");
		racialFeatures.add("Cat's Talent. You have proficiency in the " +
				"Perception and Stealth skills.");
		
		abilityScoreIncrease[1] = 2;
		abilityScoreIncrease[5] = 1;
		speed = 30;
		languageProfs = "Common";
		
		nExtraLanguages = 1;
		extraSkillProf = true;
	}
}
