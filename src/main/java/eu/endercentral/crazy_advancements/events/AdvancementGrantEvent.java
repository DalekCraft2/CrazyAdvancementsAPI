package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This {@link Event} is called whenever an {@link Advancement} is granted to a {@link Player}.
 */
public class AdvancementGrantEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final Player player;
    private boolean displayMessage;

    public AdvancementGrantEvent(AdvancementManager manager, Advancement advancement, Player player, boolean displayMessage) {
        this.manager = manager;
        this.advancement = advancement;
        this.player = player;
        this.displayMessage = displayMessage;
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
     * Returns the {@link AdvancementManager} which is firing this {@link Event}.
     *
     * @return the {@link AdvancementManager} which is firing this {@link Event}
     */
    public AdvancementManager getManager() {
        return manager;
    }

    /**
     * Returns the {@link Advancement} that is being granted.
     *
     * @return the {@link Advancement} that is being granted
     */
    public Advancement getAdvancement() {
        return advancement;
    }

    /**
     * Returns the {@link Player} to whom the {@link Advancement} is being granted.
     *
     * @return the {@link Player} to whom the {@link Advancement} is being granted
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns whether a message will be displayed.
     *
     * @return true if a message will be displayed
     */
    public boolean isDisplayMessage() {
        return displayMessage;
    }

    /**
     * Sets whether a message will be displayed.
     *
     * @param displayMessage whether the message will be displayed
     */
    public void setDisplayMessage(boolean displayMessage) {
        this.displayMessage = displayMessage;
    }

}
