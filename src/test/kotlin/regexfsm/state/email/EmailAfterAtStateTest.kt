package regexfsm.state.email

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class EmailAfterAtStateTest {
    private val state = EmailAfterAtState()

    @Test
    fun requiresPartTwoContent() {
        assertIs<EmailPartTwoState>(state.next("b"))
        assertSame(InvalidState, state.next("@"))
        assertSame(InvalidState, state.next("."))
        assertSame(InvalidState, state.next(" "))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
