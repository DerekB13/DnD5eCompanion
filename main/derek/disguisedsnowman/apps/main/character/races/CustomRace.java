package derek.disguisedsnowman.apps.main.character.races;

import java.io.Serializable;
import java.util.LinkedList;
import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class CustomRace extends PlayerRace implements Serializable{
	
	private static final long serialVersionUID = 4441518994519064138L;
	{
		source = "C";
	}
	
	public CustomRace(String name, String asiD, String ageD, String alignD, 
			String sizeD, String speedD, String languageD, int[] a, int speed, 
			String languages, LinkedList<String> feats) {
		raceName = name;
		abilityScoreIncreaseDesc = asiD;
		ageDesc = ageD;
		alignmentDesc = alignD;
		sizeDesc = sizeD;
		speedDesc = speedD;
		languageDesc = languageD;
		abilityScoreIncrease = a;
		this.speed = speed;
		languageProfs = languages;
		racialFeatures = feats;
	}
}
