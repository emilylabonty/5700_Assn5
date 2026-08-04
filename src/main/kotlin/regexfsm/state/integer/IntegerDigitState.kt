package regexfsm.state.integer

import regexfsm.state.InvalidState
import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class IntegerDigitState : State {
    override fun next(character: String): State {
        return if (CharacterClassifier.isDigit(character)) {
            this
        } else {
            InvalidState
        }
    }

    override fun isAccepting(): Boolean = true
}