package io.github.noeppi_noeppi.mods.dupkeys;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlclient.registry.ClientRegistry;

@Mod("dupkeys")
public class DupKeys {

    public static final String MODID = "dupkeys";
    
    public DupKeys() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, DupConfig.CLIENT_CONFIG);
        //noinspection CodeBlock2Expr
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        });
    }

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
