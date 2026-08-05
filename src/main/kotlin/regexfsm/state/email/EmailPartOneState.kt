package regexfsm.state.email

import regexfsm.state.InvalidState
import regexfsm.state.State

class EmailPartOneState : State {
    override fun next(character: String): State {
        return when {
            character == " " -> InvalidState
            character == "@" -> InvalidState
            else -> EmailPartOneContentState()
        }
    }

    override fun isAccepting(): Boolean = false
}