package regexfsm.detector

import regexfsm.state.State
import regexfsm.state.password.PasswordTrackingState

class PasswordDetector : AbstractStateMachineDetector() {
    override fun preValidate(input: String): Boolean {
        return input.length >= 8
    }

    override fun initialState(): State {
        return PasswordTrackingState()
    }
}