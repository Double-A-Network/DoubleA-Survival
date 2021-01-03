package com.andrew121410.mc.doubleasurvival;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CraftingRecipeManager {

    private DoubleASurvival plugin;

    public CraftingRecipeManager(DoubleASurvival plugin) {
        this.plugin = plugin;
        setupSticksToPlanksRecipe();
        setupEnchantedGoldenApplesRecipe();
    }

    public void setupSticksToPlanksRecipe() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("doublea_sticks_to_planks"), new ItemStack(Material.OAK_PLANKS, 1));
        shapedRecipe.shape("SS ", "SS ", "   ");
        shapedRecipe.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(shapedRecipe);
    }

    public void setupEnchantedGoldenApplesRecipe() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("doublea_enchanted_golden_apples"), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
        shapedRecipe.shape("GGG", "GAG", "GGG");
        shapedRecipe.setIngredient('G', Material.GOLD_BLOCK);
        shapedRecipe.setIngredient('A', Material.APPLE);
        Bukkit.addRecipe(shapedRecipe);
    }
}
