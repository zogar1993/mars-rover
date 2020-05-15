package mars_rover.facundo

class Coordinate(val x: Int, val y: Int) {
    fun move(xOffset: Int, yOffset: Int) = Coordinate(x + xOffset, y + yOffset)
}