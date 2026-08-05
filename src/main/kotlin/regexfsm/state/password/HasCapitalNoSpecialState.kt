package regexfsm.state.password

import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class HasCapitalNoSpecialState : State {
    override fun next(character: String): State {
        return when {
            CharacterClassifier.isPasswordSpecial(character) -> HasCapitalHasSpecialEndingSpecialState()
            else -> this
        }
    }

    override fun isAccepting(): Boolean = false
}