package io.github.noeppi_noeppi.mods.dupkeys;

import com.google.gson.JsonPrimitive;
import io.github.noeppi_noeppi.libx.annotation.config.RegisterMapper;
import io.github.noeppi_noeppi.libx.config.ValidatorInfo;
import io.github.noeppi_noeppi.libx.config.ValueMapper;
import io.github.noeppi_noeppi.libx.config.gui.ConfigEditor;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.FriendlyByteBuf;

import java.util.List;

@RegisterMapper
public class KeyMapper implements ValueMapper<String, JsonPrimitive> {

    @Override
    public Class<String> type() {
        return String.class;
    }

    @Override
    public Class<JsonPrimitive> element() {
        return JsonPrimitive.class;
    }

    @Override
    public String fromJson(JsonPrimitive json) {
        return json.getAsString();
    }

    @Override
    public JsonPrimitive toJson(String value) {
        return new JsonPrimitive(value);
    }

    @Override
    public String fromNetwork(FriendlyByteBuf buffer) {
        return buffer.readUtf();
    }

    @Override
    public void toNetwork(String value, FriendlyByteBuf buffer) {
        buffer.writeUtf(value);
    }

    @Override
    public ConfigEditor<String> createEditor(ValidatorInfo<?> validator) {
        return ConfigEditor.toggle(List.copyOf(KeyMapping.ALL.keySet()));
    }
}
