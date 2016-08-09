fun main(args: Array<String>) {
    filterWonderNumbers((100000..999999)).forEach { println(it) }
}

fun filterWonderNumbers(intRange: IntRange): List<Int> {
    return intRange.filter {
        digit ->
        (2..6).map { multiplier -> digitsAreEqual(digit, digit * multiplier) }
                .firstOrNull { !it } ?: true
    }.toList()
}

fun digitsAreEqual(firstDigit: Int, secondDigit: Int): Boolean =
        firstDigit.toString().toList().sorted() == secondDigit.toString().toList().sorted()
