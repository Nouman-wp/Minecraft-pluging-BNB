package com.questengine;

import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftQuestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Initialize QuestManager
        QuestManager.setup(getDataFolder());

        // Register commands
        this.getCommand("quest").setExecutor(new QuestCommand());
        this.getCommand("completequest").setExecutor(new CompleteQuestCommand());

        // Register event listeners
        getServer().getPluginManager().registerEvents(new QuestEventListener(), this);

        getLogger().info("✅ Minecraft Quest Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("🛑 Minecraft Quest Plugin Disabled!");
    }
}
