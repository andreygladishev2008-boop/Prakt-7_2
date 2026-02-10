import kotlin.math.*
fun main() {
    try {
        print("Введите координату x: ")
        val x = readln()!!.toDouble()
        print("Введите координату y: ")
        val y = readln()!!.toDouble()
        print("Введите радиус R (R>0): ")
        val r = readln()!!.toDouble()
        val distToSegment: Double
        when {
            x in -r..r -> distToSegment = abs(y)
            x < -r -> distToSegment = hypot(x + r, y)
            else -> distToSegment = hypot(x - r, y)
        }
        val d = hypot(x, y)
        val closetY: Double
        when {
            d > 0 -> closetY = r * y / d
            else -> closetY = 0.0
        }
        val distToArc:Double
        when {
            closetY <= 0 -> distToArc = abs(d - r)
            else -> distToArc = min(hypot(x + r, y), hypot(x - r, y))
        }
        val result = min(distToSegment, distToArc)
        println("Растояние от точки ($x, $y) до контура полукруга радиуса $r: $result")
    } catch (e: NumberFormatException) {
        println("Неправильный формат ввода")
    }
}