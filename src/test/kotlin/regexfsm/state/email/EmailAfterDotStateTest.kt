package regexfsm.state.email

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class EmailAfterDotStateTest {
    private val state = EmailAfterDotState()

    @Test
    fun requiresPartThreeContent() {
        assertIs<EmailPartThreeState>(state.next("c"))
        assertSame(InvalidState, state.next("@"))
        assertSame(InvalidState, state.next("."))
        assertSame(InvalidState, state.next(" "))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
