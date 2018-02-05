package derek.disguisedsnowman.apps.main.character.races.elf;

import derek.disguisedsnowman.apps.main.character.races.Elf;

public class Eladrin extends Elf{
	{
		raceName = "Eladrin (Elf)";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Dexterity score increases by 2 and either your Intelligence " +
				"or Charisma score increases by 1.";
		source = "UA";
		
		racialFeatures.add("Fey Step. As a bonus action, you can magically " +
				"teleport up to 30 feet to an unoccupied space you can see. " +
				"Once you use this trait, you can’t do so again until you " +
				"finish a short or long rest.");
		racialFeatures.add("Shifting Seasons. At the end of each short or " +
				"long rest, you can align yourself with the magic of one " +
				"season, regardless of the season that is dominating your " +
				"personality. Doing so allows you to cast a certain cantrip, " +
				"as shown in the Shifting Seasons Cantrips table. When you " +
				"align yourself with a season’s magic, you lose the cantrip " +
				"associated with the previous season and gain the cantrip " +
				"associated with the new season. Your spellcasting ability " +
				"for these cantrips is Intelligence or Charisma, whichever " +
				"is higher.\r\n\n" + 
				"Shifting Seasons Cantrips\r\n" + 
				"Season\tCantrip\r\n" + 
				"Autumn\tFriends\r\n" + 
				"Winter\tChill touch\r\n" + 
				"Spring\tMinor illusion\r\n" + 
				"Summer\tFire bolt");
		
		asiChoice = true;
		nAsi = 1;
	}
}
