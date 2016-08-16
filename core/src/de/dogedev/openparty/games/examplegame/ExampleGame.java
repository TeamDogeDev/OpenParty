package de.dogedev.openparty.games.examplegame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import de.dogedev.openparty.game.Difficulty;
import de.dogedev.openparty.game.Game;
import de.dogedev.openparty.game.Result;
import de.dogedev.openparty.internal.Inputs;
import de.dogedev.openparty.internal.OpenParty;

/**
 * Created by elektropapst on 16.08.2016.
 */
public class ExampleGame implements Game {

    float r = 0.0f;
    private OpenParty openParty;
    private Difficulty difficulty;

    @Override
    public void init(OpenParty openParty, Difficulty difficulty) {
        this.openParty = openParty;
        this.difficulty = difficulty;

        openParty.setInputListener((player, input) -> {
            if(input == Inputs.BUZZER) {
                r += 10;
            }
        });

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float deltaTime) {
        Gdx.gl.glClearColor( (r % 255) / 255, 0, 0, 1 );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        if(r >= 30) {
            Result result = new Result();
            openParty.finish(result);
        }
    }

    @Override
    public void dispose() {

    }
}
