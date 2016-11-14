package com.td.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Admin on 2016-11-14.
 */
public class SatusBarIcon {

    int positionX;
    int positionY;

    int width;
    int height;

    Texture texture;

    int value = 0;

    public SatusBarIcon(String url, int positionX, int positionY, int height){
        this.positionX = positionX;
        this.positionY = positionY;

        this.width = height;        //  <--- make the texture to a square
        this.height = height;

        this.texture = new Texture(url);

    }

    public void render(SpriteBatch batch){
        batch.begin();

        batch.draw(this.texture, this.positionX, this.positionY, this.width, this.height);

        batch.end();
    }

}
