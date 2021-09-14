package eu.endercentral.crazy_advancements.events;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This {@link Event} is called whenever an {@link Player}'s criteria progress is changed.
 */
public class CriteriaProgressChangeEvent extends Event {

    public static final HandlerList handlers = new HandlerList();
    private final AdvancementManager manager;
    private final Advancement advancement;
    private final Player player;
    private final int progressBefore;
    private int progress;

    public CriteriaProgressChangeEvent(AdvancementManager manager, Advancement advancement, Player player, int progressBefore, int progress) {
        this.manager = manager;
        this.advancement = advancement;
        this.player = player;
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
     * Returns the {@link Player} to whom the {@link Advancement} is being granted.
     *
     * @return the {@link Player} to whom the {@link Advancement} is being granted
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns the {@link Player}'s initial progress.
     *
     * @return the {@link Player}'s initial progress
     */
    public int getProgressBefore() {
        return progressBefore;
    }

    /**
     * Returns the {@link Player}'s new progress.
     *
     * @return the {@link Player}'s new progress
     */
    public int getProgress() {
        return progress;
    }

    /**
     * Sets the {@link Player}'s progress.
     *
     * @param progress the new progress value
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

}
