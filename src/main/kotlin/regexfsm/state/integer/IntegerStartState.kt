package regexfsm.state.integer

import regexfsm.state.InvalidState
import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class IntegerStartState : State {
    override fun next(character: String): State {
        return if (CharacterClassifier.isNonZeroDigit(character)) {
            IntegerDigitState()
        } else {
            InvalidState
        }
    }

    override fun isAccepting(): Boolean = false
}