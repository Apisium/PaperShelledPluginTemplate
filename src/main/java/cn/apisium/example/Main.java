package cn.apisium.example;

import cn.apisium.example.mixin.MinecraftServerMixin;
import cn.apisium.papershelled.annotation.Mixin;
import cn.apisium.papershelled.plugin.PaperShelledPlugin;
import cn.apisium.papershelled.plugin.PaperShelledPluginDescription;
import cn.apisium.papershelled.plugin.PaperShelledPluginLoader;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.jetbrains.annotations.NotNull;

import java.io.File;

@SuppressWarnings("unused")
@Plugin(name = "ExamplePlugin", version = "@@RELEASE_VERSION@@")
@Description("A simple PaperShelled plugin.")
@Author("Shirasawa")
@Website("https://apisium.cn")
@ApiVersion(ApiVersion.Target.v1_13)
@Mixin(MinecraftServerMixin.class)
public class Main extends PaperShelledPlugin {
    public Main(@NotNull PaperShelledPluginLoader loader, @NotNull PaperShelledPluginDescription paperShelledDescription,
                @NotNull PluginDescriptionFile description, @NotNull File file) {
        super(loader, paperShelledDescription, description, file);
    }

    @Override
    public void onEnable() {
        getLogger().info(Data.modName);
    }
}
