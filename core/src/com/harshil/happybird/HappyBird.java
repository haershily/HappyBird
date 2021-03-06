package com.harshil.happybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class HappyBird extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background;

	Texture[] birds;
	int flapState=0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		batch=new SpriteBatch();
		birds=new Texture[2];
		birds[0]=new Texture("bird.png");
		birds[1]=new Texture("bird2.png");
		background=new Texture("bg.png");
	}

	@Override
	public void render () {
		if(flapState==0){flapState=1;}
		else {flapState=0;}
		batch.begin();
		batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		batch.draw(birds[flapState],Gdx.graphics.getWidth()/2-birds[flapState].getWidth()/2,Gdx.graphics.getHeight()/2-birds[flapState].getHeight()/2);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		background.dispose();
	}
}
