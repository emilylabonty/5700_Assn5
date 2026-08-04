package regexfsm.state

interface State {
    fun next(character: String): State
    fun isAccepting(): Boolean
}