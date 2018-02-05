package derek.disguisedsnowman.apps.main.character.races.dwarf;

import derek.disguisedsnowman.apps.main.character.races.Dwarf;

public class MountainDwarf extends Dwarf{
	{
		raceName = "Mountain Dwarf";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Strength score " +
				"increases by 2.";
		source = "PHB";
		
		racialFeatures.add("Dwarven Armor Training. You have proficiency " +
				"with light and medium armor.");
		
		abilityScoreIncrease[0] = 2;
	}
}
