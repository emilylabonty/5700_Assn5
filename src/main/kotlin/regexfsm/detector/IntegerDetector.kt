package regexfsm.detector

import regexfsm.state.State
import regexfsm.state.integer.IntegerStartState

class IntegerDetector : AbstractStateMachineDetector() {
    override fun initialState(): State {
        return IntegerStartState()
    }
}