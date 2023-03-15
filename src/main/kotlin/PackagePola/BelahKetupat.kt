package PackagePola

class BelahKetupat(val tampungPiramida: Int) : InterfaceClass {
    override fun membuatPola() {
        for (i in 1 .. tampungPiramida) {
            for (j in i .. tampungPiramida - 1) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
        for (i in tampungPiramida -1 downTo(1)) {
            for(k in i..(tampungPiramida-1)) {
                print(" ")
            }
            for (j in 1..2*i-1) {
                print("*")
            }
            println()
        }
    }
}
