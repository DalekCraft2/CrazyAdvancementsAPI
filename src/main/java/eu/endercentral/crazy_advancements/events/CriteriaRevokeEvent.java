package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This {@link Event} is called whenever criteria are revoked from a {@link Player}.
 */
public class CriteriaRevokeEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final String[] criteria;
    private final Player player;

    public CriteriaRevokeEvent(AdvancementManager manager, Advancement advancement, String[] criteria, Player player) {
        this.manager = manager;
        this.advancement = advancement;
        this.criteria = criteria;
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
     * Returns the {@link Advancement} to which the criteria belong.
     *
     * @return the {@link Advancement} to which the criteria belong
     */
    public Advancement getAdvancement() {
        return advancement;
    }

    /**
     * Returns the criteria that is being revoked.
     *
     * @return the criteria that is being revoked
     */
    public String[] getCriteria() {
        return criteria;
    }

    /**
     * Returns the {@link Player} from whom the criteria is being revoked.
     *
     * @return the {@link Player} from whom the criteria is being revoked
     */
    public Player getPlayer() {
        return player;
    }

}
