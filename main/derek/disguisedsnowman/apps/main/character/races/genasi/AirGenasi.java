package derek.disguisedsnowman.apps.main.character.races.genasi;

import derek.disguisedsnowman.apps.main.character.races.Genasi;

public class AirGenasi extends Genasi {
	{
		raceName = "Air Genasi";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Dexterity score " +
				"increases by 1.";
		
		racialFeatures.add("Unending Breath. You can hold your breath " + 
				"indefinitely while you’re not incapacitated.");
		racialFeatures.add("Mingle with the Wind. You can cast the levitate " +
				"spell once with this trait, requiring no material " +
				"components, and you regain the ability to cast it this way " +
				"when you finish a long rest. Constitution is your " +
				"spellcasting ability for this spell.");
		
		abilityScoreIncrease[1] = 1;
	}
}
