package eu.endercentral.crazy_advancements.events.offline;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import java.util.UUID;

/**
 * This {@link Event} is called whenever an {@link org.bukkit.OfflinePlayer}'s criteria progress is changed.
 */
public class OfflineCriteriaProgressChangeEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final UUID uuid;
    private final int progressBefore;
    private int progress;

    public OfflineCriteriaProgressChangeEvent(AdvancementManager manager, Advancement advancement, UUID uuid, int progressBefore, int progress) {
        this.manager = manager;
        this.advancement = advancement;
        this.uuid = uuid;
        this.progressBefore = progressBefore;
        this.progress = progress;
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

    /**
     * Returns the {@link org.bukkit.entity.Player}'s initial progress.
     *
     * @return the {@link org.bukkit.entity.Player}'s initial progress
     */
    public int getProgressBefore() {
        return progressBefore;
    }

    /**
     * Returns the {@link org.bukkit.entity.Player}'s new progress.
     *
     * @return the {@link org.bukkit.entity.Player}'s new progress
     */
    public int getProgress() {
        return progress;
    }

    /**
     * Sets the {@link org.bukkit.entity.Player}'s progress.
     *
     * @param progress the new progress value
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

}
