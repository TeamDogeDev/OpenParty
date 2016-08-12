package de.dogedev.openparty.internal.loader;

import com.badlogic.gdx.utils.Array;
import de.dogedev.openparty.game.Game;

import java.io.InputStream;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Vector;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class GameLoader {

    public static Array<Class<? extends Game>> loadGames(String folder) {
        Array<Class<? extends Game>> retVal = new Array<>();

        return retVal;
    }
}
