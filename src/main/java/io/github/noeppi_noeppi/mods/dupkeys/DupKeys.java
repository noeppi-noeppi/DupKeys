package io.github.noeppi_noeppi.mods.dupkeys;

import io.github.noeppi_noeppi.libx.mod.ModX;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nonnull;

@Mod("dupkeys")
public final class DupKeys extends ModX {

    private static DupKeys instance;
    
    public DupKeys() {
        instance = this;
    }
    
    @Nonnull
    public static DupKeys getInstance() {
        return instance;
    }

    @Override
    protected void setup(FMLCommonSetupEvent event) {
        
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    protected void clientSetup(FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(new DupKB(1));
        ClientRegistry.registerKeyBinding(new DupKB(2));
        ClientRegistry.registerKeyBinding(new DupKB(3));
        ClientRegistry.registerKeyBinding(new DupKB(4));
        ClientRegistry.registerKeyBinding(new DupKB(5));
        ClientRegistry.registerKeyBinding(new DupKB(6));
        ClientRegistry.registerKeyBinding(new DupKB(7));
        ClientRegistry.registerKeyBinding(new DupKB(8));
    }
}
