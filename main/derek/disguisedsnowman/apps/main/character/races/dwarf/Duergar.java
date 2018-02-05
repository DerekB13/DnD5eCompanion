package derek.disguisedsnowman.apps.main.character.races.dwarf;

import derek.disguisedsnowman.apps.main.character.races.Dwarf;

public class Duergar extends Dwarf{
	{
		raceName = "Duergar (Dwarf)";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Constitution score increases by 2 and your Strength score " +
				"increases by 1.";
		languageDesc = "Languages. You can speak, read, and write Common, " +
				"Dwarvish, and Undercommon. Dwarvish is full of hard " +
				"consonants and guttural sounds, and those characteristics " +
				"spill over into whatever other language a dwarf might speak.";
		source = "SCAG";
		
		racialFeatures.set(0, "Darkvision. Accustomed to life underground, " +
				"you have superior vision in dark and dim conditions. You " +
				"can see in dim light within 120 feet of you as if it were " + 
				"bright light, and in darkness as if it were dim light. You " +
				"can’t discern color in darkness, only shades of gray.");
		racialFeatures.add("Duergar Resilience. You have advantage on " +
				"saving throws against illusions and against being charmed " +
				"or paralyzed.");
		racialFeatures.add("Duergar Magic. When you reach 3rd level, you " +
				"can cast the enlarge/reduce spell on yourself once with " +
				"this trait, using only the spell's enlarge option. When " + 
				"you reach 5th level, you can cast the invisibility spell " +
				"on yourself once with this trait. You don't need material " +
				"components for either spell, and you can't cast them while " +
				"you're in direct sunlight, although sunlight has no effect " + 
				"on them once cast. You regain the ability to cast these " +
				"spells with this trait when you finish a long rest. " +
				"Intelligence is your spellcasting ability for these spells.");
		racialFeatures.add("Sunlight Sensitivity. You have disadvantage on " +
				"attack rolls and on Wisdom (Perception) checks that rely " +
				"on sight when you, the target of your attack, or whatever " +
				"you are trying to perceive is in direct sunlight.");
		
		
		abilityScoreIncrease[0] = 1;
		languageProfs = languageProfs.concat(", Undercommon");
	}
}
