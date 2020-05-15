package mars_rover.facundo

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Before
import org.junit.Test

class ExecuteMultipleCommand {
    @Before
    fun setUp() {
        rovers.clear()
    }

    @Test
    fun `moves forward twice`() {
        rovers.put(newRover(id = ID, x = 0, y = 0, facing = NORTH))

        sendCommands(ID, arrayOf(MOVE_FORWARD, MOVE_FORWARD))

        val rover = rovers.searchOneById(ID)
        rover.y.shouldBeEqualTo(2)
    }

    @Test
    fun `moves multiple times`() {
        rovers.put(newRover(id = ID, x = 0, y = 0, facing = NORTH))

        sendCommands(ID, arrayOf(MOVE_FORWARD, MOVE_FORWARD, MOVE_BACKWARD))

        val rover = rovers.searchOneById(ID)
        rover.y.shouldBeEqualTo(1)
    }
}