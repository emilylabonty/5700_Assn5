package regexfsm.state.floating

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class FloatStartStateTest {
    private val state = FloatStartState()

    @Test
    fun transitionsBasedOnFirstCharacter() {
        assertIs<FloatWholeNumberState>(state.next("1"))
        assertIs<FloatLeadingZeroState>(state.next("0"))
        assertIs<FloatAfterDecimalState>(state.next("."))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
