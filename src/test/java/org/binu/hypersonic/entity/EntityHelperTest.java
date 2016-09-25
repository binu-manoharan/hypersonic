package org.binu.hypersonic.entity;

import org.binu.hypersonic.Coordinate;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for {@link EntityHelper}
 */
public class EntityHelperTest {

    private Coordinate coordinate;
    private EntityHelper entityHelper;

    @Before
    public void setUp() throws Exception {
        entityHelper = new EntityHelper();
        coordinate = new Coordinate(0, 0);
    }

    @Test
    public void should_create_bomber() throws Exception {
        final Entity entity = entityHelper.createEntity(0, 0, coordinate, 1, 3);
        assertThat("Entity is a bomber", entity instanceof Bomber, is(true));
        assertThat("EntityType is bomber", entity.getEntityType(), is(0));
    }

    @Test
    public void should_create_bomb() throws Exception {
        final Entity entity = entityHelper.createEntity(1, 0, coordinate, 1, 3);
        assertThat("Entity is a bomb", entity instanceof Bomb, is(true));
        assertThat("EntityType is bomb", entity.getEntityType(), is(1));
    }
}
