package regexfsm.state.email

import regexfsm.state.InvalidState
import regexfsm.state.State

class EmailPartThreeState : State {
    override fun next(character: String): State {
        return when {
            character == " " -> InvalidState
            character == "@" -> InvalidState
            character == "." -> InvalidState
            else -> this
        }
    }

    override fun isAccepting(): Boolean = true
}