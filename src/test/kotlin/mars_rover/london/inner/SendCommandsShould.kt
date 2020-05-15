package mars_rover.london.inner

import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import mars_rover.london.MarsRover
import mars_rover.london.MarsRovers
import mars_rover.london.SendCommands
import org.junit.Test

class SendCommandsShould {
    val id = 1L
    val irrelevant_commands = arrayOf<String>()
    val random_commands = arrayOf("f", "b", "l", "r")

    @Test
    fun `ask the repository for the rover of said id`(){
        val rovers = mockk<MarsRovers>(relaxed = true)
        val sendCommands = SendCommands(rovers)

        sendCommands(id, *irrelevant_commands)

        verify { rovers.searchOneById(id) }
    }

    @Test
    fun `ask for the rover to handle the commands`(){
        val rovers = mockk<MarsRovers>(relaxed = true)
        val rover = spyk(MarsRover())
        every { rovers.searchOneById(id) } returns rover
        val sendCommands = SendCommands(rovers)

        sendCommands(id, *random_commands)

        for (command in random_commands)
        verify { rover.handle(command) }
    }

    @Test
    fun `ask for the repository to persist the rover`(){
        val rovers = mockk<MarsRovers>(relaxed = true)
        val rover = MarsRover()
        every { rovers.searchOneById(id) } returns rover
        val sendCommands = SendCommands(rovers)

        sendCommands(id, *irrelevant_commands)

        verify { rovers.put(rover) }
    }
}