package com.example.parsererror;

import java.util.Objects;
import java.util.StringJoiner;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ElfEntity {

    @Id
    @Column
    private String uid;

    @Column
    private String characterName;

    @Column
    private String townName;

    @Column
    private String senses;

    @Column
    private Double glaiveSkills;

    @Column
    private String reputationWithElvenGuilds;

    @Column
    private String reputationWithOgreGuilds;

    @Column
    private String fireMagicResistanceSkill;

    @Column
    private String healthRegenerationAbility;

    @Column
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
        ElfEntity elfEntity = (ElfEntity) o;
        return Objects.equals(uid, elfEntity.uid) &&
                Objects.equals(characterName, elfEntity.characterName) &&
                Objects.equals(townName, elfEntity.townName) &&
                Objects.equals(senses, elfEntity.senses) &&
                Objects.equals(glaiveSkills, elfEntity.glaiveSkills) &&
                Objects.equals(reputationWithElvenGuilds, elfEntity.reputationWithElvenGuilds) &&
                Objects.equals(reputationWithOgreGuilds, elfEntity.reputationWithOgreGuilds) &&
                Objects.equals(fireMagicResistanceSkill, elfEntity.fireMagicResistanceSkill) &&
                Objects.equals(healthRegenerationAbility, elfEntity.healthRegenerationAbility) &&
                Objects.equals(spiritRegen, elfEntity.spiritRegen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, townName, senses, glaiveSkills, characterName, reputationWithElvenGuilds, reputationWithOgreGuilds, fireMagicResistanceSkill, healthRegenerationAbility, spiritRegen);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ElfEntity.class.getSimpleName() + "[", "]")
                .add("uid='" + uid + "'")
                .add("characterName='" + characterName + "'")
                .add("townName='" + townName + "'")
                .add("senses='" + senses + "'")
                .add("glaiveSkills=" + glaiveSkills)
                .add("reputationWithElvenGuilds='" + reputationWithElvenGuilds + "'")
                .add("reputationWithOgreGuilds='" + reputationWithOgreGuilds + "'")
                .add("fireMagicResistanceSkill='" + fireMagicResistanceSkill + "'")
                .add("healthRegenerationAbility='" + healthRegenerationAbility + "'")
                .add("spiritRegen='" + spiritRegen + "'")
                .toString();
    }

}
