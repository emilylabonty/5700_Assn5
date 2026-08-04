package regexfsm.state

object InvalidState : State {
    override fun next(character: String): State = this

    override fun isAccepting(): Boolean = false
}