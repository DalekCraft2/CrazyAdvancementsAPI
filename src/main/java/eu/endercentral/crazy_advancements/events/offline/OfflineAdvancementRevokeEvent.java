package eu.endercentral.crazy_advancements.events.offline;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import java.util.UUID;

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
     * @return The Manager this event has been fired from
     */
    public AdvancementManager getManager() {
        return manager;
    }

    /**
     * @return The Advancement that has been revoked
     */
    public Advancement getAdvancement() {
        return advancement;
    }

    /**
     * @return Receiver UUID
     */
    public UUID getUUID() {
        return uuid;
    }


}