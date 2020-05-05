package subtask4

import java.util.*

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        var square = 0L
        val result = Stack<Int>()
        result.add(number)

        while (result.isNotEmpty()) {
            val decomposeN = result.pop()
            square += Math.pow(decomposeN.toDouble(), 2.toDouble()).toLong()

            for(n in decomposeN - 1 downTo 0) {
                val sq = Math.pow(n.toDouble(), 2.toDouble()).toLong()

                if(square - sq > 0) {
                    result.push(n)
                    square -= sq
                } else if(square - sq == 0L) {
                    result.push(n)
                    return result.reversed().toTypedArray()
                }
            }
        }
        return null
    }
}
