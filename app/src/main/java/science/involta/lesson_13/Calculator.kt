package science.involta.lesson_13

class Calculator private  constructor() {
    companion object {
        val  instance = Calculator
    }
}