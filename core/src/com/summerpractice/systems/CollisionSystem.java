package com.summerpractice.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.SortedIteratingSystem;
import com.summerpractice.components.CollisionComponent;
import com.summerpractice.utils.PriorityComparator;
import com.summerpractice.utils.SystemPriorities;

public class CollisionSystem extends SortedIteratingSystem {

    public CollisionSystem(){
        super(Family.all(CollisionComponent.class).get(), new PriorityComparator(), SystemPriorities.DRAWING);
    }
    @Override
    protected void processEntity(Entity entity, float deltaTime) {

    }
}
