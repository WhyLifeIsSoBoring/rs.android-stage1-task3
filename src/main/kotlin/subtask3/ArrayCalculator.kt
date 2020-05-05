package subtask3

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {

        val listOfInt = itemsFromArray.filterIsInstance<Int>()

        if (listOfInt.isEmpty()) {
            return 0
        }

        if (listOfInt.size<= numberOfItems) {
            var result = 1

            for (i in listOfInt) {
                result *= i
            }
            return result
        }

        val sortedListOfInt = listOfInt.sorted()
        var firstIndex = 0
        var lastIndex = sortedListOfInt.size-1
        var number = numberOfItems
        var result = 1

        while (number>=2) {
            val startPair = sortedListOfInt[firstIndex] * sortedListOfInt[firstIndex + 1]
            val endPair= sortedListOfInt[lastIndex] * sortedListOfInt[lastIndex - 1]

            if (startPair > endPair) {
                result *= startPair
                firstIndex += 2
            } else {
                result *= endPair
                lastIndex -= 2
            }
            number -= 2
        }

        if (number == 1) {
            result *= maxOf(sortedListOfInt[firstIndex], sortedListOfInt[lastIndex])
        }
        return result
    }
}
