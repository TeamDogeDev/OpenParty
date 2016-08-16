package de.dogedev.openparty.internal;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by elektropapst on 12.08.2016.
 */
public class Player {

    private int id;
    private String name;
    private static int numPlayer = 0;
    private TextureRegion avatar;

    public Player(String name, TextureRegion avatar) {
        id = numPlayer++;

        this.avatar = avatar;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TextureRegion getAvatar() {
        return avatar;
    }
}
