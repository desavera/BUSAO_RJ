package com.zirix.android.busaorj.app.graphics;

import android.app.Activity;

import com.zirix.android.busaorj.app.SinoticoActivity;

public abstract class Screen {
    protected final SinoticoActivity game;

    public Screen(SinoticoActivity game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void paint(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

    public abstract void backButton();
}