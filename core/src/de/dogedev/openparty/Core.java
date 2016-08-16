package de.dogedev.openparty;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import de.dogedev.openparty.game.Difficulty;
import de.dogedev.openparty.game.GameProvider;
import de.dogedev.openparty.internal.OpenParty;
import de.dogedev.openparty.screens.GameOverviewScreen;
import de.dogedev.openparty.screens.GameScreen;
import de.dogedev.openparty.screens.LoadingScreen;

public class Core extends Game {

	public static Core instance;
    private OpenParty openParty;
    private Difficulty difficulty;

    private Screen gameScreen;
    private Screen gameOverviewScreen;
    private Screen loadingScreen;

    public Core() {
		instance = this;
	}

	@Override
	public void create() {
        openParty = new OpenParty();
        difficulty = Difficulty.EASYPEASY;
        loadingScreen = new LoadingScreen();
        gameOverviewScreen = new GameOverviewScreen();
        showLoadingScreen();
    }

	@Override
	public void render() {
		super.render(); // important !
	}

    public OpenParty getOpenParty() {
        return openParty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void startGame(GameProvider gameProvider) {
        if(gameScreen != null) gameScreen.dispose();
        gameScreen = new GameScreen(gameProvider.getInstance());
        setScreen(gameScreen);
    }

    public void showGameOverview() {
        if(gameScreen != null) gameScreen.dispose();
        setScreen(gameOverviewScreen);
    }

    public void showLoadingScreen() {
        if(gameScreen != null) gameScreen.dispose();
        setScreen(loadingScreen);
    }
}
