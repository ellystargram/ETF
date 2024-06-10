import ETF.Sentence
import ETF.SentenceTestUnit

fun main() {
    println("ET is booting")
    val englishTester = ET()

    val SentenceTestUnit = SentenceTestUnit()
    SentenceTestUnit.testName = "Sentence Test Unit 2"
    SentenceTestUnit.sentences.add(
        Sentence(
            "어렸을 때, 가족과 장거리 자동차 여행을 가는 것보다 내가 더 좋아했던 것은 없었다.",
            "When I was a child, there was nothing that I loved more than going on long car journeys with my family."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "내 자전거는 내가 걷는 것보다 더 빨리 움직이고, 더 먼 거리를 이동할 수 있게 해준다.",
            "My bike helps me move faster and cover longer distances than I would on foot."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "자전거는 나의 가장 선호되는 이동 수단이 되었다.",
            "The bicycle has taken over as my most preferred mode of transportation."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "게다가, 자전거를 이용하면, 대중교통의 제한적인 노선과 일정뿐만 아니라 교통 체증으로부터 자유로워 질 수 있다.",
            "In addition, if I use my bike, I can be free from traffic jams as well as public transit's restrictive routes and schedules."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "아름다운 강변의 자전거 길이나 관심을 끄는 매력적인 동네를 만나면, 그 기회를 잡는다.",
            "If I come upon a beautiful riverside bike path or a charming neighborhood that intrigues me, I seize the opportunity."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "처음 방문했을 때 모든 것을 보지 못한다 하더라도, 나중에 언제나 자전거를 타고 돌아올 수 있다.",
            "Even if I end up not being able to see everything during my first visit, I can always return on my bike later."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "고요하고 달빛이 비쳐지는 밤에 수백만 개의 눈송이가 떨어지는 광경보다 더 아름다운 것은 없습니다.",
            "There is nothing more beautiful than the sight of millions of snowflakes falling on a still and moonlit night."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "자전거는 대도시 지역을 체험하는 독립적이고도 자유로운 방식을 제공한다.",
            "A bicycle provides an independent and liberating way of experiencing metropolitan areas."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "버스를 찾거나 오래 걸을 걱정 없이 나는 사람들의 발길이 닿지 않는 곳에 갈 수 있고 그 지역의 곳곳을 탐험할 수 있다.",
            "I can go off the beaten path and explore every corner of the area without worrying about finding a bus or making a long trek on foot."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "자전거 타기는 걷는 것, 혹은 자동차를 운전하는 것으로는 불가능한 방식으로 도시를 즐기는 자유를 당신에게 줄 수 있다.",
            "Cycling can give you the freedom to enjoy cities in ways that are impossible by walking, or driving a car."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "당신의 자전거가 여행을 최대한으로 활용할 수 있게 해주는 열쇠가 될 수 있다.",
            "Your bicycle can become the key to getting the most out of your travels."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "최고의 제품을 찾는 방법은 이 모든 정보를 고려하는 것입니다.",
            "The way to find the best product is to take all of this information into account."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "우리 모두는 그의 친절한 행동과 그가 그 일을 수행하는 유쾌한 방식 때문에 그를 존경 했습니다.",
            "We all respected him for his act of kindness and for the pleasant way in which he had performed it."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "코끼리가 돌진하는 방식이 가장 인상적이었습니다.",
            "The way the elephant charged was most impressive."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "그는 너무 피곤해서 승강장에 있는 의자에 쓰러져 잠이 들었다.",
            "He was so tired that he collapsed in a seat on the platform and fell asleep."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "다음 번 그가 깨어났을 때는 약 12시간이 흘러 있었다.",
            "The next time he woke up, about 12 hours had passed."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "그는 형을 찾기 위해 필사적으로 울부짖으며 오랫동안 기차 안을 뒤졌지만, 찾을 수 없 었다.",
            "He searched the train for a long time crying out for his brother desperately, but he couldn't find him."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "국토를 가로질러 거의 1,000km를 이동한 후에, 그는 Howrah라는, 사람이 많고 빈민가 로 악명이 높은 도시에 도착했다.",
            "After traveling nearly a thousand kilometers across the country, he arrived in Howrah, a city that is populous and notorious for its slums."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "과학자들, 특히 젊은 과학자들은 결과에 너무 집착할 수 있습니다.",
            "Scientists, especially young ones, can get too obsessed with results."
        )
    )
    SentenceTestUnit.sentences.add(
        Sentence(
            "부모들이 아이들에게 양치질을 시키는 것이 쉽지 않습니다.",
            "It's not easy for parents to get their kids to brush their teeth."
        )
    )

    println("ET is ready")
    println(SentenceTestUnit.sentences.size)


    do {
        print("command: ")
        val userInput: String = readln().toLowerCase()
        if (userInput == "exit") {
            break
        } else if (userInput == "go") {
            test20(SentenceTestUnit)
        } else if (userInput == "prac"){
           prac(SentenceTestUnit)
        }

    } while (true)
}

class ET {
    // ET is standing for "English Test"

}


fun test20(SentenceTestUnit: SentenceTestUnit) {
    // pick random 20 sentences but don't repeat
    val randomSentences = mutableListOf<Sentence>()
    var quizNumber = 1

    val incorrectedSentences = mutableListOf<Sentence>()
    while (randomSentences.size < 20) {
        val randomSentence = SentenceTestUnit.sentences.random()
        if (randomSentences.contains(randomSentence)) {
            continue
        }
        randomSentences.add(randomSentence)

        println("Quiz $quizNumber")
        println("Korean: ${randomSentence.koreanAnswer}")

        var preWork = randomSentence.englishAnswer.replace(".", "")
        preWork = preWork.replace(",", "")
        preWork = preWork.replace(";", "")
        preWork = preWork.replace(":", "")
        preWork = preWork.replace("!", "")
        preWork = preWork.replace("?", "")

        preWork = preWork.lowercase()

        val mixEnglishWord: List<String> = preWork.split(" ").shuffled()
        val mixEnglishSentence = mixEnglishWord.joinToString(" / ")
        println("English: $mixEnglishSentence")
        println()
        quizNumber++
        print("Answer: ")
        val userAnswer = readln()
        if (userAnswer == randomSentence.englishAnswer) {
            println("Correct!")
        } else {
            println("Incorrect!")
            println("Correct Answer: ${randomSentence.englishAnswer}")
            incorrectedSentences.add(randomSentence)
        }
    }
    println("End of the test")
    println("Incorrected Sentences")
    for (sentence in incorrectedSentences) {
        println("Korean: ${sentence.koreanAnswer}")
        println("English: ${sentence.englishAnswer}")
        println()
    }


}

fun prac(sentenceTestUnit: SentenceTestUnit){
    var quizNumber = 1
    for (sentence in sentenceTestUnit.sentences){
        println("Quiz $quizNumber")
        println("Korean: ${sentence.koreanAnswer}")
        println("English: ${sentence.englishAnswer}")
        println()
        var userAnswer = readln()
        quizNumber++
    }

    println("finished")
}