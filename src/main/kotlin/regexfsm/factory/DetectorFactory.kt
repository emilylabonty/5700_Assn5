package regexfsm.factory

import regexfsm.detector.BinaryDetector
import regexfsm.detector.Detector
import regexfsm.detector.EmailDetector
import regexfsm.detector.FloatDetector
import regexfsm.detector.IntegerDetector
import regexfsm.detector.PasswordDetector

object DetectorFactory {
    fun create(type: DetectorType): Detector {
        return when (type) {
            DetectorType.INTEGER -> IntegerDetector()
            DetectorType.FLOAT -> FloatDetector()
            DetectorType.BINARY -> BinaryDetector()
            DetectorType.EMAIL -> EmailDetector()
            DetectorType.PASSWORD -> PasswordDetector()
        }
    }
}