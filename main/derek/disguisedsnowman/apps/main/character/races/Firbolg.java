package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Firbolg extends PlayerRace {
	{
		raceName = "Firbolg";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Wisdom " +
				"score increases by 2, and your Strength score increases by 1.";
		ageDesc = "Age. As humanoids related to the fey, firbolg have long " + 
				"lifespans. A firbolg reaches adulthood around 30, and the " + 
				"oldest of them can live for 500 years.";
		alignmentDesc = "Alignment. As people who follow the rhythm of " +
				"nature and see themselves as its caretakers, firbolg are " + 
				"typically neutral good. Evil firbolg are rare and are " +
				"usually the sworn enemies of the rest of their kind.";
		sizeDesc = "Size. Firbolg are between 7 and 8 feet tall and weigh " + 
				"between 240 and 300 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common, " + 
				"Elvish, and Giant.";
		source = "VG";
		
		racialFeatures.add("Firbolg Magic. You can cast detect magic and " +
				"disguise self with this trait, using Wisdom as your " +
				"spellcasting ability for them. Once you cast either spell, " +
				"you can't cast it again with this trait until you finish a " +
				"short or long rest. When you use this version of disguise " +
				"self, you can seem up to 3 feet shorter than normal, " +
				"allowing you to more easily blend in with humans and elves.");
		racialFeatures.add("Hidden Step. As a bonus action, you can " +
				"magically turn invisible until the start of your next turn " +
				"or until you attack, make a damage roll, or force someone " +
				"to make a saving throw. Once you use this trait, you can't " + 
				"use it again until you finish a short or long rest.");
		racialFeatures.add("Powerful Build. You count as one size larger " +
				"when determining your carrying capacity and the weight you " + 
				"can push, drag, or lift.");
		racialFeatures.add("Speech of Beast and Leaf. You have the ability " +
				"to communicate in a limited manner with beasts and plants. " + 
				"They can understand the meaning of your words, though you " + 
				"have no special ability to understand them in return. You " + 
				"have advantage on all Charisma checks you make to " +
				"influence them.");
		
		abilityScoreIncrease[0] = 1;
		abilityScoreIncrease[4] = 2;
		speed = 30;
		languageProfs = "Common, Elvish, Giant";
	}
}
