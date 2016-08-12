package de.dogedev.openparty.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.Array;
import de.dogedev.openparty.game.Game;
import de.dogedev.openparty.internal.loader.GameLoader;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class LoadingScreen implements Screen {

    @Override
    public void show() {
        System.out.println("Start");
        Array<Class<? extends Game>> classes = GameLoader.loadGames("");
        System.out.println("NUM GAMES: " + classes.size);

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
