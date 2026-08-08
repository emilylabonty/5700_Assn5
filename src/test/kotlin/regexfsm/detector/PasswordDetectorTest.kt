package regexfsm.detector

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PasswordDetectorTest {
    private val detector = PasswordDetector()

    @Test
    fun acceptsComplexPasswords() {
        listOf(
            "aaaaH!aa",
            "1234567*9J",
            "asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"
        ).forEach {
            assertTrue(detector.matches(it), "$it should be valid")
        }
    }

    @Test
    fun rejectsPasswordsThatDoNotMeetComplexityRules() {
        listOf(
            "a",
            "aaaaaaa!",
            "aaaHaaaaa",
            "Abbbbbbb!",
            "abcdefgH",
            "abcdefg*",
            "A!!!!!!*"
        ).forEach {
            assertFalse(detector.matches(it), "$it should be invalid")
        }
    }
}
