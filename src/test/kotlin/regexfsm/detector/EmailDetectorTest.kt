package regexfsm.detector

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EmailDetectorTest {
    private val detector = EmailDetector()

    @Test
    fun acceptsValidEmailAddresses() {
        listOf("a@b.c", "joseph.ditton@usu.edu", """{}*$.&$*(@*$%&.*&*""").forEach {
            assertTrue(detector.matches(it), "$it should be valid")
        }
    }

    @Test
    fun rejectsInvalidEmailAddresses() {
        listOf(
            "",
            "@b.c",
            "a@b@c.com",
            "a.b@b.b.c",
            "joseph ditton@usu.edu",
            "a@.c",
            "a@b.",
            "a@b",
            "a b@c.d"
        ).forEach {
            assertFalse(detector.matches(it), "$it should be invalid")
        }
    }
}
