package eu.endercentral.crazy_advancements.events.offline;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import java.util.UUID;

/**
 * This {@link Event} is called whenever an {@link Advancement} is revoked from an {@link org.bukkit.OfflinePlayer}.
 */
public class OfflineAdvancementRevokeEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final UUID uuid;

    public OfflineAdvancementRevokeEvent(AdvancementManager manager, Advancement advancement, UUID uuid) {
        this.manager = manager;
        this.advancement = advancement;
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
     * Returns the {@link Advancement} that is being revoked.
     *
     * @return the {@link Advancement} that is being revoked
     */
    public Advancement getAdvancement() {
        return advancement;
    }

    /**
     * Returns the {@link UUID} of the {@link org.bukkit.entity.Player} from whom the {@link Advancement} is being revoked.
     *
     * @return the {@link UUID} of the {@link org.bukkit.entity.Player} from whom the {@link Advancement} is being revoked
     */
    public UUID getUUID() {
        return uuid;
    }

}
