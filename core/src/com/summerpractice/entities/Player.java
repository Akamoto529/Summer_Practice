package com.summerpractice.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.summerpractice.components.TextureComponent;
import com.summerpractice.utils.ComponentFactory;

public class Player extends NsgEntity{
    public Player() {
        super();
        add(ComponentFactory.ComponentType.PLAYER);
        setRegion(new Texture("badlogic.jpg"));
    }
}
