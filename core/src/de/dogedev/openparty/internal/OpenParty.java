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

    public OpenParty() {
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keycode) {
                if(inputListener == null) return false;
                if(keycode == Input.Keys.SPACE) {
                    inputListener.onInput(null, Inputs.BUZZER);
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
        return Array.of(Player.class);
    }

    public void finish(Result result) {
        // result auswerten

        Core.instance.setScreen(new GameOverviewScreen());
    }
}
