package com.td.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;

	@Override
	public void create () {


	}

	public void update(float deltaTime){

	}

	@Override
	public void render () {
		this.update(Gdx.graphics.getDeltaTime());

        // set background color to white
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        // draw textures here
		//batch.begin();


		//batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
