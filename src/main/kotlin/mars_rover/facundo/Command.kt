package mars_rover.facundo

enum class Command(val value: String) {
    Forward("f"),
    Backward("b"),
    Right("r"),
    Left("l");

    companion object {
        fun from(value: String): Command {
            return values().find { it.value == value }
                ?: throw NotImplementedError("$value is not a valid Command")
        }
    }
}