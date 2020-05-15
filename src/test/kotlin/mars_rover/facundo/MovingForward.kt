package mars_rover.facundo

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Before
import org.junit.Test

class MovingForward {
    @Before
    fun setUp() {
        rovers.clear()
    }

    @Test
    fun `moves forward north`() {
        `a new rover is created facing`(NORTH)

        `the rover is instructed to`(MOVE_FORWARD)

        `the rover should have moved 'y'`(1)
    }

    @Test
    fun `moves forward south`() {
        `a new rover is created facing`(SOUTH)

        `the rover is instructed to`(MOVE_FORWARD)

        `the rover should have moved 'y'`(-1)
    }

    @Test
    fun `moves forward east`() {
        `a new rover is created facing`(EAST)

        `the rover is instructed to`(MOVE_FORWARD)

        `the rover should have moved 'x'`(1)
    }

    @Test
    fun `moves forward west`() {
        `a new rover is created facing`(WEST)

        `the rover is instructed to`(MOVE_FORWARD)

        `the rover should have moved 'x'`(-1)
    }
}