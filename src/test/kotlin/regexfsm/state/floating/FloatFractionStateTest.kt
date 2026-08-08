package regexfsm.state.floating

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertSame
import kotlin.test.assertTrue

class FloatFractionStateTest {
    private val state = FloatFractionState()

    @Test
    fun staysInFractionForAdditionalDigits() {
        assertSame(state, state.next("0"))
        assertSame(state, state.next("9"))
    }

    @Test
    fun rejectsSecondDecimalOrLetters() {
        assertSame(InvalidState, state.next("."))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting())
    }
}
