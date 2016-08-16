package de.dogedev.openparty.games.examplegame;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import de.dogedev.openparty.game.Description;
import de.dogedev.openparty.game.Game;
import de.dogedev.openparty.game.GameProvider;

/**
 * Created by elektropapst on 16.08.2016.
 */
public class ExampleGameProvider implements GameProvider {
    @Override
    public Description getDescription() {
        Description description = new Description();
        description.version = "0.0.1";
        description.tutorialPage = "Many Tutorial";
        description.name = "MyExampleGame";
        return description;
    }

    @Override
    public TextureRegion getIcon() {
        return null;
    }

    @Override
    public Game getInstance() {
        return new ExampleGame();
    }
}
