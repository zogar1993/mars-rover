package mars_rover.london

class MarsRoversInMemory : MarsRovers {
    private val rovers = mutableListOf<MarsRover>()

    override fun searchOneById(id: Long): MarsRover {
        return rovers[0]
    }

    override fun put(rover: MarsRover) {
        rovers.add(rover)
    }
}