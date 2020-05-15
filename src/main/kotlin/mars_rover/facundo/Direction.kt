package mars_rover.facundo

enum class Direction(val value: String, val xOffset: Int, val yOffset: Int) {
    North("N", 0, 1),
    South("S", 0, -1),
    East("E", 1, 0),
    West("W", -1, 0);

    companion object {
        fun from(value: String): Direction {
            return values().find { it.value == value } ?: throw NotImplementedError("$value is not a valid Direction")
        }
    }
}