package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Personaje extends Actor {
	
	Texture personaje;
	int player;
	public Personaje(Texture personaje, int player) {
		this.personaje = personaje;
		setSize(personaje.getWidth(),personaje.getHeight());
		this.player = player;
	}
	
	
	public void act(float delta) {
		if(player == 1) {
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			moveRight();
		}else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			moveLeft();
		}else if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
			jump();
		}
		}else {
			if(Gdx.input.isKeyPressed(Input.Keys.D)) {
				moveRight();
			}else if(Gdx.input.isKeyPressed(Input.Keys.A)) {
				moveLeft();
			}else if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
				jump();
			}
		}
	}
	
	
	public void draw(Batch batch, float parentAlpha) {	
		batch.draw(personaje,getX(),getY(),128,128);
		
	}
	
	public void moveRight() {
		setX(getX()+100*Gdx.graphics.getDeltaTime());
	}
	
	public void moveLeft() {
		setX(getX()-100*Gdx.graphics.getDeltaTime());
		
	}
	
	public void jump() {
		
	}
}
