package com.example.parsererror;

import java.io.Serializable;

interface ElfProjection extends Serializable {

    String getUid();

    String getTownName();

    String getSenses();

    Double getGlaiveSkills();

    String getCharacterName();

    String getReputationWithElvenGuilds();

    String getReputationWithOgreGuilds();

    String getFireMagicResistanceSkill();

    String getHealthRegenerationAbility();

    String getSpiritRegen();

}
