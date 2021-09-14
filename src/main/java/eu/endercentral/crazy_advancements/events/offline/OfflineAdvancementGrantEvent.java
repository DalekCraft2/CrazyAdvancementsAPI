package eu.endercentral.crazy_advancements.events.offline;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import java.util.UUID;

/**
 * This {@link Event} is called whenever an {@link Advancement} is granted to an {@link org.bukkit.OfflinePlayer}.
 */
public class OfflineAdvancementGrantEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final UUID uuid;

    public OfflineAdvancementGrantEvent(AdvancementManager manager, Advancement advancement, UUID uuid) {
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
     * Returns the {@link Advancement} that is being granted.
     *
     * @return the {@link Advancement} that is being granted
     */
    public Advancement getAdvancement() {
        return advancement;
    }

    /**
     * Returns the {@link UUID} of the {@link org.bukkit.entity.Player} to whom the {@link Advancement} is being granted.
     *
     * @return the {@link UUID} of the {@link org.bukkit.entity.Player} to whom the {@link Advancement} is being granted
     */
    public UUID getUUID() {
        return uuid;
    }

}
