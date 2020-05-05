package subtask1


class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {

        if(numbers.isNullOrEmpty()) {
            return null
        }

        val result = StringBuilder()
        for(i in numbers.indices) {
            val number = numbers[i]
            if(number != 0) result.apply {
                if(number < 0){
                    append(" - ")
                } else if(i != 0) {
                    append(" + ")
                }
                if(Math.abs(number) != 1) {
                    append(Math.abs(number))
                }
                if(i != numbers.indices.last) {
                    append("x")
                }
                if(i < numbers.size - 2) {
                    append("^")
                    append(numbers.size - 1 - i)
                }
            }
        }
        return result.toString()
    }
}
