package derek.disguisedsnowman.apps.main.character.races.genasi;

import derek.disguisedsnowman.apps.main.character.races.Genasi;

public class EarthGenasi extends Genasi {
	{
		raceName = "Earth Genasi";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Strength score " +
				"increases by 1.";
		
		racialFeatures.add("Earth Walk. You can move across difficult " + 
				"terrain made of earth or stone without expending extra " + 
				"movement.");
		racialFeatures.add("Merge with Stone. You can cast the pass without " +
				"trace spell once with this trait, requiring no material " +
				"components, and you regain the ability to cast it this way " + 
				"when you finish a long rest. Constitution is your " + 
				"spellcasting ability for this spell.");
		
		abilityScoreIncrease[0] = 1;
		
	}
}
