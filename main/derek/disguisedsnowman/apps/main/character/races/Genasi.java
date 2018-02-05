package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Genasi extends PlayerRace {
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2.";
		ageDesc = "Age. Genasi mature at about the same rate as " +
				"humans and reach adulthood in their late teens. They live " + 
				"somewhat longer than humans do, up to 120 years.";
		alignmentDesc = "Alignment. Independent and self-reliant, genasi " +
				"tend toward a neutral alignment.";
		sizeDesc = "Size. Genasi are as varied as their mortal parents but " + 
				"are generally built like humans, standing anywhere from 5 " +
				"feet to over 6 feet tall. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Primordial. Primordial is a guttural language, filled " + 
				"with harsh syllables and hard consonants.";
		source = "EE";
		
		abilityScoreIncrease[2] = 2;
		speed = 30;
		languageProfs = "Common, Primordial";
	}
}
