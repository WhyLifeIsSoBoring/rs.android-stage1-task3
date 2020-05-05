package subtask6

class FullBinaryTrees {

    private fun trees(nach: String, symb: Int, free: Int): ArrayList<String> {
        if (symb==0) {
            return arrayListOf("$nach]")
        } else {
            val temp = trees("$nach,0,0", symb - 2, free+1)
            if (free > 0) {
                temp.addAll(trees("$nach,null,null", symb, free - 1))
            }
            return temp
        }
    }

    fun stringForNodeCount(count: Int): String {
        var result ="["
        if (count%2==1) {
            for (tree in trees("[0", count - 1, 0)) {
                result += tree
            }
        }
        result+="]"
        return result
    }
}
