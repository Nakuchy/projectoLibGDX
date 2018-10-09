package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.mygdx.game.GameConstants;
import com.mygdx.game.Principal;
import com.mygdx.game.actors.Personaje;

/**
 * Created by Dewa on 2/19/2017.
 */
public class GameScreen implements Screen {

    final Principal game;
    private Stage stage;
    private Skin mySkin;
    private Personaje pers,pers2;
    Texture personaje, personaje2;

    public GameScreen(final Principal game){
        this.game = game;
        stage = new Stage(game.screenPort);
        mySkin = new Skin(Gdx.files.internal(GameConstants.skin));
        Gdx.input.setInputProcessor(stage);
        personaje = new Texture("Play.png");
        personaje2 = new Texture("descargar.jpeg");
        Button homeBtn = new TextButton("HOME",mySkin,"small");
        homeBtn.setSize(GameConstants.col_width,GameConstants.row_height);
        homeBtn.setPosition(0,GameConstants.screenHeight - homeBtn.getHeight());
        homeBtn.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                game.gotoMenuScreen();
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
            }
        });

        stage.addActor(homeBtn);

    }

    @Override
    public void show() {
    	
    	
    	stage.setDebugAll(true);
    	pers = new Personaje(personaje,1);
    	pers2 = new Personaje(personaje2,2);
    	stage.addActor(pers);
    	stage.addActor(pers2);
    	pers.setPosition(500, 10);
    	pers2.setPosition(0, 10);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        stage.act();
        stage.draw();
        
    }

    @Override
    public void resize(int width, int height) {
        game.screenPort.update(width,height);

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        mySkin.dispose();
        stage.dispose();

    }
}
