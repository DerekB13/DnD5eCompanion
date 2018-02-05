package derek.disguisedsnowman.apps.main.character.skills;

public enum Skill {
	//All of the different skills and the ability scores associated with them
	ACROBATICS ("Dex"), 
	ANIMAL_HANDLING ("Wis"),
	ARCANA ("Int"),
	ATHLETICS ("Str"),
	DECEPTION ("Cha"),
	HISTORY ("Int"),
	INSIGHT ("Wis"),
	INTIMIDATION ("Cha"),
	INVESTIGATION ("Int"),
	MEDICINE ("Wis"),
	NATURE ("Int"),
	PERCEPTION ("Wis"),
	PERFORMANCE ("Cha"),
	PERSUASION ("Cha"),
	RELIGION ("Int"),
	SLEIGHT_OF_HAND ("Dex"),
	STEALTH ("Dex"),
	SURVIVAL ("Wis");
	
	//variable for the associated ability score
	private final String ability_;
	
	/**
     * Constructs the enum.
     *
     * @param s - the String representation of the related Ability Score
     */
	Skill(String s){
		ability_ = s;
	}
	
	/**
     * Get the String representation of the related Ability Score.
     *
     * @return a String (ability)
     */
	public String getAbility() { return ability_;}
}
