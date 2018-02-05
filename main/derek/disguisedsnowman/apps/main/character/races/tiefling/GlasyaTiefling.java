package derek.disguisedsnowman.apps.main.character.races.tiefling;

import derek.disguisedsnowman.apps.main.character.races.Tiefling;

public class GlasyaTiefling extends Tiefling {
	{
		raceName = "Glasya Tiefling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Charisma score increases by 2, and your Dexterity score " +
				"increases by 1.";
		source = "UA";
		
		racialFeatures.add("Legacy of Malbolge. You know the minor " + 
				"illusion cantrip. When you reach 3rd level, you can cast " + 
				"the disguise self spell once with this trait and regain the " + 
				"ability to do so when you finish a long rest. When you " + 
				"reach 5th level, you can cast the invisibility spell once " + 
				"with this trait and regain the ability to do so when you " + 
				"finish a long rest. Charisma is your spellcasting ability " + 
				"for these spells.");
		
		abilityScoreIncrease[1] = 1;
		abilityScoreIncrease[3] = 0;
	}
}
