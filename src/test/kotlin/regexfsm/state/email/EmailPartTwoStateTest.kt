package regexfsm.state.email

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class EmailPartTwoStateTest {
    private val state = EmailPartTwoState()

    @Test
    fun allowsPartTwoUntilDot() {
        assertSame(state, state.next("b"))
        assertIs<EmailAfterDotState>(state.next("."))
    }

    @Test
    fun rejectsSpacesAndExtraAtSymbols() {
        assertSame(InvalidState, state.next(" "))
        assertSame(InvalidState, state.next("@"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
