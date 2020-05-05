package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        val numberOfPosters = array[0]
        var numberOfAvailableColors = array[1]
        var combinations = 1

        for(numberOfColorsForEachPoster in 1..numberOfAvailableColors) {

            combinations = combinations * numberOfAvailableColors / numberOfColorsForEachPoster

            if( numberOfPosters == combinations ) {
                return numberOfColorsForEachPoster
            }
            numberOfAvailableColors -= 1
        }
        return null
    }
}
