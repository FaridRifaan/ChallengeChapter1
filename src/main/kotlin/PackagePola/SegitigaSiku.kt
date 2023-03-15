package PackagePola

class SegitigaSiku(val printSegitigaSiku: Int) : InterfaceClass {
    override fun membuatPola() {
            val segitiga = 8
            for (i in 0 until segitiga) {
                for (j in 0 downTo segitiga - i) {
                    print(" ")
                }
                for (j in 0..i) {
                    print("* ")
                }
                println()
            }
    }

}