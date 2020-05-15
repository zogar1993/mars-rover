package mars_rover.facundo

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Before
import org.junit.Test

class RotateRight {
    @Before
    fun setUp() {
        rovers.clear()
    }

    @Test
    fun `rotate right when facing north`() {
        rovers.put(newRover(id = ID, x = 0, y = 0, facing = NORTH))

        sendCommands(ID, arrayOf(ROTATE_RIGHT))

        val rover = rovers.searchOneById(ID)
        rover.direction.value.shouldBeEqualTo(EAST)
    }

    @Test
    fun `rotate right when facing east`() {
        rovers.put(newRover(id = ID, x = 0, y = 0, facing = EAST))

        sendCommands(ID, arrayOf(ROTATE_RIGHT))

        val rover = rovers.searchOneById(ID)
        rover.direction.value.shouldBeEqualTo(SOUTH)
    }

    @Test
    fun `rotate right when facing south`() {
        rovers.put(newRover(id = ID, x = 0, y = 0, facing = SOUTH))

        sendCommands(ID, arrayOf(ROTATE_RIGHT))

        val rover = rovers.searchOneById(ID)
        rover.direction.value.shouldBeEqualTo(WEST)
    }

    @Test
    fun `rotate right when facing west`() {
        rovers.put(newRover(id = ID, x = 0, y = 0, facing = WEST))

        sendCommands(ID, arrayOf(ROTATE_RIGHT))

        val rover = rovers.searchOneById(ID)
        rover.direction.value.shouldBeEqualTo(NORTH)
    }
}