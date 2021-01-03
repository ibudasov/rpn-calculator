package application

import domain.Calculator
import domain.SorryCannotFindSufficientNumberOfParametersInTheStack

class Application {
    fun run(input: Input, output: Output) {

        try {
            output.outputStack(
                Calculator().calculateThings(input.getParsedInput())
            )
        } catch (e: SorryCannotFindSufficientNumberOfParametersInTheStack) {

            // todo: make the message specific here
            output.printLine("operator <operator> (position: <pos>): insufficient parameters")
        }
    }
}