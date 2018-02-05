package derek.disguisedsnowman.apps.main.character.races.gnome;

import derek.disguisedsnowman.apps.main.character.races.Gnome;

public class RockGnome extends Gnome {
	{
		raceName = "Rock Gnome";
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Intelligence score increases by 2 and your Constitution " +
				"score increases by 1.";
		source = "PHB";
		
		racialFeatures.add("Artificer’s Lore. Whenever you make an " +
				"Intelligence(History) check related to magic items, " +
				"alchemical objects, or technological devices, you can add " +
				"twice your proficiency bonus, instead of any proficiency " +
				"bonus you normally apply.");
		racialFeatures.add("Tinker. You have proficiency with artisan’s " +
				"tools (tinker’s tools). Using those tools, you can spend 1 " +
				"hour and 10 gp worth of materials to construct a Tiny " + 
				"clockwork device (AC 5, 1 hp). The device ceases to " +
				"function after 24 hours (unless you spend 1 hour repairing " +
				"it to keep the device functioning), or when you use your " + 
				"action to dismantle it; at that time, you can reclaim the " +
				"materials used to create it. You can have up to three such " +
				"devices active at a time. When you create a device, choose " +
				"one of the following options:\r\n" + 
				"Clockwork Toy. This toy is a clockwork animal, monster, or " +
				"person, such as a frog, mouse, bird, dragon, or soldier. " +
				"When placed on the ground, the toy moves 5 feet across the " +
				"ground on each of your turns in a random direction. It " +
				"makes noises as appropriate to the creature it " +
				"represents.\r\n" + 
				"Fire Starter. The device produces a miniature flame, which " +
				"you can use to light a candle, torch, or campfire. Using " +
				"the device requires your action.\r\n" + 
				"Music Box. When opened, this music box plays a single song " +
				"at a moderate volume. The box stops playing when it " +
				"reaches the song’s end or when it is closed.");
		
		abilityScoreIncrease[2] = 1;
	}
}
