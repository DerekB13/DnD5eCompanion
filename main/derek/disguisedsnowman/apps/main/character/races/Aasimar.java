package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Aasimar extends PlayerRace {
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Charisma " +
				"score increases by 2.";
		ageDesc = "Age. Aasimar mature at the same rate as humans, but they " + 
				"can live up to 160 years.";
		alignmentDesc = "Alignment. Imbued with celestial power, most " +
				"aasimar are good. Outcast aasimar are most often neutral " +
				"or even evil.";
		sizeDesc = "Size. Aasimar have the same range of height and weight " + 
				"as humans.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Celestial.";
		source = "VG";
		
		racialFeatures.add("Darkvision. Blessed with a radiant soul, your " +
				"vision can easily cut through darkness. You can see in dim " + 
				"light within 60 feet of you as if it were bright light, and " +
				"in darkness as if it were dim light. You can't discern " +
				"color in darkness, only shades of gray.");
		racialFeatures.add("Celestial Resistance. You have resistance to " +
				"necrotic damage and radiant damage.");
		racialFeatures.add("Healing Hands. As an action, you can touch a " +
				"creature and cause it to regain a number of hit points " + 
				"equal to your level. Once you use this trait, you can't " +
				"use it again until you finish a long rest.");
		racialFeatures.add("Light Bearer. You know the light cantrip. " +
				"Charisma is your spellcasting ability for it.");
		
		abilityScoreIncrease[5] = 2;
		speed = 30;
		languageProfs = "Common, Celestial";
	}
}
