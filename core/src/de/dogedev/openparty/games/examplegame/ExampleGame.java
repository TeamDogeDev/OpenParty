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

    int p0Points = 0;
    int p1Points = 0;
    int p2Points = 0;
    int p3Points = 0;


    private OpenParty openParty;
    private Difficulty difficulty;

    @Override
    public void init(OpenParty openParty, Difficulty difficulty) {
        this.openParty = openParty;
        this.difficulty = difficulty;

        openParty.setInputListener((player, input) -> {
            if (input == Inputs.BUZZER) {
                switch (player.getId()) {
                    case 0:
                        p0Points++;
                        break;
                    case 1:
                        p1Points++;
                        break;
                    case 2:
                        p2Points++;
                        break;
                    case 3:
                        p3Points++;
                        break;
                }
            }
        });

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float deltaTime) {
        float r = ((p0Points * 10) % 255) / 255;
        float g = ((p1Points * 10) % 255) / 255;
        float b = ((p2Points * 10) % 255) / 255;

        Gdx.gl.glClearColor(r, g, b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        if (winCheck()) {
            Result result = new Result();
            result.setPoints(0, p0Points);
            result.setPoints(1, p1Points);
            result.setPoints(2, p2Points);
            result.setPoints(3, p3Points);
            openParty.finish(result);
        }
    }

    public boolean winCheck() {
        return p1Points >= 10 || p2Points >= 10 || p3Points >= 10 || p0Points >= 10;
    }

    @Override
    public void dispose() {

    }
}
