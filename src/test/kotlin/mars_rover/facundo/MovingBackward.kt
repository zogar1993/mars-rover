package mars_rover.facundo

import org.junit.Before
import org.junit.Test

class MovingBackward {
    @Before
    fun setUp() {
        rovers.clear()
    }

    @Test
    fun `moves backward north`() {
        `a new rover is created facing`(NORTH)

        `the rover is instructed to`(MOVE_BACKWARD)

        `the rover should have moved 'y'`(-1)
    }

    @Test
    fun `moves backward south`() {
        `a new rover is created facing`(SOUTH)

        `the rover is instructed to`(MOVE_BACKWARD)

        `the rover should have moved 'y'`(1)
    }

    @Test
    fun `moves backward east`() {
        `a new rover is created facing`(EAST)

        `the rover is instructed to`(MOVE_BACKWARD)

        `the rover should have moved 'x'`(-1)
    }

    @Test
    fun `moves backward west`() {
        `a new rover is created facing`(WEST)

        `the rover is instructed to`(MOVE_BACKWARD)

        `the rover should have moved 'x'`(1)
    }
}