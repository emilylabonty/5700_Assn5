package regexfsm.util

import regexfsm.config.PasswordRules

object CharacterClassifier {
    fun isDigit(character: String): Boolean {
        return character.length == 1 && character[0] in '0'..'9'
    }

    fun isNonZeroDigit(character: String): Boolean {
        return character.length == 1 && character[0] in '1'..'9'
    }

    fun isBinaryDigit(character: String): Boolean {
        return character == "0" || character == "1"
    }

    fun isCapitalLetter(character: String): Boolean {
        return character.length == 1 && character[0] in 'A'..'Z'
    }

    fun isPasswordSpecial(character: String): Boolean {
        return character in PasswordRules.SPECIAL_CHARACTERS
    }

    fun isSpace(character: String): Boolean {
        return character == " "
    }
}

