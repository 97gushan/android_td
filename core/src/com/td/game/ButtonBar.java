package com.td.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Admin on 2016-11-14.
 */
public class ButtonBar {

    int startPositionX = 0;
    int startPositionY = 0;

    int width = 0;
    int height = 0;

    public ButtonBar(int startX, int startY, int width, int height){
        this.startPositionX = startX;
        this.startPositionY = startY;

        this.width = width;
        this.height = height;
    }


    public void render(SpriteBatch batch, ShapeRenderer sr){
        sr.begin(ShapeRenderer.ShapeType.Filled);

        // drawing space for statusbar
        sr.setColor(Color.RED);
        sr.rect(this.startPositionX,this.startPositionY, this.width, this.height);

        sr.end();
    }

}
