package mars_rover.london.outer

import mars_rover.london.MarsRover
import mars_rover.london.MarsRoversInMemory
import mars_rover.london.SendCommands
import org.junit.Assert.assertEquals
import org.junit.Test

class ForwardTest {
    @Test
    fun `goes forward`(){
        val rovers = MarsRoversInMemory()
        rovers.put(newRover(id = ID, x = 2, y = 2, facing = NORTH))
        val sendCommands = SendCommands(rovers)

        sendCommands(ID, FORWARD)

        val rover = rovers.searchOneById(ID)
        assertEquals(3, rover.y)
    }

    fun newRover(id: Long, x: Long, y: Long, facing: String): MarsRover {
        return MarsRover(id = id, x = x, y = y, facing = facing)
    }

    companion object {
        const val ID: Long = 1
        const val NORTH = "N"
        const val FORWARD = "f"
    }
}