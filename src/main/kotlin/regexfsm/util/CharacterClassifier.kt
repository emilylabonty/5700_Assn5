package regexfsm.util

object CharacterClassifier {
    fun isDigit(character: String): Boolean {
        return character.length == 1 && character[0] in '0'..'9'
    }

    fun isNonZeroDigit(character: String): Boolean {
        return character.length == 1 && character[0] in '1'..'9'
    }

    fun isCapitalLetter(character: String): Boolean {
        return character.length == 1 && character[0] in 'A'..'Z'
    }

    fun isPasswordSpecial(character: String): Boolean {
        return character in setOf("!", "@", "#", "$", "%", "&", "*")
    }
}