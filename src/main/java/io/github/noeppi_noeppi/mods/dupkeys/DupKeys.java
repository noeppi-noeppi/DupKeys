package io.github.noeppi_noeppi.mods.dupkeys;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.moddingx.libx.mod.ModX;

import javax.annotation.Nonnull;

@Mod("dupkeys")
public final class DupKeys extends ModX {

    private static DupKeys instance;
    
    public DupKeys() {
        instance = this;
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerKeyBinds));
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
        
    }
    
    @OnlyIn(Dist.CLIENT)
    private void registerKeyBinds(RegisterKeyMappingsEvent event) {
        event.register(new DupKB(1));
        event.register(new DupKB(2));
        event.register(new DupKB(3));
        event.register(new DupKB(4));
        event.register(new DupKB(5));
        event.register(new DupKB(6));
        event.register(new DupKB(7));
        event.register(new DupKB(8));
    }
}
