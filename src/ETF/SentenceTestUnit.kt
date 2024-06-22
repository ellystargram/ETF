package ETF

class SentenceTestUnit {
    var testName:String = ""
    var sentences = mutableListOf<Sentence>()
    var enableEnglishWordHint:Boolean = true
}

class Sentence {
    var koreanAnswer:String = ""
    var englishAnswer:String = ""

    constructor(koreanAnswer:String, englishAnswer:String){
        this.koreanAnswer = koreanAnswer
        this.englishAnswer = englishAnswer
    }
}