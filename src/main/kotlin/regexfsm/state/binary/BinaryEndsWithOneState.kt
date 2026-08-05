package regexfsm.state.binary

import regexfsm.state.InvalidState
import regexfsm.state.State

class BinaryEndsWithOneState : State {
    override fun next(character: String): State {
        return when (character) {
            "1" -> this
            "0" -> BinaryEndsWithZeroState()
            else -> InvalidState
        }
    }

    override fun isAccepting(): Boolean = true
}