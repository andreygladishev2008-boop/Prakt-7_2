fun main()
{
    try {
    print("ВВедите число a: ")
    val a = readln().toInt()
    print("ВВедите число b: ")
    val b = readln().toInt()
    when {
        (a % 2 == 0) && (b % 2 == 0) -> println("Оба числа четные")
        (a % 2 != 0) && (b % 2 != 0) -> println("Оба числа нечетные")
        (a % 2 != 0) && (b % 2 == 0) -> println("Число $a нечетное, $b четное")
        (a % 2 == 0) && (b % 2 != 0) -> println("Число $a четное, $b нечетное")
    }
    } catch (e: NumberFormatException) {
        println("Неправильный формат ввода")
    }
}