package regexfsm.facade

import regexfsm.factory.DetectorFactory
import regexfsm.factory.DetectorType

class PatternDetectionFacade(
    private val detectorFactory: DetectorFactory = DetectorFactory
) {
    fun isInteger(input: String): Boolean {
        return detectorFactory.create(DetectorType.INTEGER).matches(input)
    }

    fun isFloatingPoint(input: String): Boolean {
        return detectorFactory.create(DetectorType.FLOAT).matches(input)
    }

    fun isBinary(input: String): Boolean {
        return detectorFactory.create(DetectorType.BINARY).matches(input)
    }

    fun isEmail(input: String): Boolean {
        return detectorFactory.create(DetectorType.EMAIL).matches(input)
    }

    fun isComplexPassword(input: String): Boolean {
        return detectorFactory.create(DetectorType.PASSWORD).matches(input)
    }
}