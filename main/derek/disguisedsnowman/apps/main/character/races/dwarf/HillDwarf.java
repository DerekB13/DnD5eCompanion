package derek.disguisedsnowman.apps.main.character.races.dwarf;

import derek.disguisedsnowman.apps.main.character.races.Dwarf;

public class HillDwarf extends Dwarf{
	{
		raceName = "Hill Dwarf";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Wisdom score " +
				"increases by 1.";
		source = "PHB";
		
		racialFeatures.add("Dwarven Toughness. Your hit point maximum " +
				"increases by 1, and it increases by 1 every time you gain " +
				"a level.");
		
		abilityScoreIncrease[4] = 1;
		extraHealth = true;
	}
}
