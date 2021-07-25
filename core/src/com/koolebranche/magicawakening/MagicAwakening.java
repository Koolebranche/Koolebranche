package com.koolebranche.magicawakening;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.koolebranche.magicawakening.states.StateManager;

public class MagicAwakening extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private StateManager gsm;
	int x;
	int y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		x = 0;
		y = 0;
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
		x++;
		y++;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
