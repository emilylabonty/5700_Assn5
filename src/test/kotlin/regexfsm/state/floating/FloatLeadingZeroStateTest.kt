package regexfsm.state.floating

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class FloatLeadingZeroStateTest {
    private val state = FloatLeadingZeroState()

    @Test
    fun requiresDecimalImmediatelyAfterLeadingZero() {
        assertIs<FloatAfterDecimalState>(state.next("."))
        assertSame(InvalidState, state.next("0"))
        assertSame(InvalidState, state.next("1"))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
