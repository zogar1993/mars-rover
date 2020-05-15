package mars_rover.london.inner

import mars_rover.london.MarsRover
import mars_rover.london.MarsRoversInMemory
import org.junit.Assert.assertEquals
import org.junit.Test

class MarRoverShould {
    @Test
    fun `increase its 'y' by 1 when facing north and sent an 'f' command`(){
        val rover = MarsRover(y = 2, facing = "N")

        rover.handle("f")

        assertEquals(3, rover.y)
    }
}