package de.dogedev.openparty.screens;

import com.badlogic.gdx.Screen;
import de.dogedev.openparty.Core;
import de.dogedev.openparty.game.Game;

/**
 * Created by elektropapst on 16.08.2016.
 */
public class GameScreen implements Screen {

    private Game currentGame;

    public GameScreen(Game currentGame) {
        this.currentGame = currentGame;
        currentGame.init(Core.instance.getOpenParty(), Core.instance.getDifficulty());
    }

    @Override
    public void show() {
        currentGame.show();
    }

    @Override
    public void render(float delta) {
        currentGame.render(delta);
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
        currentGame.dispose();
    }
}
