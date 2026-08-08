package regexfsm.state.binary

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

class BinaryEndsWithOneStateTest {
    private val state = BinaryEndsWithOneState()

    @Test
    fun tracksWhetherLatestCharacterIsOne() {
        assertSame(state, state.next("1"))
        assertIs<BinaryEndsWithZeroState>(state.next("0"))
    }

    @Test
    fun rejectsNonBinaryCharacters() {
        assertSame(InvalidState, state.next("2"))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting())
    }
}
