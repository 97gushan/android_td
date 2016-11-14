package com.td.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	ShapeRenderer sr;

	Game game;

	@Override
	public void create () {
		batch = new SpriteBatch();
		sr = new ShapeRenderer();

		game = new Game();

	}

	public void update(float deltaTime){
		game.update(deltaTime);
	}

	@Override
	public void render () {
		this.update(Gdx.graphics.getDeltaTime());

		// set background color to white
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



		game.render(batch, sr);

        // draw textures here

	}
	
	@Override
	public void dispose () {
		batch.dispose();
        sr.dispose();
	}
}
