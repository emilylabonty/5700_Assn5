package regexfsm.state.password

import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class NoCapitalHasSpecialEndingSpecialState : State {
    override fun next(character: String): State {
        return when {
            CharacterClassifier.isCapitalLetter(character) -> HasCapitalHasSpecialEndingNormalState()
            CharacterClassifier.isPasswordSpecial(character) -> this
            else -> NoCapitalHasSpecialEndingNormalState()
        }
    }

    override fun isAccepting(): Boolean = false
}