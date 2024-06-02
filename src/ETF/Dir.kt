package ETF

class Dir {
    var dirName = "/"
    var insideDir = mutableListOf<Dir>()
    var insideTestUnit = mutableListOf<WordTestUnit>()
    var insideSentenceTestUnit = mutableListOf<SentenceTestUnit>()

    fun dirTree(depth: Int = 0) {
        println("\t".repeat(depth) + "DIR:" + dirName)
        for (wordTestUnit in insideTestUnit) {
            println("\t".repeat(depth + 1) + "WTU:" + wordTestUnit.testName)
        }
        for (sentenceTestUnit in insideSentenceTestUnit) {
            println("\t".repeat(depth + 1) + "STU:" + sentenceTestUnit.testName)
        }
        for (dir in insideDir) {
            dir.dirTree(depth + 1)
        }
    }

    fun getDir(dirName: String): Dir? {
        for (dir in insideDir) {
            if (dir.dirName == dirName) {
                return dir
            }
        }
        return null
    }

    fun getWordTestUnit(wtuName: String): WordTestUnit? {
        for (wtu in insideTestUnit) {
            if (wtu.testName == wtuName) {
                return wtu
            }
        }
        return null
    }

    fun getSentenceTestUnit(stuName: String): SentenceTestUnit? {
        for (stu in insideSentenceTestUnit) {
            if (stu.testName == stuName) {
                return stu
            }
        }
        return null
    }

    fun loadCurrentDir(lines: List<String>, openedBasket: Int) {
        var currentDirStartLineNumber: Int = 0
        var currentDirEndLineNumber: Int = 0

        var openBasketCount: Int = 0
        var closeBasketCount: Int = 0
        var targetBasketCount: Int = 0

        for (i in openedBasket until lines.size) {
            if (lines[i].contains("<")) openBasketCount++
            if (lines[i].contains(">")) closeBasketCount++
            if (lines[i].startsWith("=>TYPE:DIR(" + dirName + ")") and (openBasketCount - closeBasketCount == openedBasket)) {
                currentDirStartLineNumber = i
                targetBasketCount = currentDirStartLineNumber
            }
            if (targetBasketCount != 0 && openBasketCount - closeBasketCount == openedBasket - 1) {
                currentDirEndLineNumber = i
                break
            }
        }

        for (i in currentDirStartLineNumber until currentDirEndLineNumber) {
            println(lines[i])
        }
    }


}