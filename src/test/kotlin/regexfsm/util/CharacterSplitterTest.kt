package regexfsm.util

import kotlin.test.Test
import kotlin.test.assertContentEquals

class CharacterSplitterTest {
    @Test
    fun splitsInputIntoSingleCharacterStrings() {
        assertContentEquals(listOf("a", "@", "b", ".", "c"), CharacterSplitter.split("a@b.c"))
    }

    @Test
    fun returnsEmptyListForEmptyInput() {
        assertContentEquals(emptyList(), CharacterSplitter.split(""))
    }
}
