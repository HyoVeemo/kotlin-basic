package oop

class MusicPlayerMain4 {
    fun run() {
        val player = MusicPlayer()

        player.on()
        player.volumUp()
        player.volumUp()
        player.volumnDown()
        player.statusShow()
        player.off()
    }

}


fun main(args: Array<String>) {
    MusicPlayerMain4().run()
}