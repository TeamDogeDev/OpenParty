package de.dogedev.openparty.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.google.auto.service.AutoService;
import de.dogedev.openparty.internal.OpenParty;

/**
 * Created by elektropapst on 12.08.2016.
 */
@AutoService(Game.class)
public class BlaFoo implements Game {
    @Override
    public Description getDescription() {
        return null;
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
