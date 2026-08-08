package regexfsm.state.integer

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class IntegerStartStateTest {
    private val state = IntegerStartState()

    @Test
    fun movesToDigitStateForNonZeroDigit() {
        assertIs<IntegerDigitState>(state.next("1"))
        assertIs<IntegerDigitState>(state.next("9"))
    }

    @Test
    fun rejectsZeroAndNonDigits() {
        assertSame(InvalidState, state.next("0"))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
