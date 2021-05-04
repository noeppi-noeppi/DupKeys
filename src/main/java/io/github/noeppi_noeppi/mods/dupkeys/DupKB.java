package io.github.noeppi_noeppi.mods.dupkeys;

import net.minecraft.client.settings.KeyBinding;

public class DupKB extends KeyBinding {

    private final int id;
    
    public DupKB(int id) {
        super(DupKeys.MODID+ ".key." + id, -1, DupKeys.MODID + ".keys");
        this.id = id;
    }

    @Override
    public void setPressed(boolean value) {
        String kbId;
        switch (this.id) {
            case 1: kbId = DupConfig.kb1.get(); break;
            case 2: kbId = DupConfig.kb2.get(); break;
            case 3: kbId = DupConfig.kb3.get(); break;
            case 4: kbId = DupConfig.kb4.get(); break;
            case 5: kbId = DupConfig.kb5.get(); break;
            case 6: kbId = DupConfig.kb6.get(); break;
            case 7: kbId = DupConfig.kb7.get(); break;
            case 8: kbId = DupConfig.kb8.get(); break;
            default: kbId = null; break;
        }
        if (kbId != null) {
            KeyBinding kb = KeyBinding.KEYBIND_ARRAY.get(kbId);
            if (kb != null && !(kb instanceof DupKB)) {
                kb.setPressed(value);
            }
        }
        super.setPressed(value);
    }
}
