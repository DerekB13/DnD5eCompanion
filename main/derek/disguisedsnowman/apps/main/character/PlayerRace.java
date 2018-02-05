package derek.disguisedsnowman.apps.main.character;

import java.io.Serializable;
import java.util.LinkedList;

public abstract class PlayerRace implements Serializable{
	private static final long serialVersionUID = -6524694091000854430L;
	protected String raceName, abilityScoreIncreaseDesc, ageDesc, 
		alignmentDesc, sizeDesc, speedDesc, languageDesc, source;
	protected LinkedList<String> racialFeatures = new LinkedList<String>();
	
	protected int[] abilityScoreIncrease = new int[6];
	protected int speed;
	protected String languageProfs;
	
	//the following are default values for the flag variables 
	protected boolean asiChoice = false;
	protected int nAsi = 0;
	protected boolean extraHealth = false;
	protected boolean extraSkillProf = false;
	protected int nExtraLanguages = 0;
	protected boolean skillChoice = false;
	protected int nSkillProfs = 0;
	protected boolean extraAc = false;
	
	//get methods for all of the variables
	public final String getRaceName() { return raceName;}
	public final String getAsiDesc() { return abilityScoreIncreaseDesc;}
	public final String getAgeDesc() { return ageDesc;}
	public final String getAlignmentDesc() { return alignmentDesc;}
	public final String getSizeDesc() { return sizeDesc;}
	public final String getSpeedDesc() { return speedDesc;}
	public final String getLanguageDesc() { return languageDesc;}
	public final LinkedList<String> getRacialFeatures() { return racialFeatures;}
	public final int[] getAbilityScoreIncrease() { return abilityScoreIncrease;}
	public final int getSpeed() { return speed;}
	public final String getLanguageProfs() { return languageProfs;}
	public final String getSource() { return source;}
	
	public final boolean hasAsiChoice() { return asiChoice;}
	public final int getNAsi() { return nAsi;}
	public final boolean hasExtraHealth() { return extraHealth;}
	public final boolean hasExtraSkillProf() { return extraSkillProf;}
	public final int getExtraLanguagePoints() { return nExtraLanguages;}
	public final boolean hasSkillChoice() { return false;}
	public final int getSkillProfPoints() { return nSkillProfs;}
	public final boolean hasExtraAc() { return extraAc;}
}
