package regexfsm.detector

import regexfsm.config.PasswordRules
import regexfsm.state.State
import regexfsm.state.password.NoCapitalNoSpecialState

class PasswordDetector : AbstractStateMachineDetector() {
    override fun preValidate(input: String): Boolean {
        return input.length >= PasswordRules.MIN_LENGTH
    }

    override fun initialState(): State {
        return NoCapitalNoSpecialState()
    }
}