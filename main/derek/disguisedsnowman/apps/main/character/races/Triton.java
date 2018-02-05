package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Triton extends PlayerRace {
	{
		raceName = "Triton";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Strength, " +
				"Constitution, and Charisma scores each increase by 1.";
		ageDesc = "Age. Tritons reach maturity around age 15 and can live " + 
				"up to 200 years.";
		alignmentDesc = "Alignment. Tritons tend toward lawful good. As " + 
				"guardians of the darkest reaches of the sea, their culture " + 
				"pushes them toward order and benevolence.";
		sizeDesc = "Size. Tritons are slightly sli'orter than humans, " +
				"averaging about 5 feet tall. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet, and you " + 
				"have a swimming speed of 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " + 
				"and Primordial.";
		source = "VG";
		
		racialFeatures.add("Amphibious. You can breathe air and water.");
		racialFeatures.add("Control Air and Water. A child of the sea, you " +
				"can call on the magic of elemental air and water. You can " +
				"cast fog cloud with this trait. Starting at 3rd level, you " +
				"can cast gust of wind with it, and starting at 5th level, " +
				"you can also cast wall of water with it. Once you cast a " +
				"spell with this trait, you can't do so again until you " +
				"finish a long rest. Charisma is your spellcasting ability " +
				"for these spells.");
		racialFeatures.add("Emissary of the Sea. Aquatic beasts have an " +
				"extraordinary affinity with your people. You can " +
				"communicate simple ideas with beasts that can breathe " +
				"water. They can understand the meaning of your words, " +
				"though you have no special ability to understand them in " +
				"return.");
		racialFeatures.add("Guardians of the Depths. Adapted to even the " +
				"most extreme ocean depths, you have resistance to cold " +
				"damage, and you ignore any of the drawbacks caused by a " + 
				"deep, underwater environment.");
		
		abilityScoreIncrease[0] = 1;
		abilityScoreIncrease[2] = 1;
		abilityScoreIncrease[5] = 1;
		speed = 30;
		languageProfs = "Common, Primordial";
	}
}
