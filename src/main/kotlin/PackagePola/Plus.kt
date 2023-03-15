package PackagePola

class Plus (val tampungPlus: Int):InterfaceClass{
    override fun membuatPola() {
        for (i in 0 until tampungPlus) {
            for (j in 0 until tampungPlus) {
                if (i == tampungPlus / 2 || j == tampungPlus / 2) {
                    print("*") // menampilkan tanda '*' pada diagonal
                } else {
                    print(" ") // menampilkan spasi pada bagian lainnya
                }
            }
            println() // pindah baris
        }
    }

}