package io.github.noeppi_noeppi.mods.dupkeys;

import net.minecraftforge.common.ForgeConfigSpec;

public class DupConfig {

    public static final ForgeConfigSpec CLIENT_CONFIG;
    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

    static {
        init(CLIENT_BUILDER);
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    public static ForgeConfigSpec.ConfigValue<String> kb1;
    public static ForgeConfigSpec.ConfigValue<String> kb2;
    public static ForgeConfigSpec.ConfigValue<String> kb3;
    public static ForgeConfigSpec.ConfigValue<String> kb4;
    public static ForgeConfigSpec.ConfigValue<String> kb5;
    public static ForgeConfigSpec.ConfigValue<String> kb6;
    public static ForgeConfigSpec.ConfigValue<String> kb7;
    public static ForgeConfigSpec.ConfigValue<String> kb8;

    public static void init(ForgeConfigSpec.Builder builder) {
        kb1 = builder.define("kb1", "key.use");
        kb2 = builder.define("kb2", "key.use");
        kb3 = builder.define("kb3", "key.use");
        kb4 = builder.define("kb4", "key.use");
        kb5 = builder.define("kb5", "key.use");
        kb6 = builder.define("kb6", "key.use");
        kb7 = builder.define("kb7", "key.use");
        kb8 = builder.define("kb8", "key.use");
    }
}
