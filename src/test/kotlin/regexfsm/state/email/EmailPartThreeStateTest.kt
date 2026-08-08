package regexfsm.state.email

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertSame
import kotlin.test.assertTrue

class EmailPartThreeStateTest {
    private val state = EmailPartThreeState()

    @Test
    fun allowsPartThreeContentButNoMoreSeparators() {
        assertSame(state, state.next("c"))
        assertSame(state, state.next("\$"))
        assertSame(InvalidState, state.next("@"))
        assertSame(InvalidState, state.next("."))
        assertSame(InvalidState, state.next(" "))
    }

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting())
    }
}
