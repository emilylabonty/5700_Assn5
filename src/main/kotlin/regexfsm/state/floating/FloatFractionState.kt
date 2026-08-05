package regexfsm.state.floating

import regexfsm.state.InvalidState
import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class FloatFractionState : State {
    override fun next(character: String): State {
        return if (CharacterClassifier.isDigit(character)) {
            this
        } else {
            InvalidState
        }
    }

    override fun isAccepting(): Boolean = true
}