import java.util.*

fun main() {
    val textScanner = Scanner(System.`in`)

    println("Enter Some Text : ")
    val inputText: String = textScanner.nextLine()

    if (checkPalindrome1(inputText)) {
        println("true")
    } else {
        println("false")
    }

    checkPalindrome2("\nhehe")
}

fun checkPalindrome1(targetText: String): Boolean {
    val stringBuilder = StringBuilder(targetText)
    val reverseText = stringBuilder.reverse().toString()

    return targetText.equals(reverseText, ignoreCase = true)
}

fun checkPalindrome2(targetText: String) {
    val stringBuilder = StringBuilder(targetText)
    val reverseText = stringBuilder.reverse().toString()

    if (targetText.equals(reverseText, ignoreCase = true)) println("$targetText is palindrome - true")
    else println("$targetText is palindrome - false")
}