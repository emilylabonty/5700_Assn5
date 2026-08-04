package regexfsm.detector

import regexfsm.state.State
import regexfsm.util.CharacterSplitter

abstract class AbstractStateMachineDetector : Detector {
    final override fun matches(input: String): Boolean {
        if (!preValidate(input)) {
            return false
        }

        var currentState = initialState()

        for (character in CharacterSplitter.split(input)) {
            currentState = currentState.next(character)
        }

        return currentState.isAccepting()
    }

    protected open fun preValidate(input: String): Boolean {
        return input.isNotEmpty()
    }

    protected abstract fun initialState(): State
}