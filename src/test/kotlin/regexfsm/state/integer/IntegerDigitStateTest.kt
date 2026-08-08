package regexfsm.state.integer

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

class IntegerDigitStateTest {
    private val state = IntegerDigitState()

    @Test
    fun staysInDigitStateForDigits() {
        assertSame(state, state.next("0"))
        assertSame(state, state.next("9"))
    }

    @Test
    fun rejectsNonDigits() {
        assertSame(InvalidState, state.next("a"))
        assertSame(InvalidState, state.next("."))
    }

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting())
    }
}
