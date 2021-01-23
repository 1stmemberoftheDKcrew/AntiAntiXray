package me.constantindev.antiantixray.Commands;

import me.constantindev.antiantixray.Etc.Config;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class Help extends Base {
    public Help() {
        super("Help", new String[]{"help", "?", "h", ""}, "Lists all commands");
    }

    @Override
    public void run(String[] args) {
        assert MinecraftClient.getInstance().player != null;
        MinecraftClient.getInstance().player.sendMessage(Text.of("[AAX] All commands you can use:"), false);
        Config.manager.get().forEach(base -> MinecraftClient.getInstance().player.sendMessage(Text.of("[AAX]  - " + base.name + " (" + String.join(", ", base.aliases) + "): " + base.description), false));
        super.run(args);
    }
}
