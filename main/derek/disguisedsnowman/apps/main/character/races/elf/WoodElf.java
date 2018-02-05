package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class WoodElf extends Elf{
	{
		raceName = "Wood Elf";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Wisdom increases " +
				"by 1";
		source = "PHB";

		racialFeatures.add("Elf Weapon Training. You have proficiency with " +
				"the longsword, shortsword, shortbow, and longbow.");
		racialFeatures.add("Fleet of Foot. Your base walking speed " +
				"increases to 35 feet.");
		racialFeatures.add("Mask of the Wild. You can attempt to hide even " +
				"when you are only lightly obscured by foliage, heavy rain, " +
				"falling snow, mist, and other natural phenomena.");
		
		abilityScoreIncrease[4] = 1;
		speed = 35;
	}
}
