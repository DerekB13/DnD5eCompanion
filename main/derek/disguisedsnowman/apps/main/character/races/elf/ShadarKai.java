package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class ShadarKai extends Elf{
	{
		raceName = "Shadar-Kai (Elf)";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Charisma score " +
				"increases by 1.";
		source = "UA";
		
		racialFeatures.add("Cantrip. You know one of the following cantrips " +
				"of your choice: chill touch, spare the dying, or " +
				"thaumaturgy. Charisma is your spellcasting ability for it.");
		racialFeatures.add("Blessing of the Raven Queen. As a bonus action, " +
				"you can magically teleport up to 15 feet to an unoccupied " +
				"space you can see, and you gain resistance to all damage " +
				"until the start of your next turn. During that time, you " +
				"appear ghostly and translucent. Once you use this ability, " +
				"you can’t use it again until you finish a short or " +
				"long rest.");
		
		abilityScoreIncrease[5] = 1;
	}
}
