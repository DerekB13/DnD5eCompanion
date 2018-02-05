package derek.disguisedsnowman.apps.main.character.races.aasimar;

import derek.disguisedsnowman.apps.main.character.races.Aasimar;

public class ScourgeAasimar extends Aasimar {
	{
		raceName = "Scourge Aasimar";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Charisma " +
				"score increases by 2 and your Constitution score increases " +
				"by 1.";
		
		racialFeatures.add("Radiant Consumption. Starting at 3rd level, you " +
				"can use your action to unleash the divine energy within " +
				"yourself, causing a searing light to radiate from you, pour " +
				"out of your eyes and mouth, and threaten to char you.\r\n" + 
				"Your transformation lasts for 1 minute or until you end it " + 
				"as a bonus action. During it, you shed bright light in a " + 
				"10-foot radius and dim light for an additional 10 feet, and " +
				"at the end of each of your turns, you and each creature " + 
				"within 10 feet of you take radiant damage equal to half " + 
				"your level (rounded up). In addition, once on each of your " + 
				"turns, you can deal extra radiant damage to one target when " + 
				"you deal damage to it with an attack or a spell. The extra " + 
				"radiant damage equals your level.\r\n" + 
				"Once you use this trait, you can't use it again until you " + 
				"finish a long rest.");
		
		abilityScoreIncrease[4] = 1;
	}
}
