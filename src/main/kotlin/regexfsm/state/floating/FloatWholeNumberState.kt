package regexfsm.state.floating

import regexfsm.state.InvalidState
import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class FloatWholeNumberState : State {
    override fun next(character: String): State {
        return when {
            CharacterClassifier.isDigit(character) -> this
            character == "." -> FloatAfterDecimalState()
            else -> InvalidState
        }
    }

    override fun isAccepting(): Boolean = false
}