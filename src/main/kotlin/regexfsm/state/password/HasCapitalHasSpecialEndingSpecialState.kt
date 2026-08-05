package regexfsm.state.password

import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class HasCapitalHasSpecialEndingSpecialState : State {
    override fun next(character: String): State {
        return if (CharacterClassifier.isPasswordSpecial(character)) {
            this
        } else {
            HasCapitalHasSpecialEndingNormalState()
        }
    }

    override fun isAccepting(): Boolean = false
}