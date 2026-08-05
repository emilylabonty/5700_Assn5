package regexfsm.state.email

import regexfsm.state.InvalidState
import regexfsm.state.State

class EmailAfterAtState : State {
    override fun next(character: String): State {
        return when {
            character == " " -> InvalidState
            character == "@" -> InvalidState
            character == "." -> InvalidState
            else -> EmailPartTwoState()
        }
    }

    override fun isAccepting(): Boolean = false
}