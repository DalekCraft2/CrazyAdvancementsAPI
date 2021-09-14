package eu.endercentral.crazy_advancements;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.network.chat.IChatBaseComponent;
import net.minecraft.network.chat.IChatBaseComponent.ChatSerializer;

public class JSONMessage {

    private final BaseComponent json;

    /**
     * @param json a JSON representation of an in-game message
     * @see <a href="https://github.com/skylinerw/guides/blob/master/java/text%20component.md">Text Component</a>
     */
    public JSONMessage(BaseComponent json) {
        this.json = json;
    }

    /**
     * @return the JSON representation of an in-game message
     */
    public BaseComponent getJson() {
        return json;
    }

    /**
     * @return an {@link IChatBaseComponent} representation of an in-game message
     */
    public IChatBaseComponent getBaseComponent() {
        return ChatSerializer.a(ComponentSerializer.toString(json));
    }

    @Override
    public String toString() {
        return json.toPlainText();
    }

}
