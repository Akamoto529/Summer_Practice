package com.summerpractice.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.Entity;

import java.util.ArrayList;
import java.util.List;

public class CollisionComponent implements Component {
    public List<Entity> collided = new ArrayList<>();
}
