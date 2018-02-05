package derek.disguisedsnowman.apps.main.character.races;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class Dragonborn extends PlayerRace{
	private enum Ancestry{
		BLACK("Acid", "5 by 30 ft. line", "Dexterity"),
		BLUE("Lightning", "5 by 30 ft. line", "Dexterity"),
		BRASS("Fire", "5 by 30 ft. line", "Dexterity"),
		BRONZE("Lightning", "5 by 30 ft. line", "Dexterity"),
		COPPER("Acid", "5 by 30 ft. line", "Dexterity"),
		GOLD("Fire", "15 ft. cone", "Dexterity"),
		GREEN("Poison", "15 ft. cone", "Constitution"),
		RED("Fire", "15 ft. cone", "Dexterity"),
		SILVER("Cold", "15 ft. cone", "Constitution"),
		WHITE("Cold", "15 ft. cone", "Constitution");
		
		private final String damageType, spreadType, saveType;
		Ancestry(String dt, String spt, String st){
			damageType = dt;
			spreadType = spt;
			saveType = st;
		}
		
		public String getDamageType() { return damageType;}
		public String getSpreadType() { return spreadType;}
		public String getSaveType() { return saveType;}
		
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
	
	{
		abilityScoreIncreaseDesc = "Ability Score Increase. Your " +
				"Strength score increases by 2, and your Charisma score " +
				"increases by 1.";
		ageDesc = "Age. Young dragonborn grow quickly. They walk hours " +
				"after hatching, attain the size and development of a " +
				"10-year-old human child by the age of 3, and reach " + 
				"adulthood by 15. They live to be around 80.";
		alignmentDesc = "Alignment. Dragonborn tend to extremes, making a " +
				"conscious choice for one side or the other in the cosmic " +
				"war between good and evil (represented by Bahamut and " +
				"Tiamat, respectively). Most dragonborn are good, but those " +
				"who side with Tiamat can be terrible villains.";
		sizeDesc = "Size. Dragonborn are taller and heavier than humans, " +
				"standing well over 6 feet tall and averaging almost 250 " +
				"pounds. Your size is Medium.";
		speedDesc = "Speed. Your base walking speed is 30 feet.";
		languageDesc = "Languages. You can speak, read, and write Common " +
				"and Draconic. Draconic is thought to be one of the oldest " +
				"languages and is often used in the study of magic. The " + 
				"language sounds harsh to most other creatures and includes " +
				"numerous hard consonants and sibilants.";
		source = "PHB";
		
		abilityScoreIncrease[0] = 2;
		abilityScoreIncrease[5] = 1;
		speed = 30;
		languageProfs = "Common, Draconic";
	}
	
	private Ancestry draconicAncestry;
	
	public Dragonborn(String ancestry) {
		for(Ancestry a: Ancestry.values()) {
			if(a.name().equals(ancestry))
				draconicAncestry = a;
		}
		
		char[] arr;
		arr = draconicAncestry.toString().toCharArray();
		arr[0]-= 32;
		raceName = "";
		for(char cha: arr) {
			raceName+=cha;
		}
		raceName = raceName.concat(" Dragonborn");
		System.out.println(raceName);
		racialFeatures.add("Draconic Ancestry. You have " + draconicAncestry + 
				" dragon ancestry. Your breath weapon and damage resistance " +
				"are determined by the dragon type.");
		racialFeatures.add("Breath Weapon. You can use your action to " +
				"exhale destructive energy. When you use your breath " +
				"weapon, each creature in a "  +draconicAncestry.getSpreadType() +
				" must make a " + draconicAncestry.getSaveType() + " saving " +
				"throw. The DC for this saving throw equals 8 + your " +
				"Constitution modifier + your proficiency bonus. A creature " +
				"takes 2d6 " + draconicAncestry.getDamageType() + " damage " +
				"on a failed save, and half as much damage on a successful " +
				"one. The damage increases to 3d6 at 6th level, 4d6 at 11th " +
				"level, and 5d6 at 16th level. After you use your breath " +
				"weapon, you can’t use it again until you complete a short " +
				"or long rest.");
		racialFeatures.add("Damage Resistance. You have resistance to " + 
				draconicAncestry.getDamageType() + " damage.");
	}
	
	public Ancestry getDA() { return draconicAncestry;}
}
