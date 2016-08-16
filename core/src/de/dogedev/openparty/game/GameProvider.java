package de.dogedev.openparty.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by elektropapst on 16.08.2016.
 */
public interface GameProvider {

    Description getDescription();

    TextureRegion getIcon();

    Game getInstance();

}
