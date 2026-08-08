package regexfsm.detector

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IntegerDetectorTest {
    private val detector = IntegerDetector()

    @Test
    fun acceptsValidIntegers() {
        listOf("1", "123", "3452342352434534524346").forEach {
            assertTrue(detector.matches(it), "$it should be valid")
        }
    }

    @Test
    fun rejectsInvalidIntegers() {
        listOf("", "0", "0123", "132a", "12.3", "-123", " 123").forEach {
            assertFalse(detector.matches(it), "$it should be invalid")
        }
    }
}
