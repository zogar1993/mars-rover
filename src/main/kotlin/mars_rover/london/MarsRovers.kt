package mars_rover.london

interface MarsRovers {
    fun searchOneById(id: Long): MarsRover
    fun put(rover: MarsRover)
}