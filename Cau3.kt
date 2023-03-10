class WordCount {
    companion object {
        fun phrase (input: String): Map<String, Int> = input.toLowerCase()
                .replace(Regex("[^\\s|'|\\w]"), "")
                .split(Regex("\\s+"))
                .groupBy{it}
                .mapValues{it.value.size}
    }
}

fun main(){
    val sentence = WordCount
    println(sentence.phrase("""That's the password: 'PASSWORD 123'!", cried the Special Agent.\nSo I fled."""))
}