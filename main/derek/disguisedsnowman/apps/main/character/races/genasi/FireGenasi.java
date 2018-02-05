package derek.disguisedsnowman.apps.main.character.races.genasi;

import derek.disguisedsnowman.apps.main.character.races.Genasi;

public class FireGenasi extends Genasi {
	{
		raceName = "Fire Genasi";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Intelligence " +
				"score increases by 1.";
		
		racialFeatures.add("Darkvision. You can see in dim light within 60 " +
				"feet of you as if it were bright light, and in darkness as " +
				"if it were dim light. Your ties to the Elemental Plane of " +
				"Fire make your darkvision unusual: everything you see in " +
				"darkness is in a shade of red.");
		racialFeatures.add("Fire Resistance. You have resistance to fire " +
				"damage.");
		racialFeatures.add("Reach to the Blaze. You know the produce flame " + 
				"cantrip. Once you reach 3rd level, you can cast the burning " +
				"hands spell once with this trait as a 1st-level spell, and " + 
				"you regain the ability to cast it this way when you finish " + 
				"a long rest. Constitution is your spellcasting ability for " + 
				"these spells.");
		
		abilityScoreIncrease[3] = 1;
	}
}
