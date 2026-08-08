package regexfsm.config

import kotlin.test.Test
import kotlin.test.assertEquals

class PasswordRulesTest {
    @Test
    fun definesMinimumPasswordLength() {
        assertEquals(8, PasswordRules.MIN_LENGTH)
    }

    @Test
    fun definesAllowedSpecialCharacters() {
        assertEquals(setOf("!", "@", "#", "\$", "%", "&", "*"), PasswordRules.SPECIAL_CHARACTERS)
    }
}
