package regexfsm.state.password

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class HasCapitalHasSpecialEndingSpecialStateTest {
    private val state = HasCapitalHasSpecialEndingSpecialState()

    @Test
    fun remainsNonAcceptingWhileEndingWithSpecial() {
        assertSame(state, state.next("!"))
        assertIs<HasCapitalHasSpecialEndingNormalState>(state.next("a"))
        assertIs<HasCapitalHasSpecialEndingNormalState>(state.next("A"))
    }

    @Test
    fun isNotAcceptingBecauseLatestCharacterIsSpecial() {
        assertFalse(state.isAccepting())
    }
}
