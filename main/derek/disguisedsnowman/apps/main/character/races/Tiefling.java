package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Tiefling extends PlayerRace {
	{
		raceName = "Tiefling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Intelligence score increases by 1, and your Charisma score " +
				"increases by 2.";
		ageDesc = "Age. Tieflings mature at the same rate as humans but live " +
				"a few years longer.";
		alignmentDesc = "Alignment. Tieflings might not have an innate " +
				"tendency toward evil, but many of them end up there. Evil " +
				"or not, an independent nature inclines many tieflings " +
				"toward a chaotic alignment.";
		sizeDesc = "Size. Tieflings are about the same size and build as " +
				"humans. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Infernal.";
		source = "PHB";
		
		racialFeatures.add("Darkvision. Thanks to your infernal heritage, " +
				"you have superior vision in dark and dim conditions. You " +
				"can see in dim light within 60 feet of you as if it were " + 
				"bright light, and in darkness as if it were dim light. You " +
				"can’t discern color in darkness, only shades of gray.");
		racialFeatures.add("Hellish Resistance. You have resistance to fire " +
				"damage.");
		
		abilityScoreIncrease[3] = 1;
		abilityScoreIncrease[5] = 2;
		speed = 30;
		languageProfs = "Common, Infernal";
	}
	protected Tiefling() {
		
	}
	
	public Tiefling(boolean ua) {
		racialFeatures.add("Infernal Legacy. You know the thaumaturgy " +
				"cantrip. Once you reach 3rd level, you can cast the " +
				"hellish rebuke spell once per day as a 2nd-level spell. " + 
				"Once you reach 5th level, you can also cast the darkness " +
				"spell once per day. Charisma is your spellcasting ability " +
				"for these spells.");
		if(ua) {
			raceName = "Asmodeus Tiefling";
			source = "UA";
		}
	}
}
