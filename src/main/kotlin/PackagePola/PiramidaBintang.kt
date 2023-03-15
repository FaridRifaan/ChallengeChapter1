package PackagePola

class PiramidaBintang(val tampunganPiramda: Int): InterfaceClass {
    override fun membuatPola() {
        for (i in 0 until tampunganPiramda) {
            for (j in 0 until tampunganPiramda - i) {
                print(" ")
            }
            for (j in 0..i) {
                print("* ")
            }
            println()
        }

    }

}