package regexfsm.state.email

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class EmailPartOneContentStateTest {
    private val state = EmailPartOneContentState()

    @Test
    fun allowsPartOneContentUntilAtSymbol() {
        assertSame(state, state.next("."))
        assertSame(state, state.next("\$"))
        assertIs<EmailAfterAtState>(state.next("@"))
    }

    @Test
    fun rejectsSpaces() {
        assertSame(InvalidState, state.next(" "))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
