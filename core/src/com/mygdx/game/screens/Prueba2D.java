package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class Prueba2D implements Screen{

	World world;
	Box2DDebugRenderer renderer;
	OrthographicCamera cam;
	@Override
	public void show() {
		world = new World(new Vector2(0,-10),true);
		renderer = new Box2DDebugRenderer();
		cam = new OrthographicCamera(30,15);
		Body personajeBody;
		BodyDef personaje = createPersonajeDef();
		
		personajeBody = world.createBody(personaje);
	}

	private BodyDef createPersonajeDef() {
		BodyDef def = new BodyDef();
		def.position.set(0,10);
		def.type = BodyDef.BodyType.DynamicBody;
		return def;
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		world.destroyBody(personajeBody);
		world.dispose();
		renderer.dispose();
		
	}

}
