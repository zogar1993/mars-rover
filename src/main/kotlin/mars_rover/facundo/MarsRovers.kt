package mars_rover.facundo

interface MarsRovers {
    fun searchOneById(id: Long): MarsRover
    fun put(rover: MarsRover)
}