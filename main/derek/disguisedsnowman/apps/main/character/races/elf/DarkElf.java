package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class DarkElf extends Elf{
	{
		raceName = "Dark Elf (Drow)";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and your Charisma score " +
				"increases by 1.";
		source = "PHB";
				
		racialFeatures.set(0, "Darkvision. Accustomed to life underground, " +
				"you have superior vision in dark and dim conditions. " +
				"You can see in dim light within 120 feet of you as if it " +
				"were bright light, and in darkness as if it were dim light. " +
				"You can’t discern color in darkness, only shades of gray.");
		racialFeatures.add("Sunlight Sensitivity. You have disadvantage on " +
				"attack rolls and on Wisdom (Perception) checks that rely " +
				"on sight when you, the target of your attack, or whatever " +
				"you are trying to perceive is in direct sunlight.");
		racialFeatures.add("Drow Magic. You know the dancing lights " +
				"cantrip. When you reach 3rd level, you can cast the faerie " +
				"fire spell once per day. When you reach 5th level, you can " +
				"also cast the darkness spell once per day. Charisma is " +
				"your spellcasting ability for these spells.");
		racialFeatures.add("Drow Weapon Training. You have proficiency with " +
				"rapiers, shortswords, and hand crossbows.");
		
		abilityScoreIncrease[5] = 1;
	}
}
