package de.dogedev.openparty.internal;

import com.badlogic.gdx.utils.Array;
import de.dogedev.openparty.game.Result;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class OpenParty {

    private InputListener inputListener;

    public OpenParty() {

    }

    public void setInputListener(InputListener inputListener) {
        this.inputListener = inputListener;
    }

    Array<Player> getPlayer() {
        return Array.of(Player.class);
    }

    public void finish(Result result) {

    }
}
