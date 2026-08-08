package regexfsm.util

import regexfsm.config.PasswordRules
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CharacterClassifierTest {
    @Test
    fun identifiesDigits() {
        assertTrue(CharacterClassifier.isDigit("0"))
        assertTrue(CharacterClassifier.isDigit("9"))
        assertFalse(CharacterClassifier.isDigit("a"))
        assertFalse(CharacterClassifier.isDigit("12"))
    }

    @Test
    fun identifiesNonZeroDigits() {
        assertTrue(CharacterClassifier.isNonZeroDigit("1"))
        assertTrue(CharacterClassifier.isNonZeroDigit("9"))
        assertFalse(CharacterClassifier.isNonZeroDigit("0"))
        assertFalse(CharacterClassifier.isNonZeroDigit("a"))
    }

    @Test
    fun identifiesBinaryDigits() {
        assertTrue(CharacterClassifier.isBinaryDigit("0"))
        assertTrue(CharacterClassifier.isBinaryDigit("1"))
        assertFalse(CharacterClassifier.isBinaryDigit("2"))
    }

    @Test
    fun identifiesCapitalLetters() {
        assertTrue(CharacterClassifier.isCapitalLetter("A"))
        assertTrue(CharacterClassifier.isCapitalLetter("Z"))
        assertFalse(CharacterClassifier.isCapitalLetter("a"))
        assertFalse(CharacterClassifier.isCapitalLetter("1"))
    }

    @Test
    fun identifiesPasswordSpecialCharactersFromPasswordRules() {
        PasswordRules.SPECIAL_CHARACTERS.forEach {
            assertTrue(CharacterClassifier.isPasswordSpecial(it), "$it should be special")
        }

        assertFalse(CharacterClassifier.isPasswordSpecial("^"))
        assertFalse(CharacterClassifier.isPasswordSpecial("a"))
    }

    @Test
    fun identifiesSpaces() {
        assertTrue(CharacterClassifier.isSpace(" "))
        assertFalse(CharacterClassifier.isSpace("\t"))
        assertFalse(CharacterClassifier.isSpace("a"))
    }
}
