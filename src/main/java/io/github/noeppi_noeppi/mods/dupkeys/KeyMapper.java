package io.github.noeppi_noeppi.mods.dupkeys;

import com.google.gson.JsonPrimitive;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import org.moddingx.libx.annotation.config.RegisterMapper;
import org.moddingx.libx.config.gui.ConfigEditor;
import org.moddingx.libx.config.mapper.ValueMapper;
import org.moddingx.libx.config.validator.ValidatorInfo;

@RegisterMapper
public class KeyMapper implements ValueMapper<KeyString, JsonPrimitive> {

    @Override
    public Class<KeyString> type() {
        return KeyString.class;
    }

    @Override
    public Class<JsonPrimitive> element() {
        return JsonPrimitive.class;
    }

    @Override
    public KeyString fromJson(JsonPrimitive json) {
        return new KeyString(json.getAsString());
    }

    @Override
    public JsonPrimitive toJson(KeyString value) {
        return new JsonPrimitive(value.value());
    }

    @Override
    public KeyString fromNetwork(FriendlyByteBuf buffer) {
        return new KeyString(buffer.readUtf());
    }

    @Override
    public void toNetwork(KeyString value, FriendlyByteBuf buffer) {
        buffer.writeUtf(value.value());
    }

    @Override
    public ConfigEditor<KeyString> createEditor(ValidatorInfo<?> validator) {
        return ConfigEditor.toggle(KeyMapping.ALL.keySet().stream().filter(id -> !id.startsWith("dupkeys.key.")).sorted().map(KeyString::new).toList(), k -> Component.literal(k.value()));
    }
}
