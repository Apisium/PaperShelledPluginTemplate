package cn.apisium.example;

import cn.apisium.papershelled.plugin.PaperShelledPlugin;
import cn.apisium.papershelled.plugin.PaperShelledPluginDescription;
import cn.apisium.papershelled.plugin.PaperShelledPluginLoader;
import org.bukkit.plugin.PluginDescriptionFile;
import org.jetbrains.annotations.NotNull;

import java.io.File;

@SuppressWarnings("unused")
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
