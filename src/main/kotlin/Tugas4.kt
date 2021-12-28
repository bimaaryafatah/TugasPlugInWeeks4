fun main() {
    //soal no1//
    for (x in 1..4) {
        for (y in 1..x) {
            print(y)
        }
        print("\n")
    }
    //soal no 2//
    print("Masukkan Angka : ")
    val Nilai = readLine()!!.toInt()
    print("masukkan pangkatnya : ")
    val Pangkat = readLine()!!.toInt()
    println("\n Hasil dari $Nilai pangkat $Pangkat adalah = ${Math.pow(Nilai.toDouble(), Pangkat.toDouble())}")

}
