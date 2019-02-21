package com.example.parsererror;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ElvenRepository extends JpaRepository<ElfEntity, String> {

    @Query("SELECT DISTINCT "
            + "elf.uid AS uid, "
            + "elf.characterName AS characterName, "
            + "elf.townName AS townName, "
            + "elf.glaiveSkills AS glaiveSkills, "
            + "elf.senses AS senses, "
            + "elf.reputationWithElvenGuilds AS reputationWithElvenGuilds, "
            + "elf.reputationWithOgreGuilds AS reputationWithOgreGuilds, "
            + "elf.healthRegenerationAbility AS healthRegenerationAbility, "
            + "elf.fireMagicResistanceSkill AS fireMagicResistanceSkill, "
            + "elf.spiritRegen AS spiritRegen "
            + "FROM ElfEntity elf WHERE "
            + "(:#{#filter.uid} IS NULL OR (LOWER(elf.uid) LIKE concat('%', LOWER(CAST(:#{#filter.uid} AS text)), '%'))) AND "
            + "(:#{#filter.characterName} IS NULL OR (LOWER(elf.characterName) LIKE concat('%', LOWER(CAST(:#{#filter.characterName} AS text)), '%'))) AND "
            + "(:#{#filter.townName} IS NULL OR (LOWER(elf.townName) LIKE concat('%', LOWER(CAST(:#{#filter.townName} AS text)), '%'))) AND "
            + "(:#{#filter.glaiveSkills} IS NULL OR (LOWER(elf.glaiveSkills) LIKE concat('%', LOWER(CAST(:#{#filter.glaiveSkills} AS text)), '%'))) AND "
            + "(:#{#filter.senses} IS NULL OR (LOWER(elf.senses) LIKE concat('%', LOWER(CAST(:#{#filter.senses} AS text)), '%'))) AND "
            + "(:#{#filter.reputationWithElvenGuilds} IS NULL OR (LOWER(elf.reputationWithElvenGuilds) LIKE concat('%', LOWER(CAST(:#{#filter.reputationWithElvenGuilds} AS text)), '%'))) AND "
            + "(:#{#filter.reputationWithOgreGuilds} IS NULL OR (LOWER(elf.reputationWithOgreGuilds) LIKE concat('%', LOWER(CAST(:#{#filter.reputationWithOgreGuilds} AS text)), '%'))) AND "
            + "(:#{#filter.healthRegenerationAbility} IS NULL OR (LOWER(elf.healthRegenerationAbility) LIKE concat('%', LOWER(CAST(:#{#filter.healthRegenerationAbility} AS text)), '%'))) AND "
            + "(:#{#filter.fireMagicResistanceSkill} IS NULL OR (LOWER(elf.fireMagicResistanceSkill) LIKE concat('%', LOWER(CAST(:#{#filter.fireMagicResistanceSkill} AS text)), '%'))) AND "
            + "(:#{#filter.spiritRegen} IS NULL OR (LOWER(elf.spiritRegen) LIKE concat('%', LOWER(CAST(:#{#filter.spiritRegen} AS text)), '%')))")
    Page<ElfProjection> getProjection(@Param("filter") Filter filter, Pageable pageable);

}
