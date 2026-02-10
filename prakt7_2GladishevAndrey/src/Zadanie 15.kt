fun main() {
    try {
        val num1: Int
        print("Введите трехзначное число K: ")
        num1 = readln()!!.toInt()
        val a = num1 / 100
        val b = (num1 / 10) % 10
        val c = num1 % 10
        when
        {
            ((a < b) && (b < c) || (a > b) && (b > c)) -> println("Цифры организуют упорядоченную последовательность")
            ((a < b) && (b > c)) || ((a > b) && (b < c)) -> println("Цифры не организуют упорядоченную последовательность")
            else -> println("Некоторые цифры одинаковые")
        }
    } catch (e: NumberFormatException) {
        println("Неправильный формат ввода")
    }
}