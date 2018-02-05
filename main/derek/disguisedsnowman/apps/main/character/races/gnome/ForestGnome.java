package derek.disguisedsnowman.apps.main.character.races.gnome;

import derek.disguisedsnowman.apps.main.character.races.Gnome;

public class ForestGnome extends Gnome {
	{
		raceName = "Forest Gnome";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Intelligence score increases by 2 and your Dexterity score " +
				"increases by 1.";
		source = "PHB";
		
		racialFeatures.add("Natural Illusionist. You know the minor " +
				"illusion cantrip. Intelligence is your spellcasting " +
				"ability for it.");
		racialFeatures.add("Speak with Small Beasts. Through sounds and " +
				"gestures, you can communicate simple ideas with Small or " +
				"smaller beasts. Forest gnomes love animals and often keep " + 
				"squirrels, badgers, rabbits, moles, woodpeckers, and other " +
				"creatures as beloved pets.");
		
		abilityScoreIncrease[1] = 1;
	}
}
