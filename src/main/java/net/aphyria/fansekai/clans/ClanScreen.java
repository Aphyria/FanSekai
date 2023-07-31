package net.aphyria.fansekai.clans;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ClanScreen extends Screen {
    protected ClanScreen() {
        super(Component.literal("clan_select"));
    }

    @Override
    protected void init() {
        super.init();
        this.addRenderableWidget(new EditBox(new Font(resourceLocation -> {
            return null;
        }, true), 1, 2, 3, 4, Component.literal("yes")));
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
}
