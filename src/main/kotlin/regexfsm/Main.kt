package regexfsm

import regexfsm.facade.PatternDetectionFacade

fun main() {
    val detector = PatternDetectionFacade()

    val examples = mapOf(
        "Integer" to listOf("123", "0123"),
        "Floating Point" to listOf("1.0", "123."),
        "Binary" to listOf("101", "10"),
        "Email" to listOf("a@b.c", "@b.c"),
        "Complex Password" to listOf("aaaaH!aa", "Abbbbbbb!")
    )

    println("Regular Expression State Machine Demo")
    println("-------------------------------------")

    examples["Integer"]?.forEach {
        println("Integer '$it': ${detector.isInteger(it)}")
    }

    examples["Floating Point"]?.forEach {
        println("Floating Point '$it': ${detector.isFloatingPoint(it)}")
    }

    examples["Binary"]?.forEach {
        println("Binary '$it': ${detector.isBinary(it)}")
    }

    examples["Email"]?.forEach {
        println("Email '$it': ${detector.isEmail(it)}")
    }

    examples["Complex Password"]?.forEach {
        println("Complex Password '$it': ${detector.isComplexPassword(it)}")
    }
}