package regexfsm.state

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertSame

class InvalidStateTest {
    @Test
    fun remainsInvalidForAnyCharacter() {
        assertSame(InvalidState, InvalidState.next("1"))
        assertSame(InvalidState, InvalidState.next("a"))
        assertSame(InvalidState, InvalidState.next("."))
    }

    @Test
    fun isNeverAccepting() {
        assertFalse(InvalidState.isAccepting())
    }
}
