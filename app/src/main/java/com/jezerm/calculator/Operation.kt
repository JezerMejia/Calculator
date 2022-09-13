package com.jezerm.calculator

class Operation(var num1: Double, var num2: Double) {
    fun sumar() = num1 + num2
    fun restar() = num1 - num2
    fun multiplicar() = num1 * num2
    fun dividir() = num1 / num2
}