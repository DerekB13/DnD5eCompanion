package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public abstract class Gnome extends PlayerRace{
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Intelligence score increases by 2.";
		ageDesc = "Age. Gnomes mature at the same rate humans do, and most " +
				"are expected to settle down into an adult life by around " +
				"age 40. They can live 350 to almost 500 years.";
		alignmentDesc = "Alignment. Gnomes are most often good. Those who " +
				"tend toward law are sages, engineers, researchers, " +
				"scholars, investigators, or inventors. Those who tend " + 
				"toward chaos are minstrels, tricksters, wanderers, or " +
				"fanciful jewelers. Gnomes are good-hearted, and even the " +
				"tricksters among them are more playful than vicious.";
		sizeDesc = "Size. Gnomes are between 3 and 4 feet tall and average " +
				"about 40 pounds. Your size is Small.";
		speedDesc = "Speed. Your base walking speed is 25 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Gnomish. The Gnomish language, which uses the Dwarvish " +
				"script, is renowned for its technical treatises and its " + 
				"catalogs of knowledge about the natural world.";
		
		racialFeatures.add("Darkvision. Accustomed to life underground, you " +
				"have superior vision in dark and dim conditions. You can " +
				"see in dim light within 60 feet of you as if it were " +
				"were bright light, and in darkness as if it were dim " +
				"light. You can't discern color in darkness, only shades of " +
				"gray.");
		racialFeatures.add("Gnome Cunning. You have advantage on all " +
				"Intelligence, Wisdom, and Charisma saving throws against " +
				"magic.");
		
		abilityScoreIncrease[3] = 2;
		speed = 25;
		languageProfs = "Common, Gnomish";
	}
}
