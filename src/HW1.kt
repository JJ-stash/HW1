fun main() {
    println("Input Numbers : ")
    val givenList = readLine().toString().split(" ").map { it.toInt() }
    var oddSums = 0
    var amountOdds = 0

    for ( i in givenList) {
        if ( i%2==0 ) {
            amountOdds++
            oddSums+=i
        }
    }
    var avgOdds = oddSums/amountOdds
    println(avgOdds)
}