package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    for (i in 1..100){
        if(i % 2 ==0){
            println("nilai bilangan bulat :$i ")
            }}


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini


    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

        val NamaBulan: Map<String, String> = mapOf(
            "Jan" to "January",
            "Feb" to "Febuary",
            "Mar" to "Maret",
            "Apr" to "April",
            "Mei" to "Mei",
            "Jun" to " Juni",
            "Jul" to "Juli",
            "Agu" to "Agustus",
            "Sep" to "September",
            "Okt" to "Oktober",
            "Nov" to "November",
            "Des" to "Desember"
        )
    NamaBulan.forEach { (key,value) ->
        println("$key -> $value")
    }

    val BulanSekarang ="Nov"
    val ulangtahunsekarang ="Jun"
    print("it's $BulanSekarang I Was born in $ulangtahunsekarang")

    }

