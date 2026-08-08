package regexfsm.state.password

import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

class HasCapitalHasSpecialEndingNormalStateTest {
    private val state = HasCapitalHasSpecialEndingNormalState()

    @Test
    fun staysAcceptingUntilAnotherSpecialEndsThePassword() {
        assertSame(state, state.next("a"))
        assertSame(state, state.next("A"))
        assertIs<HasCapitalHasSpecialEndingSpecialState>(state.next("#"))
    }

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting())
    }
}
