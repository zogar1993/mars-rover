package mars_rover.london

class SendCommands(private val rovers: MarsRovers) {
    operator fun invoke(id: Long, vararg commands: String) {
        val rover = rovers.searchOneById(id)

        commands.forEach { rover.handle(it) }

        rovers.put(rover)
    }
}