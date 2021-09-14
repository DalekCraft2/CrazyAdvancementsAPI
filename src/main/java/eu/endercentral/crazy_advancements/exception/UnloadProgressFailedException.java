package eu.endercentral.crazy_advancements.exception;

import java.io.Serial;
import java.util.UUID;

/**
 * An {@link UnloadProgressFailedException} is thrown when an {@link eu.endercentral.crazy_advancements.manager.AdvancementManager} fails to unload a {@link org.bukkit.entity.Player}'s {@link eu.endercentral.crazy_advancements.Advancement} progress.
 */
public class UnloadProgressFailedException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 5052062325162108824L;

    private UUID uuid;
    private String message = "Unable to unload Progress for online Players!";

    public UnloadProgressFailedException(UUID uuid) {
        this.uuid = uuid;
    }

    public UnloadProgressFailedException(UUID uuid, String message) {
        this.uuid = uuid;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Failed to unload Advancement Progress for Player with UUID " + uuid + ": " + message;
    }

}
