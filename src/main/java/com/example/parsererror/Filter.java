package com.example.parsererror;

import java.util.Objects;
import java.util.StringJoiner;

public class Filter {

    private String uid;
    private String characterName;
    private String townName;
    private String senses;
    private Double glaiveSkills;
    private String reputationWithElvenGuilds;
    private String reputationWithOgreGuilds;
    private String fireMagicResistanceSkill;
    private String healthRegenerationAbility;
    private String spiritRegen;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getSenses() {
        return senses;
    }

    public void setSenses(String senses) {
        this.senses = senses;
    }

    public Double getGlaiveSkills() {
        return glaiveSkills;
    }

    public void setGlaiveSkills(Double glaiveSkills) {
        this.glaiveSkills = glaiveSkills;
    }

    public String getReputationWithElvenGuilds() {
        return reputationWithElvenGuilds;
    }

    public void setReputationWithElvenGuilds(String reputationWithElvenGuilds) {
        this.reputationWithElvenGuilds = reputationWithElvenGuilds;
    }

    public String getReputationWithOgreGuilds() {
        return reputationWithOgreGuilds;
    }

    public void setReputationWithOgreGuilds(String reputationWithOgreGuilds) {
        this.reputationWithOgreGuilds = reputationWithOgreGuilds;
    }

    public String getFireMagicResistanceSkill() {
        return fireMagicResistanceSkill;
    }

    public void setFireMagicResistanceSkill(String fireMagicResistanceSkill) {
        this.fireMagicResistanceSkill = fireMagicResistanceSkill;
    }

    public String getHealthRegenerationAbility() {
        return healthRegenerationAbility;
    }

    public void setHealthRegenerationAbility(String healthRegenerationAbility) {
        this.healthRegenerationAbility = healthRegenerationAbility;
    }

    public String getSpiritRegen() {
        return spiritRegen;
    }

    public void setSpiritRegen(String spiritRegen) {
        this.spiritRegen = spiritRegen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Filter filter = (Filter) o;
        return Objects.equals(uid, filter.uid) &&
                Objects.equals(characterName, filter.characterName) &&
                Objects.equals(townName, filter.townName) &&
                Objects.equals(senses, filter.senses) &&
                Objects.equals(glaiveSkills, filter.glaiveSkills) &&
                Objects.equals(reputationWithElvenGuilds, filter.reputationWithElvenGuilds) &&
                Objects.equals(reputationWithOgreGuilds, filter.reputationWithOgreGuilds) &&
                Objects.equals(fireMagicResistanceSkill, filter.fireMagicResistanceSkill) &&
                Objects.equals(healthRegenerationAbility, filter.healthRegenerationAbility) &&
                Objects.equals(spiritRegen, filter.spiritRegen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, characterName, townName, senses, glaiveSkills, reputationWithElvenGuilds, reputationWithOgreGuilds,
                fireMagicResistanceSkill, healthRegenerationAbility, spiritRegen);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Filter.class.getSimpleName() + "[", "]")
                .add("uid='" + uid + "'")
                .add("characterName='" + characterName + "'")
                .add("townName='" + townName + "'")
                .toString();
    }

}
