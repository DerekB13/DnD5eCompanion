package derek.disguisedsnowman.apps.main.character.races.tiefling;

import derek.disguisedsnowman.apps.main.character.races.Tiefling;

public class LevistusTiefling extends Tiefling {
	{
		raceName = "Levistus Tiefling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Charisma score increases by 2, and your Constitution score " + 
				"increases by 1.";
		source = "UA";
		
		racialFeatures.add("Legacy of Stygia. You know the ray of frost " + 
				"cantrip. When you reach 3rd level, you can cast the armor " + 
				"of Agathys spell as a 2nd-level spell once with this trait " + 
				"and regain the ability to do so when you finish a long " + 
				"rest. When you reach 5th level, you can cast the darkness " + 
				"spell once with this trait and regain ther ability to do so " + 
				"when you finish a long rest. Charisma is your spellcasting " + 
				"ability for these spells.");
		
		abilityScoreIncrease[2] = 1;
		abilityScoreIncrease[3] = 0;
	}
}
