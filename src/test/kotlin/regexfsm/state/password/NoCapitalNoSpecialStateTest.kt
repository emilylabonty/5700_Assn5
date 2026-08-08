package regexfsm.state.password

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class NoCapitalNoSpecialStateTest {
    private val state = NoCapitalNoSpecialState()

    @Test
    fun movesWhenCapitalOrSpecialIsSeen() {
        assertIs<HasCapitalNoSpecialState>(state.next("A"))
        assertIs<NoCapitalHasSpecialEndingSpecialState>(state.next("!"))
        assertSame(state, state.next("a"))
        assertSame(state, state.next("1"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
