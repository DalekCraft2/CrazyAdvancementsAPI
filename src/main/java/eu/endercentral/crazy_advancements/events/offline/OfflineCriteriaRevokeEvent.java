package eu.endercentral.crazy_advancements.events.offline;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import java.util.UUID;

/**
 * This {@link Event} is called whenever criteria are revoked from an {@link org.bukkit.OfflinePlayer}.
 */
public class OfflineCriteriaRevokeEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final String[] criteria;
    private final UUID uuid;

    public OfflineCriteriaRevokeEvent(AdvancementManager manager, Advancement advancement, String[] criteria, UUID uuid) {
        this.manager = manager;
        this.advancement = advancement;
        this.criteria = criteria;
        this.uuid = uuid;
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
     * Returns the {@link UUID} of the {@link org.bukkit.entity.Player} from whom the criteria is being revoked.
     *
     * @return the {@link UUID} of the {@link org.bukkit.entity.Player} from whom the criteria is being revoked
     */
    public UUID getUuid() {
        return uuid;
    }

}
