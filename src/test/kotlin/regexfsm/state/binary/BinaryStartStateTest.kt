package regexfsm.state.binary

import regexfsm.state.InvalidState
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame

class BinaryStartStateTest {
    private val state = BinaryStartState()

    @Test
    fun startsOnlyWithOne() {
        assertIs<BinaryEndsWithOneState>(state.next("1"))
        assertSame(InvalidState, state.next("0"))
        assertSame(InvalidState, state.next("a"))
    }

    @Test
    fun isNotAccepting() {
        assertFalse(state.isAccepting())
    }
}
