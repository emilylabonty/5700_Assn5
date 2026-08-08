package regexfsm.state.floating

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class FloatWholeNumberStateTest {
    private val state = FloatWholeNumberState()

    @Test
    fun acceptsMoreWholeNumberDigitsBeforeDecimal() {
        assertSame(state, state.next("0"))
        assertSame(state, state.next("9"))
    }

    @Test
    fun movesAfterDecimalWhenPeriodAppears() {
        assertIs<FloatAfterDecimalState>(state.next("."))
    }

    @Test
    fun rejectsInvalidCharacters() {
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAcceptingWithoutFraction() {
        assertFalse(state.isAccepting())
    }
}
