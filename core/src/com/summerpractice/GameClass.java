package com.summerpractice;

import com.badlogic.gdx.Game;
import com.summerpractice.Tools.ResourceManager;
import com.summerpractice.screens.GameScreen;


public class GameClass extends Game {
	private GameEngine engine;
	@Override
	public void create () {
		engine = new GameEngine();
		setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
	public GameEngine getEngine(){
		return engine;
	}
}
