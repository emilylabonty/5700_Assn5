package regexfsm.detector

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FloatDetectorTest {
    private val detector = FloatDetector()

    @Test
    fun acceptsValidFloatingPointValues() {
        listOf("1.0", "123.34", "0.20000", "12349871234.12340981234098", ".123").forEach {
            assertTrue(detector.matches(it), "$it should be valid")
        }
    }

    @Test
    fun rejectsInvalidFloatingPointValues() {
        listOf("", "123", "123.123.", "123.02a", "123.", "012.4", "0", ".", "1..2").forEach {
            assertFalse(detector.matches(it), "$it should be invalid")
        }
    }
}
