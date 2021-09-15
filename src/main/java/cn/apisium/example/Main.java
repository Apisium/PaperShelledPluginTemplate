package cn.apisium.example;

import cn.apisium.example.mixin.AccessorTest;
import cn.apisium.example.mixin.MinecraftServerMixin;
import cn.apisium.papershelled.annotation.Mixin;
import cn.apisium.papershelled.plugin.PaperShelledPlugin;
import cn.apisium.papershelled.plugin.PaperShelledPluginDescription;
import cn.apisium.papershelled.plugin.PaperShelledPluginLoader;
import net.minecraft.resources.ResourceKey;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

import java.io.File;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
@Plugin(name = "ExamplePlugin", version = "@@RELEASE_VERSION@@")
@Description("A simple PaperShelled plugin.")
@Author("Shirasawa")
@Website("https://apisium.cn")
@ApiVersion(ApiVersion.Target.v1_13)
@Mixin({
        AccessorTest.class,
        MinecraftServerMixin.class
})
public class Main extends PaperShelledPlugin {
    public Main(PaperShelledPluginLoader loader, PaperShelledPluginDescription paperShelledDescription,
                PluginDescriptionFile description, File file) {
        super(loader, paperShelledDescription, description, file);
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("key: " + getConfig().getString("key"));
        getLogger().info(Data.modName);
        getLogger().info("Biomes: " + AccessorTest.getPOSSIBLE_BIOMES().stream()
                .map(ResourceKey::toString).collect(Collectors.joining(" ")));
        getLogger().info("Hash: " + ((CraftServer) Bukkit.getServer()).getServer().getPackHash());
    }
}
