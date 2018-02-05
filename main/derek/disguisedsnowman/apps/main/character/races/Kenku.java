package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Kenku extends PlayerRace {
	{
		raceName = "Kenku";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your Dexterity " +
				"score increases by 2, and your Wisdom score increases by 1.";
		ageDesc = "Age. Kenku have shorter lifespans than humans. They " + 
				"reach maturity at about 12 years old and can live to 60.";
		alignmentDesc = "Alignment. Kenku are chaotic creatures, rarely " +
				"making enduring commitments, and they care mostly for " + 
				"preserving their own hides. They are generally chaotic " + 
				"neutral in outlook.";
		sizeDesc = "Size. Kenku are around 5 feet tall and weigh between " + 
				"90 and 120 pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can read and write Common and Auran, " + 
				"but you can speak only by using your Mimicry trait.";
		source = "VG";
		
		racialFeatures.add("Expert Forgery. You can duplicate other " +
				"creatures' handwriting and craftwork. You have advantage on " +
				"all checks made to produce forgeries or duplicates of " +
				"existing objects.");
		racialFeatures.add("Kenku Training. You are proficient in your " +
				"choice of two of the following skills: Acrobatics, " +
				"Deception, Stealth, and Sleight of Hand.");
		racialFeatures.add("Mimicry. You can mimic sounds you have heard, " + 
				"including voices. A creature that hears the sounds you " + 
				"make can tell they are imitations with a successful Wisdom " + 
				"(Insight) check opposed by your Charisma (Deception) check.");
		
		abilityScoreIncrease[1] = 2;
		abilityScoreIncrease[4] = 1;
		speed = 30;
		languageProfs = "Common, Auran";
		
		skillChoice = true;
	}
}
