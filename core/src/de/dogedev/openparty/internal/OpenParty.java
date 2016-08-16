package de.dogedev.openparty.internal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Array;
import de.dogedev.openparty.Core;
import de.dogedev.openparty.game.Result;
import de.dogedev.openparty.screens.GameOverviewScreen;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class OpenParty {

    private InputListener inputListener;
    private Array<Player> players;

    public OpenParty() {
        players = new Array<>();
        players.add(new Player("Player1", null));
        players.add(new Player("Player2", null));
        players.add(new Player("Player3", null));
        players.add(new Player("Player4", null));
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keycode) {
                if(inputListener == null) return false;
                if(keycode == Input.Keys.SPACE) {
                    inputListener.onInput(players.get(0), Inputs.BUZZER);
                    return true;
                }
                if(keycode == Input.Keys.NUMPAD_0) {
                    inputListener.onInput(players.get(1), Inputs.BUZZER);
                    return true;
                }
                return false;
            }
        });
    }

    public void setInputListener(InputListener inputListener) {
        this.inputListener = inputListener;
    }

    Array<Player> getPlayer() {
        return players;
    }

    public void finish(Result result) {
        // result auswerten
        for (int i = 0; i < 4; i++) {
            System.out.println("P"+i+": " + result.getPointsForPlayer(i));
        }
        Core.instance.showGameOverview();
    }
}
