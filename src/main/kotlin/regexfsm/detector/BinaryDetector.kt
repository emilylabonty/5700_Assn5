package regexfsm.detector

import regexfsm.state.State
import regexfsm.state.binary.BinaryStartState

class BinaryDetector : AbstractStateMachineDetector() {
    override fun initialState(): State {
        return BinaryStartState()
    }
}