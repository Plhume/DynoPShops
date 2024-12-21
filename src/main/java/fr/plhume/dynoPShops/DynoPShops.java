package fr.plhume.dynoPShops;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class DynoPShops extends JavaPlugin {

    private FileConfiguration config = null;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();

        if (!Objects.equals(config.getString("plugin-version"), getDescription().getVersion())) {
            getLogger().warning("""
                    ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗
                    ║                                 An update is available for plugin configuration                                 ║
                    ║            The update has NOT been applied because it would have replaced your actual configuration             ║
                    ║        To update without losing your configuration, please rename the file config.yml to config.yml.old         ║
                    ║          Restart your server, it will automatically recreate the config.yml file with the new version           ║
                    ║ Finally all you have to do is open both files and put back your old configurations (and customize the new ones) ║
                    ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
                    """);
        }

        getLogger().info("DynoPShops has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("DynoPShops has been disabled.");
    }

}
