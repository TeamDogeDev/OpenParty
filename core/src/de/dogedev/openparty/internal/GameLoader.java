package de.dogedev.openparty.internal;

import com.badlogic.gdx.utils.Array;
import de.dogedev.openparty.game.Game;
import de.dogedev.openparty.game.GameProvider;
import de.dogedev.openparty.games.examplegame.ExampleGame;
import de.dogedev.openparty.games.examplegame.ExampleGameProvider;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by elektropapst on 16.08.2016.
 */
public class GameLoader {

    private static Array<GameProvider> games = new Array<>();

    public static void loadGames() {
        games.add(new ExampleGameProvider());
    }

    public static Game getRandomGame() {
        return games.random().getInstance();
    }

    public static Array<GameProvider> getAvailableGames() {
        return new Array<>(games);
    }

    public static Game getGame(String gameName) {
        for(GameProvider gp : games) {
            if(gp.getDescription().name.equals(gameName)) {
                return gp.getInstance();
            }
        }
        return new ExampleGame();
    }

}
