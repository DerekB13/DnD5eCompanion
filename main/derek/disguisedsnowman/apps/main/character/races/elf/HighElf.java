package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class HighElf extends Elf{
	{
		raceName = "High Elf";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Intelligence " +
				"increases by 1";
		source = "PHB";

		racialFeatures.add("Elf Weapon Training. You have proficiency with " +
				"the longsword, shortsword, shortbow, and longbow.");
		racialFeatures.add("Cantrip. You know one cantrip of your choice " +
				"from the wizard spell list. Intelligence is your " +
				"spellcasting ability for it.");
		racialFeatures.add("Extra Language. You can speak, read, and write " +
				"one extra language of your choice.");
		
		abilityScoreIncrease[3] = 1;
		nExtraLanguages = 1;
	}
}
