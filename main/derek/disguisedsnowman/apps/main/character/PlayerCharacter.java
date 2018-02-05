package derek.disguisedsnowman.apps.main.character;

import java.util.ArrayList;

import derek.disguisedsnowman.apps.main.character.skills.Skill;

public class PlayerCharacter {
	private String name_;
	private int hp_, xp_, totalLevel_, strengthScore_, dexterityScore_, 
		constitutionScore_, intelligenceScore_, wisdomScore_, charismaScore_;
		
	private Integer strengthModifier_, dexterityModifier_, 
		constitutionModifier_, intelligenceModifier_, wisdomModifier_, 
		charismaModifier_, proficiencyBonus_;
	private PlayerRace race_;
	private ArrayList<PlayerClass> classes_;
	private final ArrayList<Skill> SKILLS_ = 
			new ArrayList<Skill>(Skill.values().length);
	
	public PlayerCharacter(String name, int str, int dex, int con, int in, 
			int wis, int cha, PlayerRace playerRace, PlayerClass playerClass) {
		
		name_ = name;
		
		strengthScore_ 		= str; 
		dexterityScore_ 	= dex; 
		constitutionScore_ 	= con;
		intelligenceScore_ 	= in; 
		wisdomScore_ 		= wis; 
		charismaScore_ 		= cha;
		
		race_ = playerRace;
		//classes_.add(playerClass);
		
		//hp_ = classes_.get(0).getHitDie() + constitutionModifier_;
		xp_ = 0;
		
/*		for(PlayerClass p: classes_) {
			totalLevel_+=p.getLevel();
		}
*/		totalLevel_ = 1;
		proficiencyBonus_ = (int)Math.ceil(totalLevel_/4) + 1;
		
		strengthModifier_		= PlayerCharacter.computeModifier(strengthScore_);
		dexterityModifier_		= PlayerCharacter.computeModifier(dexterityScore_);
		constitutionModifier_ 	= PlayerCharacter.computeModifier(constitutionScore_);
		intelligenceModifier_	= PlayerCharacter.computeModifier(intelligenceScore_);
		wisdomModifier_ 		= PlayerCharacter.computeModifier(wisdomScore_);
		charismaModifier_ 		= PlayerCharacter.computeModifier(charismaScore_);
		
		int n = 0;
		for(Skill skill: Skill.values()) {
			SKILLS_.add(n++, skill);
		}
	}
	
	public int getStrengthScore() { return strengthScore_; }
	public void setStrengthScore(int score) {
		strengthScore_ = score;
		strengthModifier_ = PlayerCharacter.computeModifier(strengthScore_);
	}
	public int getDexterityScore() { return dexterityScore_; }
	public void setDexterityScore(int score) {
		dexterityScore_ = score;
		dexterityModifier_ = PlayerCharacter.computeModifier(dexterityScore_);
	}
	public int getConstitutionScore() { return constitutionScore_; }
	public void setConstitutionScore(int score) {
		constitutionScore_ = score;
		constitutionModifier_ = 
				PlayerCharacter.computeModifier(constitutionScore_);
	}
	public int getIntelligenceScore() { return intelligenceScore_; }
	public void setIntelligenceScore(int score) {
		intelligenceScore_ = score;
		intelligenceModifier_ = 
				PlayerCharacter.computeModifier(intelligenceScore_);
	}
	public int getWisdomScore() { return wisdomScore_; }
	public void setWisdomScore(int score) {
		wisdomScore_ = score;
		wisdomModifier_ = PlayerCharacter.computeModifier(wisdomScore_);
	}
	public int getCharismaScore() { return charismaScore_; }
	public void setCharismaScore(int score) {
		charismaScore_ = score;
		charismaModifier_ = PlayerCharacter.computeModifier(charismaScore_);
	}
	public Integer getStrengthModifier() { return strengthModifier_; }
	public Integer getDexterityModifier() { return dexterityModifier_; }
	public Integer getConstitutionModifier() { return constitutionModifier_; }
	public Integer getIntelligenceModifier() { return intelligenceModifier_; }
	public Integer getWisdomModifier() { return wisdomModifier_; }
	public Integer getCharismaModifier() { return charismaModifier_; }
	public Integer getProficiencyBonus() { return proficiencyBonus_; }
	
	//public Skill getSkill(int n) {
		
//	}
	
	public static Integer computeModifier(int score) {
		return (Integer)(int)Math.floor(((double)score - 10.0)/2.0);
	}
	
}
