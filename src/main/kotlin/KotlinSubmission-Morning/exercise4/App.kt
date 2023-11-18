package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    checkMycar()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun checkMycar() {

    var car = listOf(
        "Hyundai",
        "Toyota",
        "Daihatsu",
        "Suzuki",
        "Chery",
        "Mitsubishi"
    )
        try {
            println(car[10])
        } catch (e:Exception) {
            println("Index tidak ditemukan")
        }
}


