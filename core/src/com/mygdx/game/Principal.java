package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Screens.PantallaPrincipal;

public class Principal extends Game {
	
	public static final int WIDHT = 850;
	public static final int HEIGHT = 480;
	
	public SpriteBatch batch;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new PantallaPrincipal(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	
}
