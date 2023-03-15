import PackagePola.*

fun main() {
    println("Membuat pola piramida")
    val piramida = PiramidaBintang(8)
    piramida.membuatPola()
    println()

    println()
    println("Membuat pola piramida terbalik")
    val piramidaTerbalikUhuy = PiramidaTerbalik( 8)
    piramidaTerbalikUhuy.membuatPola()
    println()

    println()
    println("Membuat pola belah ketupat")
    val belahKetupat = BelahKetupat(8)
    belahKetupat.membuatPola()
    println()

    println()
    println("Membuat pola bintang")
    val bintangX = X(17)
    bintangX.membuatPola()
    println()

    println()
    println("Membuat pola segitiga Siku")
    val segitigaSiku = SegitigaSiku(8)
    segitigaSiku.membuatPola()
    println()

    println()
    println("Membuat pola plus")
    val ngeprinPlus = Plus(9)
    ngeprinPlus.membuatPola()
    println()
}


