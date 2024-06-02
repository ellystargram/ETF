import java.io.File

class ETF {
    var ETFFile = File("")

    fun setETFFile(file: File) {
        ETFFile = file
        loadETFFile()
    }

    fun loadETFFile() {
        val lines = ETFFile.readLines()
        for (line in lines) {
            println(line)
        }
    }
}