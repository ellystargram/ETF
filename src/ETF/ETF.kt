package ETF

import Exceptions.NoETFFileDesignatedException
import java.io.File

class ETF {
    var ETFFile: File? = null;

    val root: Dir = Dir()

    fun designateETFFile(file: File) {
        ETFFile = file
    }

    fun loadETFFile() {
        if (ETFFile == null) {
            throw NoETFFileDesignatedException()
            return
        }

        var lines = ETFFile!!.readLines()
        var openedBasket: Int = 0

        var rootDirName = lines[0].split("=>TYPE:DIR(")[1].split(")")[0]

        root.dirName = rootDirName

        root.loadCurrentDir(lines, openedBasket)

        root.dirTree()
    }

    fun writeETFFile() {
        if (ETFFile == null) {
            throw NoETFFileDesignatedException()
            return
        }
    }

}

fun main() {
    val etf = ETF()
    etf.designateETFFile(File("src/ETF/ETFtestFile.etf"))
    etf.loadETFFile()
}