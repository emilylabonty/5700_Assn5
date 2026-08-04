package regexfsm.detector

interface Detector {
    fun matches(input: String): Boolean
}