package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepanaldio: String = "Aldio"
    val namaBelakangaldio: String = "Yohanes"
    val program: String = "MobileDev"
    val age: Int = 22
    val isSingle: Boolean = true

    val myProfile = Profile(namaDepanaldio, namaBelakangaldio, program, age, isSingle)

    println("Nama Depan: ${myProfile.namaDepanaldio}")
    println("Nama Belakang: ${myProfile.namaBelakangaldio}")
    println("Program Studi: ${myProfile.program}")
    println("Umur: ${myProfile.age}")
    println("Status: ${if (myProfile.isSingle) "Single" else "Tidak"}")
}

class Profile(
    val namaDepanaldio: String,
    val namaBelakangaldio: String,
    val program: String,
    val age: Int,
    val isSingle: Boolean
)

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members:")
    groupMember.forEachIndexed { index, member ->
        println("${index + 1}. $member")
    }
    println("Session: $session")

    return "Group detail printed successfully"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<String?> {
    val groupMembers = listOf( "Aldio Yohanes", "Cakra Wira Bumi Putra", "Choirul Huda",
        "Cindy Putri Az Zahra", "Raihanah Tsabitah", "Raden Ayu Alfirah Aliyah")

    val myName = groupMembers.firstOrNull { it == "" }
    return groupMembers

}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    val mentors = arrayOf("BgImam","BgJovian")
    val countOfGroup = arrayOf( "Aldio Yohanes", "Cakra Wira Bumi Putra", "Choirul Huda",
        "Cindy Putri Az Zahra", "Raihanah Tsabitah", "Raden Ayu Alfirah Aliyah")
    return mentors.size + countOfGroup.size
}

fun main() {
    myProfile()

    val myTeam = myTeam()

    println("Nama Kelompok Massive: $myTeam")

    val totalMember = totalMember()
    println("Total Member group: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     */
    val groupId = "Zero Waste Heroes"

    val members = listOf(
        "Aldio Yohanes", "Cakra Wira Bumi Putra", "Choirul Huda",
        "Cindy Putri Az Zahra", "Raihanah Tsabitah", "Raden Ayu Alfirah Aliyah"
    )

    val session = "Afternoon"
    groupDetail(groupId, members, session)
}
