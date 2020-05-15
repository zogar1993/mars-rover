package mars_rover.facundo

class SendCommands(private val rovers: MarsRovers) {
    operator fun invoke(id: Long, commands: Array<out String>) {
        val rover = rovers.searchOneById(id)

        for (command in commands)
            rover.handle(Command.from(command))

        rovers.put(rover)
    }
}