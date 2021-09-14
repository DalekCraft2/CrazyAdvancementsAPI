package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This {@link Event} is called whenever an {@link Advancement} is revoked from a {@link Player}.
 */
public class AdvancementRevokeEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final Player player;

    public AdvancementRevokeEvent(AdvancementManager advancementManager_v2, Advancement advancement, Player player) {
        this.manager = advancementManager_v2;
        this.advancement = advancement;
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
     * Returns the {@link AdvancementManager} which is firing this {@link Event}.
     *
     * @return the {@link AdvancementManager} which is firing this {@link Event}
     */
    public AdvancementManager getManager() {
        return manager;
    }

    /**
     * Returns the {@link Advancement} that is being revoked.
     *
     * @return the {@link Advancement} that is being revoked
     */
    public Advancement getAdvancement() {
        return advancement;
    }

    /**
     * Returns the {@link Player} from whom the {@link Advancement} is being revoked.
     *
     * @return the {@link Player} from whom the {@link Advancement} is being revoked
     */
    public Player getPlayer() {
        return player;
    }

}
