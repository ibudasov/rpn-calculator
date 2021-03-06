package domain.operation

class OperationFactory {
    fun createByLiteral(literal: String): Operation {

        return when (literal) {
            OperationSqrt().operationLiteral() -> OperationSqrt()
            OperationPlus().operationLiteral() -> OperationPlus()
            OperationTimes().operationLiteral() -> OperationTimes()
            OperationMinus().operationLiteral() -> OperationMinus()
            OperationDiv().operationLiteral() -> OperationDiv()
            OperationClear().operationLiteral() -> OperationClear()

            else -> throw SorryCouldNotCreateOperatorByLiteral()
        }
    }
}