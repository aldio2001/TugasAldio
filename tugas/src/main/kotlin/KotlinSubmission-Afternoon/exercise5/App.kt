package id.infinitelearning.KotlinSubmission.exercise5


fun main() {
    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    class Hero(var name: String, var age: Int, var height: Double) {


        /**
         * Latihan 2
         * Set data profile dengan memanggil fungsi setProfile() dibawah ini
         * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
         *
         */
    fun setProfile(name: String, age: Int, height: Double) {
            this.name = name
            this.age = age
            this.height = height
        }
        /**
         * Latihan 3
         * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
         *
         */
        fun displayProfile() {
            println("Profile:")
            println("Name: $name")
            println("Age: $age Tahun")
            println("Height: $height meter")
        }
        /**
        Challenge:
        ===============Class A Afternoon===============
        4Keys -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
        CELESTIAL -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
        Strix -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
        Fast and Serious -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
        Kuda Terbang -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
        Geek Genius's Team -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
        Enforcers -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
        HA HENG -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
        End Game -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
        Fly Without Wings -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
        Unity Force -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
        11:11 ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x

        ===============Class B Afternoon===============
        FRINIGHT -> jalan 2x, lari 4x, makan 3x, minum 2x, lompat 1x, duduk 2x
        EnviGrowth -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x
        ZWH (Zero Waste Heroes) -> jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
        Serenity -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
        UNLIMITED INNOVATION -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
        Procyon -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
        Beta+ -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
        Elevens United -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
        OmniDev -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
        COSMOPOLITE -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
        GrowZen -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
        Unpredictable (Group Merge 12)
        NusaVote -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
        Vortex -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

         **/

        /**
         * Latihan 4
         * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
         *
         */
        fun activityChallenge(activity: String, repetition: Int) {
            println("$name sedang melakukan $activity $repetition menit.")
        }
    }

        val hero = Hero(name = "Aldio", age = 22, height = 1.75)
        hero.setProfile(name = "Aldio Yohanes", age = 22, height = 1.75)
        hero.displayProfile()

        hero.activityChallenge("jalan", 1)
        hero.activityChallenge("lari", 2)
        hero.activityChallenge("makan", 3)
        hero.activityChallenge("minum", 4)
        hero.activityChallenge("lompat", 5)
        hero.activityChallenge("duduk", 6)
        /**
         * Latihan 5
         * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
         *
         */
    hero.displayProfile()

    }

