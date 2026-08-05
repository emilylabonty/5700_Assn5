package regexfsm.detector

import regexfsm.state.State
import regexfsm.state.email.EmailPartOneState

class EmailDetector : AbstractStateMachineDetector() {
    override fun initialState(): State {
        return EmailPartOneState()
    }
}