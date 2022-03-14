fun main() {
    //println("Input Numbers : ")
    val givenList = mutableListOf(1,2,3,4,5,6) //readLine().toString().split(" ").map { it.toInt() }
    var sums = 0
    var amount = 0
    var start = 0
    // ლუწი ინდექსებია 0-1, 2-3, 4-5
    for (i in givenList) {
        if (start%2==0) {
            sums+=i
            amount++
        }
        start++

    }
    var avg = sums/amount
    println(avg)
}
