package regexfsm.state.floating

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class FloatAfterDecimalStateTest {
    private val state = FloatAfterDecimalState()

    @Test
    fun requiresAtLeastOneFractionDigit() {
        assertIs<FloatFractionState>(state.next("0"))
        assertIs<FloatFractionState>(state.next("9"))
        assertSame(InvalidState, state.next("."))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAcceptingUntilDigitArrives() {
        assertFalse(state.isAccepting())
    }
}
