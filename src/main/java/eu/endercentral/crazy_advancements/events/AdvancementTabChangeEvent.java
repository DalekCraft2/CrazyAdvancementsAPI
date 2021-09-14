package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.NameKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This {@link Event} is called whenever a {@link Player} changes the tab of the {@link Advancement} screen.
 */
public class AdvancementTabChangeEvent extends Event implements Cancellable {

    public static final HandlerList handlers = new HandlerList();
    private final Player player;
    private NameKey tabAdvancement;
    private boolean cancelled;

    public AdvancementTabChangeEvent(Player player, NameKey tabAdvancement) {
        super(true);
        this.player = player;
        this.tabAdvancement = tabAdvancement;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Returns the {@link Player} who is changing the {@link Advancement} tab.
     *
     * @return the {@link Player} who is changing the {@link Advancement} tab
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns the tab to which the {@link Player} is changing.
     *
     * @return the tab to which the {@link Player} is changing.
     */
    public NameKey getTabAdvancement() {
        return tabAdvancement;
    }

    /**
     * Sets the tab to which the {@link Player} is changing.
     *
     * @param tabAdvancement the tab to which the {@link Player} is changing
     */
    public void setTabAdvancement(NameKey tabAdvancement) {
        this.tabAdvancement = tabAdvancement;
    }

    /**
     * Returns information about this {@link Event}.
     *
     * @return information about this {@link Event}
     */
    public String getInformationString() {
        return "tab_action=change;player=" + player.getName() + ";tab=" + tabAdvancement.getNamespace() + ":" + tabAdvancement.getKey() + ",cancelled=" + cancelled;
    }

}
