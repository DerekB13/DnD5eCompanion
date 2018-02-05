package derek.disguisedsnowman.apps.main.character.races.aasimar;

import derek.disguisedsnowman.apps.main.character.races.Aasimar;

public class FallenAasimar extends Aasimar {
	{
		raceName = "Fallen Aasimar";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Charisma " +
				"score increases by 2 and your Strength score increases by 1.";
		
		racialFeatures.add("Necrotic Shroud. Starting at 3rd level, you can " +
				"use your action to unleash the divine energy within " +
				"yourself, causing your eyes to turn into pools of darkness " +
				"and two skeletal, ghostly, flightless wings to sprout from " +
				"your back. The instant you transform, other creatures " +
				"within 10 feet of you that can see you must each succeed on " +
				"a Charisma saving throw (DC 8 + your proficiency bonus + " + 
				"your Charisma modifier) or become frightened of you until " + 
				"the end of your next turn.\r\n" + 
				"Your transformation lasts for 1 minute or until you end it " + 
				"as a bonus action. During it, once on each of your turns, " + 
				"you can deal extra necrotic damage to one target when you " + 
				"deal damage to it with an attack or a spell. The extra " +
				"necrotic damage equals your level.\r\n" + 
				"Once you use this trait, you can't use it again until you " + 
				"finish a long rest.");
		
		abilityScoreIncrease[0] = 1;
	}
}
