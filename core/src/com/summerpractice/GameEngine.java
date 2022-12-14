package com.summerpractice;

import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.summerpractice.entities.Player;
import com.summerpractice.systems.AnimationSystem;
import com.summerpractice.systems.DrawingSystem;
import com.summerpractice.systems.PlayerControlSystem;
import com.summerpractice.utils.MyContactListener;

public class GameEngine extends Engine {
    private final SpriteBatch batch;
    public final World world;
    Box2DDebugRenderer debugRenderer;

    public GameEngine(){
        super();

        batch = new SpriteBatch();
        world = new World(new Vector2(0,0),true);
        initEntities();
    }

    private void initEntities(){
        addEntity(new Player());
        addSystem(new DrawingSystem(batch));
        addSystem(new AnimationSystem());
        addSystem(new PlayerControlSystem());
        world.setContactListener(new MyContactListener());
        debugRenderer = new Box2DDebugRenderer();
        //TODO init systems
    }

    @Override
    public void update(float deltaTime) {
        world.step(1/60f,6,2);
        super.update(deltaTime);
        debugRenderer.render(world,batch.getProjectionMatrix());

    }
}
