package de.dogedev.examplegame;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import de.dogedev.openparty.game.Description;
import de.dogedev.openparty.game.Difficulty;
import de.dogedev.openparty.game.Game;
import de.dogedev.openparty.internal.OpenParty;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class ExampleGame implements Game {
    @Override
    public Description getDescription() {
        return new Description();
    }

    @Override
    public TextureRegion getIcon() {
        return null;
    }

    @Override
    public void init(OpenParty openParty, Difficulty difficulty) {
    }

    @Override
    public void start() {

    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void stop() {

    }
}
