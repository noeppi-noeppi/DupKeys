package io.github.noeppi_noeppi.mods.dupkeys;

import io.github.noeppi_noeppi.libx.annotation.config.RegisterConfig;
import io.github.noeppi_noeppi.libx.config.Config;

import java.util.Optional;

@RegisterConfig(client = true)
@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class DupConfig {

    @Config public static Optional<String> virtual_key_1 = Optional.empty();
    @Config public static Optional<String> virtual_key_2 = Optional.empty();
    @Config public static Optional<String> virtual_key_3 = Optional.empty();
    @Config public static Optional<String> virtual_key_4 = Optional.empty();
    @Config public static Optional<String> virtual_key_5 = Optional.empty();
    @Config public static Optional<String> virtual_key_6 = Optional.empty();
    @Config public static Optional<String> virtual_key_7 = Optional.empty();
    @Config public static Optional<String> virtual_key_8 = Optional.empty();
}
