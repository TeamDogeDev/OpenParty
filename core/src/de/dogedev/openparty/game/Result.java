package de.dogedev.openparty.game;

import com.badlogic.gdx.maps.Map;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ArrayMap;
import com.badlogic.gdx.utils.IntMap;
import de.dogedev.openparty.internal.Player;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class Result {

    private IntMap<Integer> playerPoints = new IntMap<>();

    public void setPoints(Player player, int points) {
        setPoints(player.getId(), points);
    }

    public void setPoints(int playerId, int points) {
        playerPoints.put(playerId, MathUtils.clamp(points, -10, 10));
    }

    public int getPointsForPlayer(int playerId) {
        return playerPoints.get(playerId, 0);
    }


    // intentionally empty

}
