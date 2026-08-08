package regexfsm.detector

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryDetectorTest {
    private val detector = BinaryDetector()

    @Test
    fun acceptsBinaryNumbersThatStartAndEndWithOne() {
        listOf("1", "11", "101", "111111", "10011010001").forEach {
            assertTrue(detector.matches(it), "$it should be valid")
        }
    }

    @Test
    fun rejectsInvalidBinaryNumbers() {
        listOf("", "01", "10", "1000010", "100a01", "2", "00100").forEach {
            assertFalse(detector.matches(it), "$it should be invalid")
        }
    }
}
