package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This {@link Event} is called whenever a {@link Player} closes the {@link Advancement} screen.
 */
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
     * Returns the {@link Player} who is closing the {@link Advancement} screen.
     *
     * @return the {@link Player} who is closing the {@link Advancement} screen
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns information about this {@link Event}.
     *
     * @return information about this {@link Event}
     */
    public String getInformationString() {
        return "tab_action=close;player=" + player.getName();
    }

}
