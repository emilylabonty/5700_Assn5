package regexfsm.state.password

import regexfsm.state.State
import regexfsm.util.CharacterClassifier

class PasswordTrackingState(
    private val hasCapital: Boolean = false,
    private val hasSpecial: Boolean = false,
    private val lastCharacterWasSpecial: Boolean = false
) : State {
    override fun next(character: String): State {
        val characterIsCapital = CharacterClassifier.isCapitalLetter(character)
        val characterIsSpecial = CharacterClassifier.isPasswordSpecial(character)

        return PasswordTrackingState(
            hasCapital = hasCapital || characterIsCapital,
            hasSpecial = hasSpecial || characterIsSpecial,
            lastCharacterWasSpecial = characterIsSpecial
        )
    }

    override fun isAccepting(): Boolean {
        return hasCapital && hasSpecial && !lastCharacterWasSpecial
    }
}