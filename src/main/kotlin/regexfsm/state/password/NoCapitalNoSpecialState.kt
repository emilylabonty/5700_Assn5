package regexfsm.state.password

import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class NoCapitalNoSpecialState : State {
    override fun next(character: String): State {
        return when {
            CharacterClassifier.isCapitalLetter(character) -> HasCapitalNoSpecialState()
            CharacterClassifier.isPasswordSpecial(character) -> NoCapitalHasSpecialEndingSpecialState()
            else -> this
        }
    }

    override fun isAccepting(): Boolean = false
}