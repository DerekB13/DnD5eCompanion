package derek.disguisedsnowman.apps.main.character.races.genasi;

import derek.disguisedsnowman.apps.main.character.races.Genasi;

public class WaterGenasi extends Genasi {
	{
		raceName = "Water Genasi";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Wisdom score " +
				"increases by 1.";
		
		racialFeatures.add("Acid Resistance. You have resistance to acid " +
				"damage.");
		racialFeatures.add("Amphibious. You can breathe air and water.");
		racialFeatures.add("Swim. You have a swimming speed of 30 feet.");
		racialFeatures.add("Call to the Wave. You know the shape water " + 
				"cantrip (see chapter 2). When you reach 3rd level, you can " +
				"cast the create or destroy water spell as a 2nd-level spell " +
				"once with this trait, and you regain the ability to cast it " + 
				"this way when you finish a long rest. Constitution is your " + 
				"spellcasting ability for these spells.");
		
		abilityScoreIncrease[4] = 1;
	}
}
