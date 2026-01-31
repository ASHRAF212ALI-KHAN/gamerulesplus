package com.example.gamerulesplus;

import net.fabricmc.api.ModInitializer;
import net.minecraft.world.GameRules;

public class GamerulesPlus implements ModInitializer {

    public static GameRules.Key<GameRules.IntRule> VILLAGER_BREED;
    public static GameRules.Key<GameRules.IntRule> VILLAGER_GROW;
    public static GameRules.Key<GameRules.IntRule> ANIMAL_BREED;
    public static GameRules.Key<GameRules.IntRule> ANIMAL_GROW;
    public static GameRules.Key<GameRules.IntRule> SPAWNER_DELAY;

    @Override
    public void onInitialize() {
        VILLAGER_BREED = GameRules.register("villagerBreedCooldownSeconds", GameRules.Category.MOBS, GameRules.IntRule.create(150));
        VILLAGER_GROW  = GameRules.register("villagerBabyGrowTimeSeconds", GameRules.Category.MOBS, GameRules.IntRule.create(600));
        ANIMAL_BREED   = GameRules.register("animalBreedCooldownSeconds", GameRules.Category.MOBS, GameRules.IntRule.create(150));
        ANIMAL_GROW    = GameRules.register("animalBabyGrowTimeSeconds", GameRules.Category.MOBS, GameRules.IntRule.create(600));
        SPAWNER_DELAY  = GameRules.register("spawnerSpawnDelaySeconds", GameRules.Category.MOBS, GameRules.IntRule.create(20));
    }
}
