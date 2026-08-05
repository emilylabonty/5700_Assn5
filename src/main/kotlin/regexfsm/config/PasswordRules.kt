package regexfsm.config

object PasswordRules {
    const val MIN_LENGTH: Int = 8

    val SPECIAL_CHARACTERS: Set<String> = setOf(
        "!",
        "@",
        "#",
        "$",
        "%",
        "&",
        "*"
    )
}