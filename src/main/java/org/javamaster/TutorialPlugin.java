package org.javamaster;

import org.bukkit.plugin.java.JavaPlugin;

public class TutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("TutorialPlugin enabled!");
    }
}
