package io.github.noeppi_noeppi.mods.dupkeys;

import net.minecraft.client.KeyMapping;

public class DupKB extends KeyMapping {

    private final int id;
    
    public DupKB(int id) {
        super(DupKeys.MODID+ ".key." + id, -1, DupKeys.MODID + ".keys");
        this.id = id;
    }

    @Override
    public void setDown(boolean value) {
        String kbId = switch (this.id) {
            case 1 -> DupConfig.kb1.get();
            case 2 -> DupConfig.kb2.get();
            case 3 -> DupConfig.kb3.get();
            case 4 -> DupConfig.kb4.get();
            case 5 -> DupConfig.kb5.get();
            case 6 -> DupConfig.kb6.get();
            case 7 -> DupConfig.kb7.get();
            case 8 -> DupConfig.kb8.get();
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
