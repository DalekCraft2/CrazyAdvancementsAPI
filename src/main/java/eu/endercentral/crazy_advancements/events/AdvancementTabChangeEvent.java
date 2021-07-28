package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.NameKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

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
     * @return Player changing his advancement tab
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return Tab the Player is changing to
     */
    public NameKey getTabAdvancement() {
        return tabAdvancement;
    }

    /**
     * Changes the tab the player is changing to
     *
     * @param tabAdvancement The new tab the player will change to
     */
    public void setTabAdvancement(NameKey tabAdvancement) {
        this.tabAdvancement = tabAdvancement;
    }


    /**
     * @return Information about this event
     */
    public String getInformationString() {
        return "tab_action=change;player=" + player.getName() + ";tab=" + tabAdvancement.getNamespace() + ":" + tabAdvancement.getKey() + ",cancelled=" + cancelled;
    }

}