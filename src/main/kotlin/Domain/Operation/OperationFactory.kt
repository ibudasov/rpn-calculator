package Domain.Operation

class OperationFactory {
    fun createByLiteral(literal: String): Operation {

        return when (literal) {
            OperationSqrt().operationLiteral() -> OperationSqrt()
            OperationPlus().operationLiteral() -> OperationPlus()
            OperationTimes().operationLiteral() -> OperationTimes()
            OperationMinus().operationLiteral() -> OperationMinus()
            OperationDiv().operationLiteral() -> OperationDiv()

            else -> throw SorryCouldNotCreateOperatorByLiteral()
        }
    }
}