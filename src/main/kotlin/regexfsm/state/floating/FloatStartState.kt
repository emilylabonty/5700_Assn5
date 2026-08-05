package regexfsm.state.floating

import regexfsm.state.InvalidState
import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class FloatStartState : State {
    override fun next(character: String): State {
        return when {
            CharacterClassifier.isNonZeroDigit(character) -> FloatWholeNumberState()
            character == "0" -> FloatLeadingZeroState()
            character == "." -> FloatAfterDecimalState()
            else -> InvalidState
        }
    }

    override fun isAccepting(): Boolean = false
}