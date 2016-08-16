package de.dogedev.openparty.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.Disableable;
import com.badlogic.gdx.utils.Disposable;
import de.dogedev.openparty.internal.OpenParty;

/**
 * Created by elektropapst on 12.08.2016.
 */
public interface Game extends Disposable {

    void init(OpenParty openParty, Difficulty difficulty);

    void show();

    void render(float deltaTime);

}
