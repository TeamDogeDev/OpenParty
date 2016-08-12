package de.dogedev.openparty;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import de.dogedev.openparty.screens.LoadingScreen;

public class Core extends Game {

	@Override
	public void create() {
		setScreen(new LoadingScreen());
	}

	@Override
	public void render() {
		super.render(); // important !
	}
}
