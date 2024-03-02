package xyz.mrcraftteammc.grasslauncher.common;

import org.slf4j.Logger;
import xyz.mrcraftteammc.grasslauncher.extension.Extension;
import xyz.mrcraftteammc.grasslauncher.extension.exception.ExtensionException;

public class DefaultExtension extends Extension {
    private final Logger logger = super.getLogger();

    public DefaultExtension() {
        super("grasslauncher");
    }

    @Override
    public void onLoad() throws ExtensionException {
        this.logger.info("Hello DefaultExtension!");
    }

    @Override
    public void onEnabled() throws ExtensionException {
        super.onEnabled();
    }

    @Override
    public void onDisabled() throws ExtensionException {
        super.onDisabled();
    }
}
