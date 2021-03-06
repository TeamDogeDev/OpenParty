package de.dogedev.openparty.screens;

import com.badlogic.gdx.Screen;
import de.dogedev.openparty.Core;
import de.dogedev.openparty.internal.GameLoader;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class LoadingScreen implements Screen {


    @Override
    public void show() {

        // Load assets
        // Load games
        GameLoader.loadGames();
        Core.instance.showGameOverview();
    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
