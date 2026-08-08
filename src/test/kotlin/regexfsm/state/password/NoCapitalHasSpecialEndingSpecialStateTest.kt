package regexfsm.state.password

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class NoCapitalHasSpecialEndingSpecialStateTest {
    private val state = NoCapitalHasSpecialEndingSpecialState()

    @Test
    fun tracksSpecialSeenAndSpecialEndingWithoutCapital() {
        assertSame(state, state.next("!"))
        assertIs<NoCapitalHasSpecialEndingNormalState>(state.next("a"))
        assertIs<HasCapitalHasSpecialEndingNormalState>(state.next("A"))
    }

    @Test
    fun isNotAcceptingBecauseItHasNoCapitalAndEndsSpecial() {
        assertFalse(state.isAccepting())
    }
}
