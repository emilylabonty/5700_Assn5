package regexfsm.state.binary

import regexfsm.state.InvalidState
import regexfsm.state.State

class BinaryStartState : State {
    override fun next(character: String): State {
        return when (character) {
            "1" -> BinaryEndsWithOneState()
            else -> InvalidState
        }
    }

    override fun isAccepting(): Boolean = false
}