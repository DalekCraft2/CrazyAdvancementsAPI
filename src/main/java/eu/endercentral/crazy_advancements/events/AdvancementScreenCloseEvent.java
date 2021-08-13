package eu.endercentral.crazy_advancements.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

public class AdvancementScreenCloseEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final Player player;

    public AdvancementScreenCloseEvent(Player player) {
        super(true);
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @return Player closing his advancement screen
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return Information about this event
     */
    public String getInformationString() {
        return "tab_action=close;player=" + player.getName();
    }

}
