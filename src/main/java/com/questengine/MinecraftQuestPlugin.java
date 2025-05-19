package com.questengine;

import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftQuestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("quest").setExecutor(new QuestCommand());
        getLogger().info("✅ Minecraft Quest Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("🛑 Minecraft Quest Plugin Disabled!");
    }
}
