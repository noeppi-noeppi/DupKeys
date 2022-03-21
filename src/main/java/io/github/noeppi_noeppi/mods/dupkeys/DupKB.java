package io.github.noeppi_noeppi.mods.dupkeys;

import net.minecraft.client.KeyMapping;

public class DupKB extends KeyMapping {

    private final int id;
    
    public DupKB(int id) {
        super(DupKeys.getInstance().modid + ".key." + id, -1, DupKeys.getInstance().modid + ".keys");
        this.id = id;
    }

    @Override
    public void setDown(boolean value) {
        String kbId = switch (this.id) {
            case 1 -> DupConfig.virtual_key_1.orElse(null);
            case 2 -> DupConfig.virtual_key_2.orElse(null);
            case 3 -> DupConfig.virtual_key_3.orElse(null);
            case 4 -> DupConfig.virtual_key_4.orElse(null);
            case 5 -> DupConfig.virtual_key_5.orElse(null);
            case 6 -> DupConfig.virtual_key_6.orElse(null);
            case 7 -> DupConfig.virtual_key_7.orElse(null);
            case 8 -> DupConfig.virtual_key_8.orElse(null);
            default -> null;
        };
        if (kbId != null) {
            KeyMapping kb = KeyMapping.ALL.get(kbId);
            if (kb != null && !(kb instanceof DupKB)) {
                kb.setDown(value);
            }
        }
        super.setDown(value);
    }
}
