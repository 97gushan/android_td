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
    int screen_width = Gdx.graphics.getWidth();
    int screen_height = Gdx.graphics.getHeight();


    // The screen size for the game without the two bars
    int game_width = (int)((float)screen_width * 0.85f);
    int game_height = (int)((float)screen_height * 0.9f);

    public Game(){

    }

    public void update(float deltaTime){

    }

    public void render(SpriteBatch batch, ShapeRenderer sr){

        sr.begin(ShapeRenderer.ShapeType.Filled);

        // drawing space for statusbar
        sr.setColor(Color.BLUE);
        sr.rect(0, game_height, game_width, screen_height - game_height);

        // drawing space for right bar thingy
        sr.setColor(Color.RED);
        sr.rect(game_width, 0, screen_width-game_width, screen_height);
        sr.end();

    }

    public void touch(){

    }

}
