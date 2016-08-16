package de.dogedev.openparty.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import de.dogedev.openparty.Core;
import de.dogedev.openparty.game.Description;
import de.dogedev.openparty.game.Game;
import de.dogedev.openparty.game.GameProvider;
import de.dogedev.openparty.internal.GameLoader;
import de.dogedev.openparty.internal.OpenParty;

/**
 * Created by elektropapst on 16.08.2016.
 */
public class GameOverviewScreen implements Screen {

    private Batch batch = new SpriteBatch();
    private BitmapFont font = new BitmapFont();
    private Description dc;
    private float foobar = 0.0f;

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        float y = 20f;
        Gdx.gl.glClearColor( 0, 0, 0, 1 );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        for(GameProvider gp : GameLoader.getAvailableGames()) {
            dc = gp.getDescription();
            font.draw(batch, dc.name + ", " + dc.tutorialPage, 20f, y);
            y += 20f;
        }
        batch.end();
        foobar += delta;

        if(foobar >= 2.0) {
            Core.instance.startGame(GameLoader.getAvailableGames().first());
        }
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
