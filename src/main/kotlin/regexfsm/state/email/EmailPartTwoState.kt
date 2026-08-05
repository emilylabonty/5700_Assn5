package regexfsm.state.email

import regexfsm.state.InvalidState
import regexfsm.state.State

class EmailPartTwoState : State {
    override fun next(character: String): State {
        return when {
            character == " " -> InvalidState
            character == "@" -> InvalidState
            character == "." -> EmailAfterDotState()
            else -> this
        }
    }

    override fun isAccepting(): Boolean = false
}