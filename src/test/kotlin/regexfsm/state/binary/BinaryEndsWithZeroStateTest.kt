package regexfsm.state.binary

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class BinaryEndsWithZeroStateTest {
    private val state = BinaryEndsWithZeroState()

    @Test
    fun tracksWhetherLatestCharacterIsZero() {
        assertSame(state, state.next("0"))
        assertIs<BinaryEndsWithOneState>(state.next("1"))
    }

    @Test
    fun rejectsNonBinaryCharacters() {
        assertSame(InvalidState, state.next("2"))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
