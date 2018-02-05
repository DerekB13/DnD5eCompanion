package derek.disguisedsnowman.apps.main.character.races.tiefling;

import derek.disguisedsnowman.apps.main.character.races.Tiefling;

public class DispaterTiefling extends Tiefling {
	{
		raceName = "Dispater Tiefling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Charisma score increases by 2, and your Dexterity score " +
				"increases by 1.";
		source = "UA";
		
		racialFeatures.add("Legacy of Dis. You know the thaumaturgy " +
				"cantrip. When you reach 3rd level, you can cast the " +
				"disguise self spell once with this trait and regain the " + 
				"ability to do so when you finish a long rest. When you " +
				"reach 5th level, you can cast the invisibility spell once " +
				"with this trait and regain the ability to do so when you " +
				"finish a long rest. Charisma is your spellcasting ability " +
				"for these spells.");
		
		abilityScoreIncrease[1] = 1;
		abilityScoreIncrease[3] = 0;
	}
}
