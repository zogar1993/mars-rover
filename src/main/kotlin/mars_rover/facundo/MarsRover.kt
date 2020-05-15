package mars_rover.facundo

class MarsRover(
    val id: Long,
    x: Int,
    y: Int,
    var direction: Direction
) {
    private var coordinate: Coordinate = Coordinate(x, y)

    val x: Int get() = coordinate.x
    val y: Int get() = coordinate.y

    fun handle(command: Command) {
        when (command) {
            Command.Forward -> {
                coordinate = coordinate.move(direction.xOffset, direction.yOffset)
            }
            Command.Backward -> {
                coordinate = coordinate.move(-direction.xOffset, -direction.yOffset)
            }
            Command.Right -> {
                val list = listOf(Direction.East, Direction.South, Direction.West, Direction.North)
                val index = list.indexOf(direction)
                direction = list[if (index == 3) 0 else index + 1]
            }
            Command.Left -> {
                val list = listOf(Direction.East, Direction.South, Direction.West, Direction.North)
                val index = list.indexOf(direction)
                direction = list[if (index == 0) 3 else index - 1]
            }
        }
    }
}