package derek.disguisedsnowman.apps.main.character.races.gith;

import derek.disguisedsnowman.apps.main.character.races.Gith;

public class Githyanki extends Gith {
	{
		raceName = "Githyanki";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Strength score increases by 2 and your Intelligence score " +
				"increases by 1.";
		alignmentDesc = "Alignment. Githyanki tend toward lawful evil. They " +
				"are self-centered, violent, and arrogant, yet they remain " +
				"the faithful servants of their lichqueen, Vlaakith. " +
				"Renegade githyanki tend toward chaos as they have forsaken " +
				"her will.";
		
		racialFeatures.add("Decadent Mastery. You learn one language of " +
				"your choice, and you are proficient with one skill or tool " +
				"of your choice. In the timeless city of Tu’narath, " +
				"githyanki have bountiful time to master odd bits of " +
				"knowledge.");
		racialFeatures.add("Martial Prodigy. You are proficient with light " +
				"and medium armor. Your people are ever ready for war.");
		racialFeatures.add("Githyanki Psionics. You know the mage hand " +
				"cantrip. When you reach 3rd level, you can cast jump once " +
				"with this trait, and you regain the ability to do so when " +
				"you finish a long rest. When you reach 5th level, you can " +
				"cast the misty step spell once with this trait, and you " +
				"regain the ability to do so when you finish a long rest. " +
				"Intelligence is your spellcasting ability for these " +
				"spells. You can cast all of them without components.");
		
		abilityScoreIncrease[0] = 2;
	}
}
