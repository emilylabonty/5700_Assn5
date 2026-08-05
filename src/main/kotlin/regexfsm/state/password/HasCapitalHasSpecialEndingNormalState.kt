package regexfsm.state.password

import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class HasCapitalHasSpecialEndingNormalState : State {
    override fun next(character: String): State {
        return if (CharacterClassifier.isPasswordSpecial(character)) {
            HasCapitalHasSpecialEndingSpecialState()
        } else {
            this
        }
    }

    override fun isAccepting(): Boolean = true
}