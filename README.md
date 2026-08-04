# 5700_Assn5

This project implements a set of purpose-built string detectors in Kotlin using hand-written finite state machines. Each detector accepts an input string, processes it one character at a time, and returns whether the string matches a specific language shape: integer, floating point value, binary number, email address, or complex password.

This design is centered around the State Pattern (as described in Head First Designs (Freeman, Robinson et al). Each validation rule is modeled through concrete state classes. A shared abstract detector applies the Template Method Pattern by defining the common character detection workflow, while concrete detectors provide their own starting states. The project also uses a Factory to create detectors, a Facade to expose a simple public API, and a Singleton invalid state object shared across all machines.

