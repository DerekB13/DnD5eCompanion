package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Changeling extends PlayerRace {
	{
		raceName = "Changeling";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity and Charisma scores increase by 1.";
		sizeDesc = "Size. Changelings are built much like humans, but a " +
				"little leaner. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common and " + 
				"two other languages of your choice.";
		source = "UA";
		
		racialFeatures.add("Duplicity. You gain proficiency in the " +
				"Deception skill.");
		racialFeatures.add("Shapechanger. As an action, you can polymorph " +
				"into any humanoid of your size that you have seen, or back " +
				"into your true form. However, your equipment does not " +
				"change with you. If you die, you revert to your natural " +
				"appearance.");
		
		abilityScoreIncrease[1] = 1;
		abilityScoreIncrease[5] = 1;
		speed = 30;
		languageProfs = "Common";
		
		nExtraLanguages = 2;
		extraSkillProf = true;
	}
}
