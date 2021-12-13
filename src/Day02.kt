fun main() {
    fun part1(input: List<String>): Int {
        var depth = 0
        var horizontal = 0

        for (i in input){
            val lineList = i.split(" ")
            val direction = lineList[0]
            val amount = lineList[1].toInt()

            when(direction){
                "forward" -> horizontal += amount
                "down" -> depth += amount
                "up" -> depth -= amount
            }
        }
        return depth * horizontal
    }

    fun part2(input: List<String>): Int {
        var depth = 0
        var horizontal = 0
        var aim = 0

        for (i in input){
            val lineList = i.split(" ")
            val direction = lineList[0]
            val amount = lineList[1].toInt()

            if (direction == "forward" && aim == 0) {
                horizontal += amount
            } else if (direction == "forward") {
                horizontal += amount
                depth += amount * aim
            } else if (direction == "down") {
                aim += amount
            } else if (direction == "up") {
                aim -= amount
            }

        }
        return depth * horizontal
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
//    check(part1(testInput) == 150)
    check(part2(testInput) == 900)


    val input = readInput("Day02")
//    println(part1(input))
    println(part2(input))
}
