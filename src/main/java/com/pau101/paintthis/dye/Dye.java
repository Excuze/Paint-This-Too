package com.pau101.paintthis.dye;

import java.util.ArrayList;
import java.util.List;

import com.pau101.paintthis.PaintThis;
import com.pau101.paintthis.util.DyeOreDictHelper;
import com.pau101.paintthis.util.Util;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;

public enum Dye {
	BONE_MEAL(0xFFFFFF, DyeType.PRIMARY),
	ORANGE(0xD87F33, DyeType.PRIMARY),
	MAGENTA(0xB24CD8, DyeType.PRIMARY),
	LIGHT_BLUE(0x6699D8, DyeType.PRIMARY),
	DANDELION_YELLOW(0xE5E533, DyeType.PRIMARY),
	LIME(0x7FCC19, DyeType.SECONDARY),
	PINK(0xF27FA5, DyeType.PRIMARY),
	GRAY(0x4C4C4C, DyeType.SECONDARY),
	LIGHT_GRAY(0x999999, DyeType.PRIMARY),
	CYAN(0x4C7F99, DyeType.SECONDARY),
	PURPLE(0x7F3FB2, DyeType.SECONDARY),
	LAPIS_LAZULI(0x334CB2, DyeType.PRIMARY),
	COCOA_BEANS(0x664C33, DyeType.PRIMARY),
	CACTUS_GREEN(0x667F33, DyeType.PRIMARY),
	ROSE_RED(0x993333, DyeType.PRIMARY),
	INK_SAC(0x191919, DyeType.PRIMARY),
	DEEP_PEACH(0xF4BE97, DyeType.SECONDARY),
	BRIGHT_UBE(0xDDA8ED, DyeType.SECONDARY),
	PALE_CORNFLOWER_BLUE(0xB7CBEC, DyeType.SECONDARY),
	BANANA(0xF8F2A1, DyeType.SECONDARY),
	MEDIUM_SPRING_BUD(0xC5E696, DyeType.TERTIARY),
	LEMONADE(0xFDC0D1, DyeType.SECONDARY),
	BRIGHT_GRAY(0xA1A1A1, DyeType.TERTIARY),
	GAINSBORO(0xCBCBCB, DyeType.SECONDARY),
	BLUE_BELL(0xA2A1D9, DyeType.SECONDARY),
	PASTEL_BLUE(0xA6BDCB, DyeType.TERTIARY),
	PALE_SILVER(0xB2A193, DyeType.SECONDARY),
	WISTERIA(0xC29ED9, DyeType.TERTIARY),
	OLD_ROSE(0xD39892, DyeType.SECONDARY),
	PALE_VIOLET_RED(0xCF6589, DyeType.SECONDARY),
	ROSY_BROWN(0xB58C88, DyeType.SECONDARY),
	MEAT_BROWN(0xE1B334, DyeType.SECONDARY),
	OLD_GOLD(0xB4A929, DyeType.TERTIARY),
	PEACH(0xE77F6E, DyeType.SECONDARY),
	FRENCH_BEIGE(0x936543, DyeType.TERTIARY),
	ANTIQUE_BRASS(0xBE8D68, DyeType.SECONDARY),
	TURKISH_ROSE(0x9F6378, DyeType.SECONDARY),
	BEAVER(0xA18069, DyeType.TERTIARY),
	TAWNY(0x9E6534, DyeType.SECONDARY),
	SANDY_TAUPE(0xA18133, DyeType.SECONDARY),
	PALE_RED_VIOLET(0xB65D78, DyeType.TERTIARY),
	DARK_CORAL(0xB85A34, DyeType.SECONDARY),
	OTTER_BROWN(0x734928, DyeType.SECONDARY),
	DARK_PASTEL_PURPLE(0x9378D8, DyeType.SECONDARY),
	BLOOMING_PERFECT(0xD89C95, DyeType.SECONDARY),
	CINEREOUS(0xAB948A, DyeType.TERTIARY),
	PALE_MAGENTA(0xD565BF, DyeType.SECONDARY),
	MAUVE(0x80518F, DyeType.TERTIARY),
	PERIWINKLE(0xA977B9, DyeType.SECONDARY),
	MEDIUM_SLATE_BLUE(0x7A4EC5, DyeType.SECONDARY),
	UBE(0x856CB8, DyeType.TERTIARY),
	BYZANTIUM(0x904F83, DyeType.SECONDARY),
	OPERA_MAUVE(0x946C87, DyeType.SECONDARY),
	AMETHYST(0x9846C5, DyeType.TERTIARY),
	FANDANGO(0xAD3E83, DyeType.SECONDARY),
	PALATINATE_PURPLE(0x613571, DyeType.SECONDARY),
	HAZEL_WOOD(0xB8BD93, DyeType.SECONDARY),
	DARK_SEA_GREEN(0x84B288, DyeType.TERTIARY),
	PASTEL_VIOLET(0xB98FBE, DyeType.SECONDARY),
	STONE(0x5E718F, DyeType.TERTIARY),
	COOL_GREY(0x8599B8, DyeType.SECONDARY),
	GREEN_BLUE(0x5072C5, DyeType.SECONDARY),
	STEEL_BLUE(0x598CB8, DyeType.TERTIARY),
	PEWTER(0x727182, DyeType.SECONDARY),
	AURO_METAL_SAURUS(0x728B86, DyeType.SECONDARY),
	TOOLBOX(0x786FC5, DyeType.TERTIARY),
	PLUM_DANDY(0x946982, DyeType.SECONDARY),
	PAYNE_GREY(0x415571, DyeType.SECONDARY),
	APPLE_GREEN(0xB4D927, DyeType.TERTIARY),
	MACARONI_AND_CHEESE(0xF0B577, DyeType.SECONDARY),
	OLIVE_GREEN(0x98954A, DyeType.TERTIARY),
	DARK_KHAKI(0xC3BE71, DyeType.SECONDARY),
	GRULLO(0xA59483, DyeType.SECONDARY),
	PETER_PAN(0xA4B073, DyeType.TERTIARY),
	BRASS(0xA49539, DyeType.SECONDARY),
	SCIENCE_EXPERIMENT(0xA4B136, DyeType.SECONDARY),
	PALE_TAUPE(0xBE9283, DyeType.TERTIARY),
	EARTH_YELLOW(0xC28E39, DyeType.SECONDARY),
	VERDANT(0x78762D, DyeType.SECONDARY),
	HAZELNUT(0xC3AC6D, DyeType.TERTIARY),
	PICKLE(0x6A8A40, DyeType.QUATERNARY),
	OLIVINE(0x92B366, DyeType.TERTIARY),
	XANADU(0x758A79, DyeType.TERTIARY),
	ASPARAGUS(0x71A469, DyeType.QUATERNARY),
	OLIVE_DRAB(0x778B2F, DyeType.TERTIARY),
	PEAR(0x73A52C, DyeType.TERTIARY),
	BATTLESHIP_GREY(0x918978, DyeType.QUATERNARY),
	FAWN(0x98852F, DyeType.TERTIARY),
	MOSS(0x4C6C24, DyeType.TERTIARY),
	RASPBERRY_GLACE(0x9D6777, DyeType.TERTIARY),
	PUCE(0xC88F9F, DyeType.SECONDARY),
	MOONLIGHT_MELODY(0xA264AC, DyeType.SECONDARY),
	MOUNTBATTEN_PINK(0xA8839F, DyeType.TERTIARY),
	ROSE_GOLD(0xAA666A, DyeType.SECONDARY),
	LIGHT_TAUPE(0xAE836C, DyeType.SECONDARY),
	SUPER_PINK(0xBC5EAC, DyeType.TERTIARY),
	DARK_TERRA_COTTA(0xC6586A, DyeType.SECONDARY),
	MAUVE_TAUPE(0x7D4A5A, DyeType.SECONDARY),
	FOSSIL(0x717171, DyeType.TERTIARY),
	FULLY_PURPLE(0x4A4C7E, DyeType.TERTIARY),
	CADET(0x506571, DyeType.QUATERNARY),
	DARK_LAVA(0x5A4C40, DyeType.TERTIARY),
	GRAY_ASPARAGUS(0x5A6542, DyeType.TERTIARY),
	FRENCH_LILAC(0x68487E, DyeType.QUATERNARY),
	DEEP_COFFEE(0x76433F, DyeType.TERTIARY),
	PEBBLE(0x313131, DyeType.TERTIARY),
	LAVENDER_PURPLE(0x7271A7, DyeType.SECONDARY),
	LIGHT_SLATE_GRAY(0x768C99, DyeType.TERTIARY),
	PASTEL_BROWN(0x817164, DyeType.SECONDARY),
	SAGE(0x818C66, DyeType.SECONDARY),
	HEATHER(0x906EA6, DyeType.TERTIARY),
	COPPER_ROSE(0x9F6964, DyeType.SECONDARY),
	DAVY_GREY(0x555555, DyeType.SECONDARY),
	TUFTS_BLUE(0x4566A6, DyeType.TERTIARY),
	SUNSET_SERENADE(0x5F4B71, DyeType.SECONDARY),
	SLATE_BLUE(0x5F47B2, DyeType.TERTIARY),
	COOL_BLACK(0x2D3160, DyeType.SECONDARY),
	DIM_GRAY(0x636565, DyeType.TERTIARY),
	CAMOUFLAGE_GREEN(0x617F68, DyeType.TERTIARY),
	MEDIEVAL(0x6B63A6, DyeType.QUATERNARY),
	BAZAAR(0x835D64, DyeType.TERTIARY),
	SPRUCE(0x344955, DyeType.TERTIARY),
	ARMY_GREEN(0x686634, DyeType.SECONDARY),
	ANTIQUE_FUCHSIA(0x784771, DyeType.TERTIARY),
	BOLE(0x804233, DyeType.SECONDARY),
	TAUPE(0x3E3126, DyeType.SECONDARY),
	OLD_LAVENDER(0x7C6375, DyeType.TERTIARY),
	PEANUT(0x855F33, DyeType.SECONDARY),
	SEAWEED(0x3E4927, DyeType.SECONDARY),
	DARK_RASPBERRY(0x953771, DyeType.TERTIARY),
	JOYOUS_SONG(0x4B2D60, DyeType.TERTIARY),
	CAPUT_MORTUUM(0x572826, DyeType.SECONDARY),
	LIGHT_GOLDENROD_YELLOW(0xFDF8D0, DyeType.TERTIARY),
	BLONDE(0xF0EB70, DyeType.TERTIARY),
	PALE_SPRING_BUD(0xE3F3CA, DyeType.QUATERNARY),
	INCHWORM(0xA4D960, DyeType.QUINARY),
	BOOGER_BUSTER(0xD7E56B, DyeType.QUATERNARY),
	JUNE_BUD(0xBEE065, DyeType.QUATERNARY),
	ALMOND(0xFCDECA, DyeType.TERTIARY),
	BISCOTTI(0xEED26D, DyeType.TERTIARY),
	DARK_PURPLE(0x32233B, DyeType.QUATERNARY),
	BLUE_HIGHLIGHT(0x323E88, DyeType.TERTIARY),
	CLASSIC_ROSE(0xEFD3F6, DyeType.TERTIARY),
	FRENCH_MAUVE(0xC97CE3, DyeType.TERTIARY),
	PALE_LAVENDER(0xD5BADC, DyeType.TERTIARY),
	LAVENDER_ROSE(0xEA94C9, DyeType.TERTIARY),
	DREAMY_HEAVEN(0x492C43, DyeType.QUATERNARY),
	DENIM(0x25253B, DyeType.TERTIARY),
	RICH_LILAC(0xAE63C9, DyeType.TERTIARY),
	CAMBRIDGE_BLUE(0x96B8A9, DyeType.SENARY),
	MARDI_GRAS(0x8D3B91, DyeType.QUINARY),
	DARK_BYZANTIUM(0x542A43, DyeType.QUATERNARY),
	WILD_ORCHID(0xCF7BAF, DyeType.TERTIARY),
	EGGPLANT(0x3C2843, DyeType.TERTIARY),
	DARK_SLATE_BLUE(0x463C88, DyeType.QUATERNARY),
	RAW_SIENNA(0xD58755, DyeType.QUATERNARY),
	SAINT_PATRICK_BLUE(0x534091, DyeType.TERTIARY),
	OAT(0xF6D89C, DyeType.TERTIARY),
	THISTLE(0xDCC6DE, DyeType.TERTIARY),
	BLOSSOMS_IN_SPRING(0xD887BA, DyeType.TERTIARY),
	DESERT_SAND(0xE1C5B1, DyeType.TERTIARY),
	GIANTS_CLUB(0xB26050, DyeType.QUATERNARY),
	PINK_PARADE(0xBE6FA1, DyeType.TERTIARY),
	PERSIAN_ORANGE(0xCC864F, DyeType.TERTIARY),
	SANDSTORM(0xE4CC34, DyeType.TERTIARY),
	LIGHT_SALMON(0xEC9A73, DyeType.TERTIARY),
	SLATE(0x3F3049, DyeType.QUINARY),
	OBSESSION(0x983552, DyeType.QUATERNARY),
	PISTACHIO(0xC1D8C2, DyeType.QUATERNARY),
	HANSA_YELLOW(0xD5D158, DyeType.TERTIARY),
	PERSIAN_PINK(0xE472B2, DyeType.TERTIARY),
	FREE_SPIRIT(0xC7B4D2, DyeType.QUATERNARY),
	PIGGY_PINK(0xFFE0E8, DyeType.TERTIARY),
	COTTON_CANDY(0xEDB4DF, DyeType.TERTIARY),
	FLAMINGO(0xF8A0BB, DyeType.TERTIARY),
	DARK_SALMON(0xEE9F82, DyeType.TERTIARY),
	LAVENDER(0xDA88D6, DyeType.TERTIARY),
	LATTE(0xF5D38C, DyeType.TERTIARY),
	CANDY_PINK(0xED7F8A, DyeType.TERTIARY),
	DARK_MAGENTA(0x993E9A, DyeType.QUATERNARY),
	INDIAN_YELLOW(0xE9B458, DyeType.TERTIARY),
	PASTEL_MAGENTA(0xDD8FBF, DyeType.QUATERNARY),
	REGALIA(0x633D91, DyeType.QUINARY),
	DEEP_FUCHSIA(0xB855C2, DyeType.QUATERNARY),
	MEDIUM_ORCHID(0xC558CC, DyeType.TERTIARY),
	DEEP_CHESTNUT(0xC05950, DyeType.TERTIARY),
	BAKED_CLAY(0xBD7159, DyeType.TERTIARY),
	GRANOLA(0xD3B955, DyeType.TERTIARY),
	ATOMIC_TANGERINE(0xE07F52, DyeType.TERTIARY),
	ACID_GREEN(0xC4CB35, DyeType.TERTIARY),
	PURPLE_PLUM(0xAB51B9, DyeType.QUATERNARY),
	YELLOW_GREEN(0x93BF2A, DyeType.QUATERNARY),
	HYPER(0xB8CB66, DyeType.QUATERNARY),
	DOLLAR_BILL(0x85BF5C, DyeType.QUINARY),
	PALE_CHESTNUT(0xD0AFB9, DyeType.TERTIARY),
	BLANCHED_ALMOND(0xE3D4B4, DyeType.QUINARY),
	LANGUID_LAVENDER(0xE1CEEC, DyeType.QUATERNARY),
	RASPBERRY_ROSE(0xA4385A, DyeType.TERTIARY),
	PATRIARCH(0xA541A3, DyeType.QUATERNARY),
	FLAXEN(0xD3AF53, DyeType.QUINARY),
	BRIGHT_LILAC(0xBB78D9, DyeType.QUATERNARY),
	BYZANTINE(0xB245AD, DyeType.TERTIARY),
	MAIZE(0xCCC72E, DyeType.QUATERNARY),
	BLUSH(0xE0AFD5, DyeType.QUATERNARY),
	THULIAN_PINK(0xD76EA9, DyeType.QUATERNARY),
	LILAC(0xAB59C2, DyeType.TERTIARY),
	ROYAL_PURPLE(0x724CA0, DyeType.SENARY),
	SAND_DOLLAR(0xE3DEB7, DyeType.TERTIARY),
	PLUM(0x813452, DyeType.TERTIARY),
	HALAYA_UBE(0x5F2E4B, DyeType.TERTIARY),
	IRIS(0x9059B9, DyeType.TERTIARY),
	STRAW(0xD1D16B, DyeType.TERTIARY),
	SKY_MAGENTA(0xCB71A9, DyeType.TERTIARY),
	MEDIUM_PURPLE(0x8455AF, DyeType.QUATERNARY),
	CHERISH_THE_MOMENT(0xD1B0D5, DyeType.TERTIARY),
	PALE_COPPER(0xD88B64, DyeType.TERTIARY),
	BRIGHT_LAVENDER(0xB990E3, DyeType.TERTIARY),
	PEARLY_PURPLE(0xB9679A, DyeType.QUATERNARY),
	BONE(0xDBDEC8, DyeType.TERTIARY),
	GLITTER(0xDBE5F6, DyeType.TERTIARY),
	PEACH_PUFF(0xFBD9BA, DyeType.TERTIARY),
	PINK_PEARL(0xDBA7C8, DyeType.TERTIARY),
	MOSS_GREEN(0xA5CC8F, DyeType.QUATERNARY),
	ROSE_QUARTZ(0xC9B3C1, DyeType.TERTIARY),
	INDIGO(0x634EA0, DyeType.QUATERNARY),
	DEEP_LILAC(0x9C5FC8, DyeType.QUATERNARY),
	SANDY_BROWN(0xE59A55, DyeType.TERTIARY),
	PURPUREUS(0xA24EAD, DyeType.TERTIARY),
	EMINENCE(0x653688, DyeType.QUINARY),
	ORANGE_YELLOW(0xECCD5B, DyeType.TERTIARY),
	SILVER(0xB1A7C5, DyeType.QUINARY),
	DARK_PASTEL_BLUE(0x91B2E2, DyeType.TERTIARY),
	DARK_LAVENDER(0x563A88, DyeType.QUATERNARY),
	PASTEL_PURPLE(0xC8A5BF, DyeType.TERTIARY),
	REBECCA_PURPLE(0x8D4CAA, DyeType.QUINARY),
	MELON(0xF9BFB4, DyeType.TERTIARY),
	PURPLE_HEART(0x6F419A, DyeType.TERTIARY),
	MAUVELOUS(0xE38C9C, DyeType.TERTIARY),
	RICH_LAVENDER(0xA260BF, DyeType.QUATERNARY),
	PALE_PINK(0xEBCBC7, DyeType.TERTIARY),
	PURPLE_TAUPE(0x493138, DyeType.TERTIARY),
	OYSTER(0xD5D79C, DyeType.TERTIARY),
	DARK_TAN(0x8E7C4C, DyeType.QUINARY),
	SAND(0xDFBF6C, DyeType.TERTIARY),
	LIGHT_PASTEL_PURPLE(0x9C8DD9, DyeType.QUATERNARY),
	BEIGE(0xDED397, DyeType.QUATERNARY),
	LIBERTY(0x564A98, DyeType.QUINARY),
	LION(0xA48B53, DyeType.QUINARY),
	SALMON(0xF29B8F, DyeType.TERTIARY),
	OLIVE(0x9FC561, DyeType.QUATERNARY),
	PURPLE_MOUNTAIN_MAJESTY(0x80479A, DyeType.TERTIARY),
	BENGAL_GRASS(0x967D46, DyeType.QUATERNARY),
	TAFFY(0xD365A4, DyeType.TERTIARY),
	TORTILLA(0xA38C5E, DyeType.QUATERNARY),
	ANDROID_GREEN(0x9DBB22, DyeType.QUINARY);

	static {
		LIME.setParents(CACTUS_GREEN, BONE_MEAL);
		GRAY.setParents(INK_SAC, BONE_MEAL);
		CYAN.setParents(CACTUS_GREEN, LAPIS_LAZULI);
		PURPLE.setParents(ROSE_RED, LAPIS_LAZULI);
		DEEP_PEACH.setParents(BONE_MEAL, ORANGE);
		BRIGHT_UBE.setParents(BONE_MEAL, MAGENTA);
		PALE_CORNFLOWER_BLUE.setParents(BONE_MEAL, LIGHT_BLUE);
		BANANA.setParents(BONE_MEAL, DANDELION_YELLOW);
		MEDIUM_SPRING_BUD.setParents(BONE_MEAL, LIME);
		LEMONADE.setParents(BONE_MEAL, PINK);
		BRIGHT_GRAY.setParents(BONE_MEAL, GRAY);
		GAINSBORO.setParents(BONE_MEAL, LIGHT_GRAY);
		BLUE_BELL.setParents(BONE_MEAL, LAPIS_LAZULI);
		PASTEL_BLUE.setParents(BONE_MEAL, CYAN);
		PALE_SILVER.setParents(BONE_MEAL, COCOA_BEANS);
		WISTERIA.setParents(BONE_MEAL, PURPLE);
		OLD_ROSE.setParents(BONE_MEAL, ROSE_RED);
		PALE_VIOLET_RED.setParents(ORANGE, MAGENTA);
		ROSY_BROWN.setParents(ORANGE, LIGHT_BLUE);
		MEAT_BROWN.setParents(ORANGE, DANDELION_YELLOW);
		OLD_GOLD.setParents(ORANGE, LIME);
		PEACH.setParents(ORANGE, PINK);
		FRENCH_BEIGE.setParents(ORANGE, GRAY);
		ANTIQUE_BRASS.setParents(ORANGE, LIGHT_GRAY);
		TURKISH_ROSE.setParents(ORANGE, LAPIS_LAZULI);
		BEAVER.setParents(ORANGE, CYAN);
		TAWNY.setParents(ORANGE, COCOA_BEANS);
		SANDY_TAUPE.setParents(ORANGE, CACTUS_GREEN);
		PALE_RED_VIOLET.setParents(ORANGE, PURPLE);
		DARK_CORAL.setParents(ORANGE, ROSE_RED);
		OTTER_BROWN.setParents(ORANGE, INK_SAC);
		DARK_PASTEL_PURPLE.setParents(MAGENTA, LIGHT_BLUE);
		BLOOMING_PERFECT.setParents(MAGENTA, DANDELION_YELLOW);
		CINEREOUS.setParents(MAGENTA, LIME);
		PALE_MAGENTA.setParents(MAGENTA, PINK);
		MAUVE.setParents(MAGENTA, GRAY);
		PERIWINKLE.setParents(MAGENTA, LIGHT_GRAY);
		MEDIUM_SLATE_BLUE.setParents(MAGENTA, LAPIS_LAZULI);
		UBE.setParents(MAGENTA, CYAN);
		BYZANTIUM.setParents(MAGENTA, COCOA_BEANS);
		OPERA_MAUVE.setParents(MAGENTA, CACTUS_GREEN);
		AMETHYST.setParents(MAGENTA, PURPLE);
		FANDANGO.setParents(MAGENTA, ROSE_RED);
		PALATINATE_PURPLE.setParents(MAGENTA, INK_SAC);
		HAZEL_WOOD.setParents(LIGHT_BLUE, DANDELION_YELLOW);
		DARK_SEA_GREEN.setParents(LIGHT_BLUE, LIME);
		PASTEL_VIOLET.setParents(LIGHT_BLUE, PINK);
		STONE.setParents(LIGHT_BLUE, GRAY);
		COOL_GREY.setParents(LIGHT_BLUE, LIGHT_GRAY);
		GREEN_BLUE.setParents(LIGHT_BLUE, LAPIS_LAZULI);
		STEEL_BLUE.setParents(LIGHT_BLUE, CYAN);
		PEWTER.setParents(LIGHT_BLUE, COCOA_BEANS);
		AURO_METAL_SAURUS.setParents(LIGHT_BLUE, CACTUS_GREEN);
		TOOLBOX.setParents(LIGHT_BLUE, PURPLE);
		PLUM_DANDY.setParents(LIGHT_BLUE, ROSE_RED);
		PAYNE_GREY.setParents(LIGHT_BLUE, INK_SAC);
		APPLE_GREEN.setParents(DANDELION_YELLOW, LIME);
		MACARONI_AND_CHEESE.setParents(DANDELION_YELLOW, PINK);
		OLIVE_GREEN.setParents(DANDELION_YELLOW, GRAY);
		DARK_KHAKI.setParents(DANDELION_YELLOW, LIGHT_GRAY);
		GRULLO.setParents(DANDELION_YELLOW, LAPIS_LAZULI);
		PETER_PAN.setParents(DANDELION_YELLOW, CYAN);
		BRASS.setParents(DANDELION_YELLOW, COCOA_BEANS);
		SCIENCE_EXPERIMENT.setParents(DANDELION_YELLOW, CACTUS_GREEN);
		PALE_TAUPE.setParents(DANDELION_YELLOW, PURPLE);
		EARTH_YELLOW.setParents(DANDELION_YELLOW, ROSE_RED);
		VERDANT.setParents(DANDELION_YELLOW, INK_SAC);
		HAZELNUT.setParents(LIME, PINK);
		PICKLE.setParents(LIME, GRAY);
		OLIVINE.setParents(LIME, LIGHT_GRAY);
		XANADU.setParents(LIME, LAPIS_LAZULI);
		ASPARAGUS.setParents(LIME, CYAN);
		OLIVE_DRAB.setParents(LIME, COCOA_BEANS);
		PEAR.setParents(LIME, CACTUS_GREEN);
		BATTLESHIP_GREY.setParents(LIME, PURPLE);
		FAWN.setParents(LIME, ROSE_RED);
		MOSS.setParents(LIME, INK_SAC);
		RASPBERRY_GLACE.setParents(PINK, GRAY);
		PUCE.setParents(PINK, LIGHT_GRAY);
		MOONLIGHT_MELODY.setParents(PINK, LAPIS_LAZULI);
		MOUNTBATTEN_PINK.setParents(PINK, CYAN);
		ROSE_GOLD.setParents(PINK, COCOA_BEANS);
		LIGHT_TAUPE.setParents(PINK, CACTUS_GREEN);
		SUPER_PINK.setParents(PINK, PURPLE);
		DARK_TERRA_COTTA.setParents(PINK, ROSE_RED);
		MAUVE_TAUPE.setParents(PINK, INK_SAC);
		FOSSIL.setParents(GRAY, LIGHT_GRAY);
		FULLY_PURPLE.setParents(GRAY, LAPIS_LAZULI);
		CADET.setParents(GRAY, CYAN);
		DARK_LAVA.setParents(GRAY, COCOA_BEANS);
		GRAY_ASPARAGUS.setParents(GRAY, CACTUS_GREEN);
		FRENCH_LILAC.setParents(GRAY, PURPLE);
		DEEP_COFFEE.setParents(GRAY, ROSE_RED);
		PEBBLE.setParents(GRAY, INK_SAC);
		LAVENDER_PURPLE.setParents(LIGHT_GRAY, LAPIS_LAZULI);
		LIGHT_SLATE_GRAY.setParents(LIGHT_GRAY, CYAN);
		PASTEL_BROWN.setParents(LIGHT_GRAY, COCOA_BEANS);
		SAGE.setParents(LIGHT_GRAY, CACTUS_GREEN);
		HEATHER.setParents(LIGHT_GRAY, PURPLE);
		COPPER_ROSE.setParents(LIGHT_GRAY, ROSE_RED);
		DAVY_GREY.setParents(LIGHT_GRAY, INK_SAC);
		TUFTS_BLUE.setParents(LAPIS_LAZULI, CYAN);
		SUNSET_SERENADE.setParents(LAPIS_LAZULI, COCOA_BEANS);
		SLATE_BLUE.setParents(LAPIS_LAZULI, PURPLE);
		COOL_BLACK.setParents(LAPIS_LAZULI, INK_SAC);
		DIM_GRAY.setParents(CYAN, COCOA_BEANS);
		CAMOUFLAGE_GREEN.setParents(CYAN, CACTUS_GREEN);
		MEDIEVAL.setParents(CYAN, PURPLE);
		BAZAAR.setParents(CYAN, ROSE_RED);
		SPRUCE.setParents(CYAN, INK_SAC);
		ARMY_GREEN.setParents(COCOA_BEANS, CACTUS_GREEN);
		ANTIQUE_FUCHSIA.setParents(COCOA_BEANS, PURPLE);
		BOLE.setParents(COCOA_BEANS, ROSE_RED);
		TAUPE.setParents(COCOA_BEANS, INK_SAC);
		OLD_LAVENDER.setParents(CACTUS_GREEN, PURPLE);
		PEANUT.setParents(CACTUS_GREEN, ROSE_RED);
		SEAWEED.setParents(CACTUS_GREEN, INK_SAC);
		DARK_RASPBERRY.setParents(PURPLE, ROSE_RED);
		JOYOUS_SONG.setParents(PURPLE, INK_SAC);
		CAPUT_MORTUUM.setParents(ROSE_RED, INK_SAC);
		LIGHT_GOLDENROD_YELLOW.setParents(BONE_MEAL, BANANA);
		BLONDE.setParents(DANDELION_YELLOW, BANANA);
		PALE_SPRING_BUD.setParents(BONE_MEAL, MEDIUM_SPRING_BUD);
		INCHWORM.setParents(LIME, MEDIUM_SPRING_BUD);
		BOOGER_BUSTER.setParents(DANDELION_YELLOW, MEDIUM_SPRING_BUD);
		JUNE_BUD.setParents(LIME, BANANA);
		ALMOND.setParents(BONE_MEAL, DEEP_PEACH);
		BISCOTTI.setParents(DANDELION_YELLOW, DEEP_PEACH);
		DARK_PURPLE.setParents(INK_SAC, JOYOUS_SONG);
		BLUE_HIGHLIGHT.setParents(LAPIS_LAZULI, COOL_BLACK);
		CLASSIC_ROSE.setParents(BONE_MEAL, BRIGHT_UBE);
		FRENCH_MAUVE.setParents(MAGENTA, BRIGHT_UBE);
		PALE_LAVENDER.setParents(BONE_MEAL, PERIWINKLE);
		LAVENDER_ROSE.setParents(PINK, BRIGHT_UBE);
		DREAMY_HEAVEN.setParents(COOL_BLACK, CAPUT_MORTUUM);
		DENIM.setParents(INK_SAC, COOL_BLACK);
		RICH_LILAC.setParents(MAGENTA, PERIWINKLE);
		CAMBRIDGE_BLUE.setParents(PALE_CORNFLOWER_BLUE, ASPARAGUS);
		MARDI_GRAS.setParents(PURPLE, DARK_RASPBERRY);
		DARK_BYZANTIUM.setParents(INK_SAC, DARK_RASPBERRY);
		WILD_ORCHID.setParents(PINK, PERIWINKLE);
		EGGPLANT.setParents(INK_SAC, PALATINATE_PURPLE);
		DARK_SLATE_BLUE.setParents(LAPIS_LAZULI, JOYOUS_SONG);
		RAW_SIENNA.setParents(MEAT_BROWN, DARK_TERRA_COTTA);
		SAINT_PATRICK_BLUE.setParents(LAPIS_LAZULI, PALATINATE_PURPLE);
		OAT.setParents(BONE_MEAL, MEAT_BROWN);
		THISTLE.setParents(BONE_MEAL, PASTEL_VIOLET);
		BLOSSOMS_IN_SPRING.setParents(MAGENTA, DEEP_PEACH);
		DESERT_SAND.setParents(BONE_MEAL, ANTIQUE_BRASS);
		GIANTS_CLUB.setParents(PEACH, BOLE);
		PINK_PARADE.setParents(MAGENTA, ANTIQUE_BRASS);
		PERSIAN_ORANGE.setParents(ORANGE, ANTIQUE_BRASS);
		SANDSTORM.setParents(DANDELION_YELLOW, MEAT_BROWN);
		LIGHT_SALMON.setParents(PINK, MEAT_BROWN);
		SLATE.setParents(INK_SAC, FRENCH_LILAC);
		OBSESSION.setParents(ROSE_RED, DARK_RASPBERRY);
		PISTACHIO.setParents(BONE_MEAL, DARK_SEA_GREEN);
		HANSA_YELLOW.setParents(DANDELION_YELLOW, DARK_KHAKI);
		PERSIAN_PINK.setParents(PINK, PALE_MAGENTA);
		FREE_SPIRIT.setParents(BONE_MEAL, HEATHER);
		PIGGY_PINK.setParents(BONE_MEAL, LEMONADE);
		COTTON_CANDY.setParents(BONE_MEAL, PALE_MAGENTA);
		FLAMINGO.setParents(PINK, LEMONADE);
		DARK_SALMON.setParents(ORANGE, LEMONADE);
		LAVENDER.setParents(MAGENTA, LEMONADE);
		LATTE.setParents(DANDELION_YELLOW, LEMONADE);
		CANDY_PINK.setParents(PINK, PEACH);
		DARK_MAGENTA.setParents(PURPLE, FANDANGO);
		INDIAN_YELLOW.setParents(DANDELION_YELLOW, PEACH);
		PASTEL_MAGENTA.setParents(PINK, WISTERIA);
		REGALIA.setParents(MEDIUM_SLATE_BLUE, JOYOUS_SONG);
		DEEP_FUCHSIA.setParents(MAGENTA, SUPER_PINK);
		MEDIUM_ORCHID.setParents(MAGENTA, PALE_MAGENTA);
		DEEP_CHESTNUT.setParents(ROSE_RED, PEACH);
		BAKED_CLAY.setParents(ORANGE, TURKISH_ROSE);
		GRANOLA.setParents(DANDELION_YELLOW, ANTIQUE_BRASS);
		ATOMIC_TANGERINE.setParents(ORANGE, PEACH);
		ACID_GREEN.setParents(DANDELION_YELLOW, SCIENCE_EXPERIMENT);
		PURPLE_PLUM.setParents(PURPLE, PALE_MAGENTA);
		YELLOW_GREEN.setParents(LIME, SCIENCE_EXPERIMENT);
		HYPER.setParents(DANDELION_YELLOW, DARK_SEA_GREEN);
		DOLLAR_BILL.setParents(LIME, DARK_SEA_GREEN);
		PALE_CHESTNUT.setParents(BONE_MEAL, TURKISH_ROSE);
		BLANCHED_ALMOND.setParents(MEDIUM_SPRING_BUD, LEMONADE);
		LANGUID_LAVENDER.setParents(BONE_MEAL, WISTERIA);
		RASPBERRY_ROSE.setParents(ROSE_RED, FANDANGO);
		PATRIARCH.setParents(MAGENTA, DARK_RASPBERRY);
		FLAXEN.setParents(MEAT_BROWN, HAZELNUT);
		BRIGHT_LILAC.setParents(MAGENTA, WISTERIA);
		BYZANTINE.setParents(MAGENTA, FANDANGO);
		MAIZE.setParents(DANDELION_YELLOW, OLD_GOLD);
		BLUSH.setParents(BONE_MEAL, SUPER_PINK);
		THULIAN_PINK.setParents(PINK, SUPER_PINK);
		LILAC.setParents(MAGENTA, MOONLIGHT_MELODY);
		ROYAL_PURPLE.setParents(MAUVE, SLATE_BLUE);
		SAND_DOLLAR.setParents(BONE_MEAL, DARK_KHAKI);
		PLUM.setParents(ROSE_RED, PALATINATE_PURPLE);
		HALAYA_UBE.setParents(INK_SAC, FANDANGO);
		IRIS.setParents(LAPIS_LAZULI, PALE_MAGENTA);
		STRAW.setParents(DANDELION_YELLOW, HAZEL_WOOD);
		SKY_MAGENTA.setParents(PINK, MOONLIGHT_MELODY);
		MEDIUM_PURPLE.setParents(LAPIS_LAZULI, SUPER_PINK);
		CHERISH_THE_MOMENT.setParents(BONE_MEAL, MOONLIGHT_MELODY);
		PALE_COPPER.setParents(ORANGE, OLD_ROSE);
		BRIGHT_LAVENDER.setParents(MAGENTA, PALE_CORNFLOWER_BLUE);
		PEARLY_PURPLE.setParents(PINK, MAUVE);
		BONE.setParents(BONE_MEAL, HAZEL_WOOD);
		GLITTER.setParents(BONE_MEAL, PALE_CORNFLOWER_BLUE);
		PEACH_PUFF.setParents(BONE_MEAL, MACARONI_AND_CHEESE);
		PINK_PEARL.setParents(PINK, PALE_CORNFLOWER_BLUE);
		MOSS_GREEN.setParents(LIME, PALE_CORNFLOWER_BLUE);
		ROSE_QUARTZ.setParents(BONE_MEAL, OPERA_MAUVE);
		INDIGO.setParents(LAPIS_LAZULI, MAUVE);
		DEEP_LILAC.setParents(MAGENTA, UBE);
		SANDY_BROWN.setParents(ORANGE, MACARONI_AND_CHEESE);
		PURPUREUS.setParents(MAGENTA, BYZANTIUM);
		EMINENCE.setParents(PURPLE, JOYOUS_SONG);
		ORANGE_YELLOW.setParents(DANDELION_YELLOW, MACARONI_AND_CHEESE);
		SILVER.setParents(PALE_CORNFLOWER_BLUE, MOUNTBATTEN_PINK);
		DARK_PASTEL_BLUE.setParents(LIGHT_BLUE, PALE_CORNFLOWER_BLUE);
		DARK_LAVENDER.setParents(PURPLE, COOL_BLACK);
		PASTEL_PURPLE.setParents(BONE_MEAL, BYZANTIUM);
		REBECCA_PURPLE.setParents(MAGENTA, FRENCH_LILAC);
		MELON.setParents(BONE_MEAL, PEACH);
		PURPLE_HEART.setParents(MAGENTA, COOL_BLACK);
		MAUVELOUS.setParents(PINK, OLD_ROSE);
		RICH_LAVENDER.setParents(MAGENTA, HEATHER);
		PALE_PINK.setParents(BONE_MEAL, OLD_ROSE);
		PURPLE_TAUPE.setParents(INK_SAC, MAUVE_TAUPE);
		OYSTER.setParents(BONE_MEAL, SCIENCE_EXPERIMENT);
		DARK_TAN.setParents(MEAT_BROWN, SPRUCE);
		SAND.setParents(DANDELION_YELLOW, OLD_ROSE);
		LIGHT_PASTEL_PURPLE.setParents(BRIGHT_UBE, GREEN_BLUE);
		BEIGE.setParents(BONE_MEAL, OLD_GOLD);
		LIBERTY.setParents(LAPIS_LAZULI, FRENCH_LILAC);
		LION.setParents(MEAT_BROWN, DIM_GRAY);
		SALMON.setParents(PINK, MACARONI_AND_CHEESE);
		OLIVE.setParents(LIME, HAZEL_WOOD);
		PURPLE_MOUNTAIN_MAJESTY.setParents(LAPIS_LAZULI, FANDANGO);
		BENGAL_GRASS.setParents(GRAY, MEAT_BROWN);
		TAFFY.setParents(MAGENTA, PEACH);
		TORTILLA.setParents(LIME, FANDANGO);
		ANDROID_GREEN.setParents(LIME, OLD_GOLD);
	}

	static {
		for (Dye dye : values()) {
			dye.uses.sort((a, b) -> {
				int pA = (a.parentOne == dye ? a.parentTwo : a.parentOne).ordinal();
				int pB = (b.parentOne == dye ? b.parentTwo : b.parentOne).ordinal();
				return pA - pB;
			});
		}
	}

	private static final String LOCALIZATION_KEY_FORMAT = "dye.%s";

	private static final String LOCALIZATION_KEY_COMPLETE_FORMAT = LOCALIZATION_KEY_FORMAT + ".name";

	public static final int VANILLA_DYE_COUNT = 16;

	public static final byte NO_DYE = 0;

	private int color;

	private DyeType type;

	private String unlocalizedName;

	private String completeUnlocalizedName;

	private Dye parentOne;

	private Dye parentTwo;

	private byte byteValue;

	private int damage;

	private int brushValue;

	private List<Dye> uses;

	private Dye(int color, DyeType type) {
		this.color = color | 0xFF000000;
		this.type = type;
		String lowerCamelName = Util.getEnumLowerCamelName(this);
		unlocalizedName = String.format(LOCALIZATION_KEY_FORMAT, lowerCamelName);
		completeUnlocalizedName = String.format(LOCALIZATION_KEY_COMPLETE_FORMAT, lowerCamelName);
		byteValue = (byte) (ordinal() + 1);
		damage = isVanilla() ? EnumDyeColor.byMetadata(ordinal()).getDyeDamage() : ordinal() - VANILLA_DYE_COUNT;
		brushValue = ordinal() + 1;
		uses = new ArrayList<Dye>();
	}

	public int getColor() {
		return color;
	}

	public DyeType getType() {
		return type;
	}

	public String getUnlocalizedName() {
		return unlocalizedName;
	}

	public String getCompleteUnlocalizedName() {
		return completeUnlocalizedName;
	}

	public byte getByteValue() {
		return byteValue;
	}

	public int getDamage() {
		return damage;
	}

	public int getBrushValue() {
		return brushValue;
	}

	public Dye getParentOne() {
		return parentOne;
	}

	public Dye getParentTwo() {
		return parentTwo;
	}

	private void setParents(Dye parentOne, Dye parentTwo) {
		this.parentOne = parentOne;
		this.parentTwo = parentTwo;
		parentOne.uses.add(this);
		parentTwo.uses.add(this);
	}

	public boolean isVanilla() {
		return ordinal() < VANILLA_DYE_COUNT;
	}

	public ItemStack createItemStack() {
		return createItemStack(1);
	}

	public ItemStack createItemStack(int amount) {
		return new ItemStack(isVanilla() ? Items.DYE : PaintThis.dye, amount, damage);
	}

	public List<Dye> getUses() {
		return uses;
	}

	public static Dye getDyeFromByte(byte b) {
		if (b == NO_DYE) {
			throw new IllegalArgumentException("Not a dye!");
		}
		return values()[Byte.toUnsignedInt(b) - 1];
	}

	public static Dye getDyeFromDyeItemStack(ItemStack stack) {
		if (stack.getItem() == PaintThis.dye) {
			return getDyeFromDamage(stack.getMetadata() + VANILLA_DYE_COUNT);
		}
		int vanillaDyeMetadata = EnumDyeColor.byDyeDamage(DyeOreDictHelper.getDyeDamage(stack)).getMetadata();
		if (vanillaDyeMetadata > -1) {
			return values()[vanillaDyeMetadata];
		}
		throw new IllegalArgumentException("Non-dye item stack! " + stack);
	}

	public static Dye getDyeFromMetadata(ItemStack stack) {
		return getDyeFromDamage(stack.getMetadata());
	}

	public static Dye getDyeFromDamage(int damage) {
		Dye[] dyes = values();
		return dyes[damage < 0 || damage >= dyes.length ? 0 : damage];
	}
}
