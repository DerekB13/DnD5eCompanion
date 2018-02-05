package derek.disguisedsnowman.apps.main.character.races.aasimar;

import derek.disguisedsnowman.apps.main.character.races.Aasimar;

public class ProtectorAasimar extends Aasimar {
	{
		raceName = "Protector Aasimar";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Charisma " +
				"score increases by 2 and your Wisdom score increases by 1.";
		
		racialFeatures.add("Radiant Soul. Starting at 3rd level, you can use " +
				"your action to unleash the divine energy within yourself, " + 
				"causing your eyes to glimmer and two luminous, incorporeal " + 
				"wings to sprout from your back.\r\n" + 
				"Your transformation lasts for 1 minute or until you end it " + 
				"as a bonus action. During it, you have a flying speed of 30 " + 
				"feet, and once on each of your turns, you can deal extra " + 
				"radiant damage to one target when you deal damage to it " + 
				"with an attack or a spell. The extra radiant damage equals " + 
				"your level.\r\n" + 
				"Once you use this trait, you can't use it again until you " + 
				"finish a long rest.");
		
		abilityScoreIncrease[4] = 1;
	}
}
