package PackagePola

class X(val tampungX: Int): InterfaceClass {
    override fun membuatPola(){
     // ukuran dari karakter X
    for (i in 0 until tampungX) {
        for (j in 0 until tampungX) {
            if (i == j || i + j == tampungX - 1) {
                print("*") // menampilkan tanda '*' pada diagonal
            } else {
                print(" ") // menampilkan spasi pada bagian lainnya
            }
         }
        println() // pindah baris
        }
    }

}