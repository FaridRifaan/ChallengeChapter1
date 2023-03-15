package PackagePola

class PiramidaTerbalik(val tampungPiramidaTerbalik: Int): InterfaceClass {
    override fun membuatPola() {
        for (i in tampungPiramidaTerbalik downTo(1)) {
            for(k in i..(tampungPiramidaTerbalik-1)) {
                print(" ")
            }
            for (j in 1..2*i-1) {
                print("*")
            }
            println()
        }
    }

}