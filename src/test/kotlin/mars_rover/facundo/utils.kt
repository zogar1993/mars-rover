package mars_rover.facundo

import org.amshove.kluent.shouldBeEqualTo

fun newRover(id: Long, x: Int, y: Int, facing: String): MarsRover {
    return MarsRover(id = id, x = x, y = y, direction = Direction.from(facing))
}

const val ID: Long = 1
const val NORTH = "N"
const val SOUTH = "S"
const val EAST = "E"
const val WEST = "W"
const val MOVE_FORWARD = "f"
const val MOVE_BACKWARD = "b"
const val ROTATE_RIGHT = "r"
const val ROTATE_LEFT = "l"
const val INITIAL_Y = 2
const val INITIAL_X = 4

fun `a new rover is created facing`(direction: String) {
    rovers.put(newRover(id = ID, x = INITIAL_X, y = INITIAL_Y, facing = direction))
}

fun `the rover is instructed to`(vararg command: String) {
    sendCommands(ID, command)
}

fun `the rover should have moved 'y'`(value: Int) {
    val rover = rovers.searchOneById(ID)
    rover.y.shouldBeEqualTo(INITIAL_Y + value)
}

fun `the rover should have moved 'x'`(value: Int) {
    val rover = rovers.searchOneById(ID)
    rover.x.shouldBeEqualTo(INITIAL_X + value)
}