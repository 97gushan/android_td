package com.td.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


/**
 * Created by Admin on 2016-11-14.
 */
public class Game {

    // total screen size
    int screenWidth = Gdx.graphics.getWidth();
    int screenHeight = Gdx.graphics.getHeight();


    // The screen size for the game without the two bars
    int gameWidth = (int)((float)screenWidth * 0.85f);
    int gameHeight = (int)((float)screenHeight * 0.9f);

    StatusBar statusBar;
    ButtonBar buttonBar;

    public Game(){
        this.statusBar = new StatusBar(0, gameHeight, gameWidth, screenHeight-gameHeight);
        this.buttonBar = new ButtonBar(gameWidth, 0, screenWidth-gameWidth, screenHeight);
    }

    public void update(float deltaTime){

    }

    public void render(SpriteBatch batch, ShapeRenderer sr){


        // drawing space for statusbar
        this.statusBar.render(batch, sr);


        // drawing space for right bar thingy
        this.buttonBar.render(batch,sr);

    }

    public void touch(){

    }

}
