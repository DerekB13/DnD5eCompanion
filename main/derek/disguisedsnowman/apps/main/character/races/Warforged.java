package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Warforged extends PlayerRace {
	{
		raceName = "Warforged";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Strength " +
				"and Constitution scores increase by 1.";
		sizeDesc = "Size. Warforged are generally broader and heavier than " + 
				"humans. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common and " + 
				"one other language of your choice.";
		source = "UA";
		
		racialFeatures.add("Composite Plating. Your construction " + 
				"incorporates wood and metal, granting you a +1 bonus to " +
				"Armor Class.");
		racialFeatures.add("Living Construct. Even though you were " +
				"constructed, you are a living creature. You are immune to " +
				"disease. You do not need to eat or breathe, but you can " +
				"ingest food and drink if you wish.\r\n" + 
				"Instead of sleeping, you enter an inactive state for 4 " +
				"hours each day. You do not dream in this state; you are " +
				"fully aware of your surroundings and notice approaching " +
				"enemies and other events as normal.");
		
		abilityScoreIncrease[0] = 1;
		abilityScoreIncrease[2] = 1;
		speed = 30;
		languageProfs = "Common";
		
		extraAc = true;
		nExtraLanguages = 1;
	}
}
