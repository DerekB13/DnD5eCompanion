package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Human extends PlayerRace{
	{
		raceName = "Human";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"ability scores each increase by 1.";
		ageDesc = "Age. Humans reach adulthood in their late teens and live " +
				"less than a century.";
		alignmentDesc = "Alignment. Humans tend toward no particular " +
				"alignment. The best and the worst are found among them.";
		sizeDesc = "Size. Humans vary widely in height and build, from " +
				"barely 5 feet to well over 6 feet tall. Regardless of your " +
				"position in that range, your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and one extra language of your choice. Humans typically " +
				"learn the languages of other peoples they deal with, " + 
				"including obscure dialects. They are fond of sprinkling " +
				"their speech with words borrowed from other tongues: Orc " +
				"curses, Elvish musical expressions, Dwarvish military " +
				"phrases, and so on.";
		source = "PHB";
		
		speed = 30;
		languageProfs = "Common";
		setDefaultHuman();
		nExtraLanguages = 1;
	}
	
	public Human(boolean variantRules) {
		if(variantRules)
			setVariantHuman();
	}
	
	public void setDefaultHuman() {
		for(int i = 0; i < 6; i++)
			abilityScoreIncrease[i] = 1;
		
		racialFeatures.clear();
	}
	
	public void setVariantHuman() {
		for(int i = 0; i < 6; i++)
			abilityScoreIncrease[i] = 0;
		
		racialFeatures.clear();
		racialFeatures.add("Skills. You gain proficiency in one skill of " +
				"your choice.");
		racialFeatures.add("Feat. You gain one feat of your choice.");
		
		nAsi = 2;
		nSkillProfs = 1;
	}
}
