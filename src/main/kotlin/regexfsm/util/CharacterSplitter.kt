package regexfsm.util

object CharacterSplitter {
    fun split(input: String): List<String> {
        return input.map { it.toString() }
    }
}