package regexfsm.detector

import regexfsm.state.State
import regexfsm.state.floating.FloatStartState

class FloatDetector : AbstractStateMachineDetector() {
    override fun initialState(): State {
        return FloatStartState()
    }
}