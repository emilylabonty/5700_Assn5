package regexfsm.state.binary

import regexfsm.state.InvalidState
import regexfsm.state.State

class BinaryEndsWithZeroState : State {
    override fun next(character: String): State {
        return when (character) {
            "1" -> BinaryEndsWithOneState()
            "0" -> this
            else -> InvalidState
        }
    }

    override fun isAccepting(): Boolean = false
}