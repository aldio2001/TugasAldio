package id.infinitelearning.KotlinSubmission.exercise4
import java.io.BufferedReader
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    val namafile = "aldioyohanes.txt"

    try {

        val fileReader = BufferedReader(FileReader(namafile))
        val fileContent = fileReader.readText()

        println("Isi file $namafile:\n$fileContent")

        fileReader.close()
    } catch (e: FileNotFoundException) {

        println("Error: File $namafile tidak ditemukan.")
    } catch (e: IOException) {

        println("Error: Terjadi kesalahan saat membaca file.")
    } finally {

        println("tidak bisa dijalankan.")
    }
}