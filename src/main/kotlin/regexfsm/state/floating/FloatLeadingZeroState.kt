package regexfsm.state.floating

import regexfsm.state.InvalidState
import regexfsm.state.State

class FloatLeadingZeroState : State {
    override fun next(character: String): State {
        return if (character == ".") {
            FloatAfterDecimalState()
        } else {
            InvalidState
        }
    }

    override fun isAccepting(): Boolean = false
}