import kotlin.math.sqrt

fun main() {
    try {
        print("Введите k: ")
        val k = readln().toDouble()
        print("Введите a: ")
        val a = readln().toDouble()
        print("Введите b: ")
        val b = readln().toDouble()
        val d = a * a - 4 * b
        val result: String
        when {
            d < 0 -> result = "Нет вещественных корней"
            d == 0.0 -> {
                val x = -a / 2
                when {
                    x > -k && x < k -> result = "Единственный корень x = $x попадает в интервал (-$k, $k)"
                    else -> result = "Единственный корень x = $x не попадает в интервал (-$k, $k)"
                }
            }
            else -> {
                val sqrtD = sqrt(d)
                val x1 = (-a - sqrtD) / 2
                val x2 = (-a + sqrtD) / 2
                when {
                    x1 > -k && x1 < k && x2 > -k && x2 < k -> result = "Оба корня x1 = $x1 и x2 = $x2 попадают в интервал (-$k, $k)"
                    x1 > -k && x1 < k -> result = "Только корень x1 = $x1 попадает в интервал (-$k, $k)"
                    x2 > -k && x2 < k -> result = "Только корень x2 = $x2 попадает в интервал (-$k, $k)"
                    else -> result = "Ни один корень (x1 = $x1, x2 = $x2) не попадает в интервал (-$k, $k)"
                }
            }
        }
        println(result)
    } catch (e: NumberFormatException) {
        println("Неправильный формат ввода")
    }
}