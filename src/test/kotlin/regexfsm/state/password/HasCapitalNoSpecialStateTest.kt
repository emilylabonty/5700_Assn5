package regexfsm.state.password

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class HasCapitalNoSpecialStateTest {
    private val state = HasCapitalNoSpecialState()

    @Test
    fun waitsForSpecialAfterCapitalWasSeen() {
        assertSame(state, state.next("A"))
        assertSame(state, state.next("a"))
        assertIs<HasCapitalHasSpecialEndingSpecialState>(state.next("@"))
    }

    @Test
    fun isNotAcceptingWithoutSpecialCharacter() {
        assertFalse(state.isAccepting())
    }
}
