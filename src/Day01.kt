fun main() {
    fun part1(input: List<String>): Int {
        var count = 0
        var cur: Int = input[0].toInt()
        for (i in 1..input.size-1){
            if (input[i].toInt() > cur){
                count += 1
            }
            cur = input[i].toInt()
            if (i == input.size-1){
                break
            }
        }

        return count
    }

    fun part2(input: List<String>): Int {
        var count = 0
        var cur: Int
        if (input.size < 3) { return 0 }
        else { cur = input[0].toInt() + input[1].toInt() + input[2].toInt()  }

        for (i in 3..input.size-1){ //1,2,3,4,5,6
            val next = cur - input[i - 3].toInt() + input[i].toInt()
            if (next > cur){
                count += 1
            }
            cur = next
            if (i == input.size-1){
                break
            }
        }

        return count
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)


    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
