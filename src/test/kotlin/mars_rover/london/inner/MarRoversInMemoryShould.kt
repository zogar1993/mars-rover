package mars_rover.london.inner

import mars_rover.london.MarsRover
import mars_rover.london.MarsRoversInMemory
import org.junit.Assert.assertEquals
import org.junit.Test

class MarRoversInMemoryShould {
    val id = 1L
    @Test
    fun `retrieve element with said id`(){
        val rovers = MarsRoversInMemory()
        val rover = MarsRover(id = id)

        rovers.put(rover)

        assertEquals(rover, rovers.searchOneById(id))
    }
}