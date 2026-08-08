package regexfsm.state.password

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class NoCapitalHasSpecialEndingNormalStateTest {
    private val state = NoCapitalHasSpecialEndingNormalState()

    @Test
    fun waitsForCapitalAfterSpecialWasSeen() {
        assertSame(state, state.next("a"))
        assertIs<NoCapitalHasSpecialEndingSpecialState>(state.next("*"))
        assertIs<HasCapitalHasSpecialEndingNormalState>(state.next("A"))
    }

    @Test
    fun isNotAcceptingWithoutCapital() {
        assertFalse(state.isAccepting())
    }
}
