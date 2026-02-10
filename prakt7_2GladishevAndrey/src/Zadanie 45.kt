fun main() {
    try {
        print("Введите количество рекламаций на товар 1: ")
        val N1 = readln().toInt()
        print("Введите количество рекламаций на товар 2: ")
        val N2 = readln().toInt()
        print("Введите количество рекламаций на товар 3: ")
        val N3 = readln().toInt()
        val max: Int
        when {
            N1 >= N2 && N1 >= N3 -> max = N1
            N2 >= N1 && N2 >= N3 -> max = N2
            else -> max = N3
        }
        val result: String
        when {
            max < 5 -> result = "Все товары хорошие"
            else -> result = "Есть плохие товары"
        }
        println(result)
    } catch (e: NumberFormatException) {
        println("Неправильный формат ввода")
    }
}