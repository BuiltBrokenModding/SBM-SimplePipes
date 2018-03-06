package com.builtbroken.simplepipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 3/6/2018.
 */
@Mod(modid = SimplePipes.DOMAIN, name = "[SBM] Simple Pipes", version = SimplePipes.VERSION)
@Mod.EventBusSubscriber
public class SimplePipes
{
    public static final String DOMAIN = "simplepipes";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> registryEvent)
    {

    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> registryEvent)
    {

    }

    @SubscribeEvent
    public static void registerModel(ModelRegistryEvent registryEvent)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
