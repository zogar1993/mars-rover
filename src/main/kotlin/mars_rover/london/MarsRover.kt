package mars_rover.london

class MarsRover(
    val id: Long = 0,
    val x: Long = 0,
    var y: Long = 0,
    val facing: String = ""
) {
    fun handle(command: String) {
       y++
    }
}