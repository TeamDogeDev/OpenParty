package de.dogedev.openparty.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import de.dogedev.openparty.internal.OpenParty;

/**
 * Created by elektropapst on 12.08.2016.
 */
public interface Game {

    Description getDescription();

    TextureRegion getIcon();

    void init(OpenParty openParty, Difficulty difficulty);

    void start();

    void render(float deltaTime);

    void stop();

}
