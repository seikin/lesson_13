package science.involta.lesson_13

class Calculator private  constructor() {
    var result = 0
    private  var firstOperand = 0
    private  var secondOperand = 0
    var error: String? = ""

    fun add(first: Int, second: Int): Calculator {
        error = ""
        firstOperand = first
        secondOperand = second
        result = firstOperand + secondOperand
        return  this
    }

    fun sub(first: Int, second: Int): Calculator {
        error = ""
        firstOperand = first
        secondOperand = second
        result = firstOperand - secondOperand
        return  this
    }

    fun multi(first: Int, second: Int): Calculator {
        error = ""
        firstOperand = first
        secondOperand = second
        result = firstOperand * secondOperand
        return  this
    }

    fun div(first: Int, second: Int): Calculator {
        error = ""
        firstOperand = first
        secondOperand = second

        if (secondOperand == 0) {
            error = "На ноль делить нельзя"
            return  this
        }
        result = firstOperand / secondOperand
        return  this
    }

    companion object {
        val  instance = Calculator()
    }
}