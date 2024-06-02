package Exceptions

class NoETFFileDesignatedException : Exception(){
    override val message: String?
        get() = "No ETF.ETF file designated"
}