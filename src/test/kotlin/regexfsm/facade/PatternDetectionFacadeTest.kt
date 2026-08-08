package regexfsm.facade

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PatternDetectionFacadeTest {
    private val facade = PatternDetectionFacade()

    @Test
    fun delegatesIntegerDetection() {
        assertTrue(facade.isInteger("123"))
        assertFalse(facade.isInteger("0123"))
    }

    @Test
    fun delegatesFloatingPointDetection() {
        assertTrue(facade.isFloatingPoint(".123"))
        assertFalse(facade.isFloatingPoint("123"))
    }

    @Test
    fun delegatesBinaryDetection() {
        assertTrue(facade.isBinary("1001"))
        assertFalse(facade.isBinary("1000"))
    }

    @Test
    fun delegatesEmailDetection() {
        assertTrue(facade.isEmail("a@b.c"))
        assertFalse(facade.isEmail("a@b.c.d"))
    }

    @Test
    fun delegatesPasswordDetection() {
        assertTrue(facade.isComplexPassword("aaaaH!aa"))
        assertFalse(facade.isComplexPassword("Abbbbbbb!"))
    }
}
