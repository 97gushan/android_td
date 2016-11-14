package com.td.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Admin on 2016-11-14.
 */
public class StatusBar {

    int startPositionX = 0;
    int startPositionY = 0;

    int width = 0;
    int height = 0;

    SatusBarIcon[] icons;

    public StatusBar(int startX, int startY, int width, int height){
        this.startPositionX = startX;
        this.startPositionY = startY;

        this.width = width;
        this.height = height;


        // create a list of icon objects
        this.icons = new SatusBarIcon[6];

        for(int i = 0; i < 6; i++){
            this.icons[i] = new SatusBarIcon("tmp.png", this.width /7 * (i+1), this.startPositionY, (int)(this.height * 0.8f));
        }
    }


    public void render(SpriteBatch batch, ShapeRenderer sr){
        sr.begin(ShapeRenderer.ShapeType.Filled);

        // drawing space for statusbar
        sr.setColor(Color.BLUE);

        sr.rect(this.startPositionX, this.startPositionY, this.width, this.height);

        sr.end();


        for(int i = 0; i < 6; i++){
            this.icons[i].render(batch);
        }
    }
}
