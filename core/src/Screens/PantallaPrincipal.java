package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.mygdx.game.Principal;

public class PantallaPrincipal implements Screen{

	Texture fondo, btnPlay, btnExit;
	float x;
	float y;
	TextButton boton;
	int screenHeight = Gdx.graphics.getHeight();
	int screenWidth = Gdx.graphics.getWidth();
	
	int btnPlayWidth = 256;
	int btnPlayHeight = 128;
	 
	Principal juego;

	
	public PantallaPrincipal(Principal juego) {
		this.juego = juego;
		img = new Texture("asd.jpg");
		btnPlay = new Texture("Play.png");
		btnExit = new Texture("salir.jpg");
	}
	
	
	public void show() {	
		
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		juego.batch.begin();
		juego.batch.draw(img,0,0);
		
		int x = juego.WIDHT / 2 - btnPlay.getWidth() / 2;
		
		if(Gdx.input.getX()> x) {
			juego.batch.draw(btnPlay,(screenWidth / 2) - btnPlay.getWidth(),(screenHeight / 2) - 64,btnPlayWidth,btnPlayHeight);
		}else {
		
		
			juego.batch.draw(btnExit,(screenWidth / 2) - 100,(screenHeight / 2) - 64,128,64);
		}
		
		
		
		juego.batch.end();
		
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
		// TODO Auto-generated method stub
		
	}

}
