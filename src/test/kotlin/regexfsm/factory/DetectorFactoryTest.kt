package regexfsm.factory

import regexfsm.detector.BinaryDetector
import regexfsm.detector.EmailDetector
import regexfsm.detector.FloatDetector
import regexfsm.detector.IntegerDetector
import regexfsm.detector.PasswordDetector
import kotlin.test.Test
import kotlin.test.assertIs

class DetectorFactoryTest {
    @Test
    fun createsDetectorForEachDetectorType() {
        assertIs<IntegerDetector>(DetectorFactory.create(DetectorType.INTEGER))
        assertIs<FloatDetector>(DetectorFactory.create(DetectorType.FLOAT))
        assertIs<BinaryDetector>(DetectorFactory.create(DetectorType.BINARY))
        assertIs<EmailDetector>(DetectorFactory.create(DetectorType.EMAIL))
        assertIs<PasswordDetector>(DetectorFactory.create(DetectorType.PASSWORD))
    }
}
