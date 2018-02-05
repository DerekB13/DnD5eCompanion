package derek.disguisedsnowman.apps.main.character.skills;

public class SkillData {
	private int mod_, otherMod_;
	private boolean prof_, exp_;
	
	/**
	 * Constructs a SkillData with the default values and sets mod to the 
	 * passed in int.
	 * 
	 * @param m - the value for mod
	 */
	public SkillData(int m) {
		mod_ = m;
		otherMod_ = 0;
		prof_ = false;
		exp_ = false;
	}
	
	/**
	 * Get the modifier for this object.
	 * 
	 * @return the value of mod
	 */
	public int getMod() { return mod_;}
	
	/**
	 * Set a new value for mod.
	 * 
	 * @param m - the new value for mod
	 */
	public void setMod(int m) { mod_ = m;}
	
	/**
     * Get the sum of any other additional modifiers.
     *
     * @return the value of otherMod
     */
	public int getOtherMod() { return otherMod_;}
	
	/**
     * Set a new value for otherMod.
     *
     * @param newMod - the new value for the sum of the other modifiers
     */
	public void setOtherMod(int newMod) { otherMod_ = newMod;}
	
	/**
     * Get a boolean representing whether a character is proficient in this 
     * skill.
     *
     * @return a boolean
     */
	public boolean getProf() { return prof_;}
	
	/**
     * Set a new value for prof.
     *
     * @param newProf - the new value for prof
     */
	public void setProf(boolean newProf) { prof_ = newProf;}
	
	/**
     * Get a boolean representing whether a character has expertise in this 
     * skill.
     *
     * @return a boolean
     */
	public boolean getExp() { return exp_;}
	
	/**
     * Set a new value for exp.
     *
     * @param  newExp - the new value for exp
     */
	public void setExp(boolean newExp) { 
		exp_ = newExp;
		if(newExp == true) //If a skill has expertise, it should also have 
			prof_ = newExp; //proficiency. This sets that to be the correct value.
	}
}
