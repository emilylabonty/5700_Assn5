package regexfsm.factory

import kotlin.test.Test
import kotlin.test.assertContentEquals

class DetectorTypeTest {
    @Test
    fun containsEverySupportedDetectorType() {
        assertContentEquals(
            listOf(
                DetectorType.INTEGER,
                DetectorType.FLOAT,
                DetectorType.BINARY,
                DetectorType.EMAIL,
                DetectorType.PASSWORD
            ),
            DetectorType.entries
        )
    }
}
