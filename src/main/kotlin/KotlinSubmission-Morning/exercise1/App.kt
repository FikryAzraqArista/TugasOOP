package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
 fun myProfile() {

    val firstName = "Fikry Azraq"
    val lastName = "Arista"
    val age = 22
    val single = true

    println("Name : ${firstName + lastName}")
    println("Age : $age years")
    if (single) println("Status : Single")
    else println("Status : single")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    return  println("Name : $groupId\nMember : $groupMember\nSession : $session")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val members = listOf(
        "Fikry Azraq Arista",
        "Nurul Fatma Putri Lazira",
        "Fatimatuzzahra",
        "Rifqi Nugraha",
        "Rayhan Ilyas Anabil",
        "Cahya Kelvin",
        "Adzhimatinur Azzahra",
        "Astrid",
        "Raynaldi",
        "Febri",
        "Ikram"

    )

    return members.filter { it == "Fikry Azraq Arista" }
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kelvin", "Shania", "Ifan")
    val countOfGroup = arrayOf(

        "Fikry Azraq Arista",
        "Nurul Fatma Putri Lazira",
        "Fatimatuzzahra",
        "Rifqi Nugraha",
        "Rayhan Ilyas Anabil",
        "Cahya Kelvin",
        "Adzhimatinur Azzahra",
        "Astrid",
        "Raynaldi",
        "Febri",
        "Ikram"
    )


    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Orion", listOf(
        "Fikry Azraq Arista",
        "Nurul Fatma Putri Lazira",
        "Fatimatuzzahra",
        "Rifqi Nugraha",
        "Rayhan Ilyas Anabil",
        "Cahya Kelvin",
        "Adzhimatinur Azzahra",
        "Astrid",
        "Raynaldi",
        "Febri",
        "Ikram"

    ), session = "Morning")

}