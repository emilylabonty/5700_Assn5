package regexfsm.state.email

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class EmailPartOneStateTest {
    private val state = EmailPartOneState()

    @Test
    fun requiresContentBeforeAtSymbol() {
        assertIs<EmailPartOneContentState>(state.next("a"))
        assertSame(InvalidState, state.next("@"))
        assertSame(InvalidState, state.next(" "))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
