package com.SirResigmenduken.FrontierLife.init;

import java.util.ArrayList;
import java.util.List;

import com.SirResigmenduken.FrontierLife.objects.items.ItemFoodBase;
import com.SirResigmenduken.FrontierLife.objects.items.ItemResourcesBase;
import com.SirResigmenduken.FrontierLife.objects.items.food.FoodBase;
import com.SirResigmenduken.FrontierLife.objects.items.food.FoodEffectBase;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Crop Seeds
	public static final Item SEEDS_ALFALFA = new ItemFoodBase("seeds_alfalfa");
	public static final Item SEEDS_BEAN = new ItemFoodBase("seeds_bean");
	public static final Item SEEDS_CORN = new ItemFoodBase("seeds_corn");
	public static final Item SEEDS_CUCUMBER = new ItemFoodBase("seeds_cucumber");
	public static final Item SEEDS_GRAPE = new ItemFoodBase("seeds_grape");
	public static final Item SEEDS_LETTUCE = new ItemFoodBase("seeds_lettuce");
	public static final Item SEEDS_OAT = new ItemFoodBase("seeds_oat");
	public static final Item SEEDS_TOMATO = new ItemFoodBase("seeds_tomato");

	//FoodItems
	public static final Item ALFALFA = new ItemFoodBase("alfalfa");
	public static final Item BACON = new FoodBase("bacon", 4, 2f, false);
	public static final Item BACON_AND_EGGS = new ItemFoodBase("bacon_and_eggs");
	public static final Item BAYLEAF = new ItemFoodBase("bayleaf");
	public static final Item BEANS = new ItemFoodBase("beans");
	public static final Item BEANS_AND_PORK = new ItemFoodBase("beans_and_pork");
	public static final Item BEANS_REFRIED = new ItemFoodBase("beans_refried");
	public static final Item BEER = new FoodEffectBase("beer", 4, 2f, false, new PotionEffect(MobEffects.STRENGTH, 10 * 20, 1, false, true), new PotionEffect(MobEffects.NAUSEA, 20 * 20, 1, false, true));
	public static final Item BISCUIT = new ItemFoodBase("biscuit");
	public static final Item BISON_RAW = new FoodBase("bison_raw", 2, 0f, false);
	public static final Item BISON_COOKED = new FoodBase("bison_cooked", 8, 2f, false);
	public static final Item BLACKBERRY = new FoodBase("blackberry", 1, 0f, false);
	public static final Item BROTH = new FoodBase("broth", 4, 2f, false);
	public static final Item BURGER = new FoodBase("burger", 12, 6f, false);
	public static final Item BUTTER = new ItemFoodBase("butter");
	public static final Item CAKE_CARROT = new FoodBase("cake_carrot", 10, 3f, false);
	public static final Item CAKE_CHEESE = new FoodBase("cake_cheese", 10, 3f, false);
	public static final Item CAKE_CHOCOLATE = new FoodBase("cake_chocolate", 10, 3f, false);
	public static final Item CALAMARI_RAW = new FoodBase("calamari_raw", 2, 0f, false);
	public static final Item CALAMARI_COOKED = new FoodBase("calamari_cooked", 6, 2f, false);
	public static final Item CHEESE = new FoodBase("cheese", 4, 2f, false);
	public static final Item CHERRIES = new FoodBase("cherries", 1, 0f, false);
	public static final Item CHILI = new ItemFoodBase("chili");
	public static final Item CHOCOLATE_BAR = new ItemFoodBase("chocolate_bar");
	public static final Item CORN = new FoodBase("corn", 2, 1f, false);
	public static final Item CORN_CHOWDER = new FoodBase("corn_chowder", 8, 3f, false);
	public static final Item CORN_CREAMED = new FoodBase("corn_creamed", 6, 2f, false);
	public static final Item CORNBREAD = new FoodBase("cornbread", 5, 2f, false);
	public static final Item CORNMEAL = new FoodBase("cornmeal", 4, 2f, false);
	public static final Item CREAM = new ItemFoodBase("cream");
	public static final Item CUCUMBER = new ItemFoodBase("cucumber");
	public static final Item DOUGH = new ItemFoodBase("dough");
	public static final Item FISH = new FoodBase("fish", 2, 0.5f, false);
	public static final Item FISH_FILET_RAW = new FoodBase("fish_filet_raw", 4, 1f, false);
	public static final Item FISH_FILET_COOKED = new FoodBase("fish_filet_cooked", 8, 2f, false);
	public static final Item FLOUR = new ItemFoodBase("flour");
	public static final Item FRIED_EGG = new FoodBase("fried_egg", 4, 2f, false);
	public static final Item FRUIT_JAM = new FoodBase("fruit_jam", 4, 1f, false);
	public static final Item FRUIT_WINE = new FoodEffectBase("fruit_wine", 4, 2f, false, new PotionEffect(MobEffects.REGENERATION, 5*20, 1, false, true), new PotionEffect(MobEffects.WEAKNESS, 10*20, 1, false, true));
	public static final Item GRAPES = new FoodBase("grapes", 1, 0f, false);
	public static final Item GREEN_APPLE = new FoodBase("green_apple", 4, 1f, false);
	public static final Item HONEY = new FoodBase("honey", 4, 1f, false);
	public static final Item HONEYCOMB_RAW = new ItemFoodBase("honeycomb_raw");
	public static final Item LETTUCE = new FoodBase("lettuce", 1, 0f, false);
	public static final Item MEAT_DRIED = new FoodBase("meat_dried", 4, 5f, false);
	public static final Item MEAT_SALTED = new FoodBase("meat_salted", 6, 3f, false);
	public static final Item MILK_BOTTLE = new FoodBase("milk_bottle", 4, 1f, false);
	public static final Item OATS = new ItemFoodBase("oats");
	public static final Item OAT_BREAD = new FoodBase("oat_bread", 5, 1f, false);
	public static final Item OATMEAL_COOKIE = new FoodBase("oatmeal_cookie", 3, 1f, false);
	public static final Item OATMEAL = new FoodBase("oatmeal", 6, 2f, false);
	public static final Item PANCAKES = new ItemFoodBase("pancakes");
	public static final Item PICKLED_APPLES = new FoodBase("pickled_apples", 6, 4f, false);
	public static final Item PICKLED_BEETROOT = new FoodBase("pickled_beetroot", 6, 4f, false);
	public static final Item PICKLED_CARROTS = new FoodBase("pickled_carrots", 6, 4f, false);
	public static final Item PICKLED_EGGS = new FoodBase("pickled_eggs", 6, 4f, false);
	public static final Item PICKLED_MEAT = new FoodBase("pickled_meat", 6, 4f, false);
	public static final Item PICKLED_MUSHROOMS = new FoodBase("pickled_mushrooms", 6, 4f, false);
	public static final Item PICKLED_POTATOES = new FoodBase("pickled_potatoes", 6, 4f, false);
	public static final Item PICKLED_TOMATOES = new FoodBase("pickled_tomatoes", 6, 4f, false);
	public static final Item PICKLES = new ItemFoodBase("pickles");
	public static final Item PIE_APPLE = new FoodBase("pie_apple", 10, 5f, false);
	public static final Item PIE_APPLE_CREAM = new FoodBase("pie_apple_cream", 11, 5.5f, false);
	public static final Item PIE_BLACKBERRY = new FoodBase("pie_blackberry", 10, 5f, false);
	public static final Item PIE_CHERRY = new FoodBase("pie_cherry", 10, 5f, false);
	public static final Item PIE_PUMPKIN_CREAM = new FoodBase("pie_pumpkin_cream", 11, 5.5f, false);
	public static final Item PIE_RASPBERRY = new FoodBase("pie_raspberry", 10, 5f, false);
	public static final Item PIE_STRAWBERRY = new FoodBase("pie_strawberry", 10, 5f, false);
	public static final Item PRAWN_RAW = new FoodBase("prawn_raw", 1, 0.5f, false);
	public static final Item PRAWN_COOKED = new FoodBase("prawn_cooked", 4, 1f, false);
	public static final Item PUMPKIN_SLICE_RAW = new ItemFoodBase("pumpkin_slice_raw");
	public static final Item PUMPKIN_SLICE_ROASTED = new ItemFoodBase("pumpkin_slice_roasted");
	public static final Item RASPBERRY = new ItemFoodBase("raspberry");
	public static final Item SALAD = new FoodBase("salad", 10, 5f, false);
	public static final Item SALT = new ItemFoodBase("salt");
	public static final Item SALTLICK = new ItemFoodBase("saltlick");
	public static final Item SAUSAGE_RAW = new FoodBase("sausage_raw", 2, 1f, false);
	public static final Item SAUSAGE_COOKED = new FoodBase("sausage_cooked", 8, 2f, false);
	public static final Item SEAWEED = new ItemFoodBase("seaweed");
	public static final Item SOUP_BEAN = new FoodBase("soup_bean", 8, 4f, false);
	public static final Item SOUP_CARROT = new FoodBase("soup_carrot", 8, 4f, false);
	public static final Item SOUP_POTATO = new FoodBase("soup_potato", 8, 4f, false);
	public static final Item SOUP_VEGETABLE = new FoodBase("soup_vegetable", 8, 4f, false);
	public static final Item SPICE_LEAF = new ItemFoodBase("spice_leaf");
	public static final Item STEW = new FoodBase("stew", 8, 4f, false);
	public static final Item STRAWBERRY = new FoodBase("strawberry", 1, 0f, false);
	public static final Item TOMATO = new FoodBase("tomato", 1, 0f, false);
	public static final Item TURKEY_EGG= new ItemFoodBase("turkey_egg");
	public static final Item TURKEY_EGG_COOKED = new FoodBase("turkey_egg_cooked", 5, 2f, false);
	public static final Item VEGGIE_SUSHI = new ItemFoodBase("veggie_sushi");
	public static final Item VENISON_RAW = new FoodBase("venison_raw", 2, 1f, false);
	public static final Item VENISON_COOKED = new FoodBase("venison_cooked", 8, 3f, false);
	public static final Item VINEGAR = new ItemFoodBase("vinegar");
	public static final Item WALNUT = new FoodBase("walnut", 2, 0f, false);
	public static final Item WILD_MEAT_RAW = new FoodBase("wild_meat_raw", 2, 1f, false);
	public static final Item WILD_MEAT_COOKED = new FoodBase("wild_meat_cooked", 6, 1.5f, false);
	
	//Food Tools
	public static final Item COIN = new ItemFoodBase("coin");
	public static final Item COOKING_POT = new ItemFoodBase("cooking_pot");
	public static final Item KITCHEN_KNIFE = new ItemFoodBase("kitchen_knife");
	public static final Item FRYING_PAN = new ItemFoodBase("frying_pan");
	public static final Item MASON_JAR = new ItemFoodBase("mason_jar");
	public static final Item MORTAR_PESTLE = new ItemFoodBase("mortar_pestle");
	
	//Ore Items
	public static final Item COPPER_CLUSTER = new ItemResourcesBase("copper_cluster");
	public static final Item COPPER_INGOT = new ItemResourcesBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemResourcesBase("copper_nugget");
	public static final Item GOLD_CLUSTER = new ItemResourcesBase("gold_cluster");
	public static final Item IRON_CLUSTER = new ItemResourcesBase("iron_cluster");
	public static final Item LEAD_CLUSTER = new ItemResourcesBase("lead_cluster");
	public static final Item LEAD_INGOT = new ItemResourcesBase("lead_ingot");
	public static final Item LEAD_NUGGET = new ItemResourcesBase("lead_nugget");
	public static final Item SILVER_CLUSTER = new ItemResourcesBase("silver_cluster");
	public static final Item SILVER_INGOT = new ItemResourcesBase("silver_ingot");
	public static final Item SILVER_NUGGET = new ItemResourcesBase("silver_nugget");
	public static final Item TIN_CLUSTER = new ItemResourcesBase("tin_cluster");
	public static final Item TIN_INGOT = new ItemResourcesBase("tin_ingot");
	public static final Item TIN_NUGGET = new ItemResourcesBase("tin_nugget");
	
	public static final Item DUMMY_ITEM = new FoodEffectBase("dummy_item", 0, 0f, false, new PotionEffect(MobEffects.HUNGER, 60 * 20, 9, false, true), new PotionEffect(MobEffects.NAUSEA, 10 * 20, 1, false, true));
	

	
}
