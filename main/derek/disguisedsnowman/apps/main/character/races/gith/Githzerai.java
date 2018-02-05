package derek.disguisedsnowman.apps.main.character.races.gith;

import derek.disguisedsnowman.apps.main.character.races.Gith;

public class Githzerai extends Gith {
	{
		raceName = "Githzerai";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Wisdom score increases by 2 and your Intelligence score " +
				"increases by 1.";
		alignmentDesc = "Alignment. Githzerai tend toward lawful neutral. " + 
				"Their rigorous training in psychic abilities requires an " +
				"implacable mental discipline.";
		
		racialFeatures.add("Monastic Training. You gain a +1 bonus to AC " + 
				"while you aren’t wearing medium or heavy armor and aren't " +
				"using a shield. All githzerai receive basic training from " +
				"monks, and the monks among them are unmatched in their " + 
				"defensive abilities.");
		racialFeatures.add("Githzerai Psionics. You know the mage hand " + 
				"cantrip. When you reach 3rd level, you can cast shield " + 
				"once with this trait, and you regain the ability to do so " + 
				"when you finish a long rest. When you reach 5th level, you " +
				"can cast the detect thoughts spell once with this trait, " +
				"and you regain the ability to do so when you finish a long " +
				"rest. Wisdom is your spellcasting ability for these " +
				"spells. You can cast all of them without components.");
		
		abilityScoreIncrease[4] = 2;
		extraAc = true;
	}
	
	/* TO DO: Add method to check whether the character is wearing medium or
	 * heavy armour or is wielding a shield.
	 */
}
