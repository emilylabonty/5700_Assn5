package regexfsm.state.email

import regexfsm.state.InvalidState
import regexfsm.state.State

class EmailPartOneContentState : State {
    override fun next(character: String): State {
        return when {
            character == " " -> InvalidState
            character == "@" -> EmailAfterAtState()
            else -> this
        }
    }

    override fun isAccepting(): Boolean = false
}