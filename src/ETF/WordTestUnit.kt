package ETF

class WordTestUnit {
    var testName:String = ""
    var words = mutableListOf<Word>()
}

class Word {
    val koreanAnswers = mutableListOf<String>()
    val englishAnswers = mutableListOf<String>()

    fun addKoreanAnswer(answer: String) {
        koreanAnswers.add(answer)
    }
    fun addEnglishAnswer(answer: String) {
        englishAnswers.add(answer)
    }
}