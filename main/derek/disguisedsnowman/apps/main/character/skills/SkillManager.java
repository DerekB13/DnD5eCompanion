package derek.disguisedsnowman.apps.main.character.skills;

import java.util.EnumMap;
import java.util.Map;

import derek.disguisedsnowman.apps.main.character.PlayerCharacter;

public class SkillManager {
	private PlayerCharacter playerCharacter_;
	private Integer str_, dex_, int_, wis_, cha_, profBonus_;
	
	private final Map<Skill, SkillData> skills_ = new EnumMap<Skill, SkillData>
												(Skill.class);
	
	public SkillManager(PlayerCharacter playerCharacter) {
		playerCharacter_ = playerCharacter;
		
		str_ = playerCharacter_.getStrengthModifier();
		dex_ = playerCharacter_.getDexterityModifier();
		int_ = playerCharacter_.getIntelligenceModifier();
		wis_ = playerCharacter_.getWisdomModifier();
		cha_ = playerCharacter_.getCharismaModifier();
		profBonus_ = playerCharacter_.getProficiencyBonus();
		
		//Assigns the appropriate modifier to each skill
		for(Skill e: Skill.values()) {
			int mod = 0;
			switch(e.getAbility()) {
			
				case "Str":
					mod = str_;
					break;
				
				case "Dex":
					mod = dex_;
					break;
				
				case "Int":
					mod = int_;
					break;
				
				case "Wis":
					mod = wis_;
					break;
				
				case "Cha":
					mod = cha_;
					break;
			}
			skills_.put(e, new SkillData(mod));
		}
	}
	
	/**
	 * Get the SkillManager Strength modifier.
	 * 
	 * @return the value of str_
	 */
	public int getStr() { 
		str_ = playerCharacter_.getStrengthModifier();
		return str_;
	}
	
	public void updateStr(int s) { 
		str_ = playerCharacter_.getStrengthModifier();
	}
	
	/**
	 * Get the SkillManager Dexterity modifier.
	 * 
	 * @return the value of dex_
	 */
	public int getDex() { 
		dex_ = playerCharacter_.getDexterityModifier();
		return dex_;
	}
	
	public void updateDex(int d) { 
		dex_ = playerCharacter_.getDexterityModifier();
	}
	
	/**
	 * Get the SkillManager Intelligence modifier.
	 * 
	 * @return the value of int_
	 */
	public int getInt() { 
		int_ = playerCharacter_.getIntelligenceModifier();
		return int_;
	}
	
	public void updateInt(int i) { 
		int_ = playerCharacter_.getIntelligenceModifier();
	}
	
	/**
	 * Get the SkillManager Wisdom modifier.
	 * 
	 * @return the value of wis_
	 */
	public int getWis() { 
		wis_ = playerCharacter_.getWisdomModifier();
		return wis_;
	}
	
	public void updateWis(int w) { 
		wis_ = playerCharacter_.getWisdomModifier();
	}
	
	/**
	 * Get the SkillManager Charisma modifier.
	 * 
	 * @return the value of cha_
	 */
	public int getCha() { 
		cha_ = playerCharacter_.getCharismaModifier();
		return cha_;
	}
	
	public void updateCha(int c) { 
		cha_ = playerCharacter_.getCharismaModifier();
	}
	
	/**
	 * Get the SkillManager Proficiency Bonus.
	 * 
	 * @return the value of profBonus_
	 */
	public int getProfBonus() { 
		profBonus_ = playerCharacter_.getProficiencyBonus();
		return profBonus_;
	}
	
	public void updateProfBonus(int p) { 
		profBonus_ = playerCharacter_.getProficiencyBonus();
	}
	
	/**
	 * Get the modifier of the passed in Skill.
	 * 
	 * @param skill - the Skill to get the modifier of
	 * @return the value of the modifier
	 */
	public int getModifier(Skill skill) {
		return skills_.get(skill).getMod();
	}
	
	/**
	 * Set the modifier of the passed in Skill.
	 * 
	 * @param skill - the Skill to set the modifier of
	 */
	public void setModifier(Skill skill) {
		int mod = 0;
		
		switch(skill.getAbility()) {
		
			case "Str":
				mod+=str_;
				break;
			
			case "Dex":
				mod+=dex_;
				break;
			
			case "Int":
				mod+=int_;
				break;
			
			case "Wis":
				mod+=wis_;
				break;
			
			case "Cha":
				mod+=cha_;
				break;
		}
		
		if(skills_.get(skill).getExp())
			mod+=(2*profBonus_);
		else if(skills_.get(skill).getProf())
			mod+=profBonus_;
		
		mod+=skills_.get(skill).getOtherMod();
		
		skills_.get(skill).setMod(mod);
	}
	
	/**
	 * Get the Map of the Skills to their SkillData.
	 * 
	 * @return a Map of type <Skill, SkillData>
	 */
	public Map<Skill, SkillData> getSkills() { return skills_;}
	
	public void update() {
		for(Skill s: Skill.values())
			this.setModifier(s);
	}
}
