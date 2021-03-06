package com.falloutshelter.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.falloutshelter.game.MyGdxGame;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.addIcon("Icon.png", FileType.Internal);
        config.title = "Fallout Shelter";
        config.width = 800;
        config.height = 600;
        config.resizable = false;
        new LwjglApplication(new MyGdxGame(), config);
    }
}
