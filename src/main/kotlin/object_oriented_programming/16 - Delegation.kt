package object_oriented_programming

/**
 * ## Delegation
 *
 * Delegation pattern is an object-oriented design pattern. - Delegated responsibilities to other objects.
 * Delegation is Native in Kotlin.
 * A good alternative to implement inheritance
 *
 */

interface DDownloader {
    fun download()
}

interface PPlayer {
    fun play()
}

class FileDownloader(private val file: String) : DDownloader {
    override fun download() {
        println("$file Downloaded")
    }
}

class FilePLayer(private val file: String) : PPlayer {
    override fun play() {
        println("$file is Playing")
    }
}

/*
    Delegation Pattern, here in MediaFile class we delegate the responsibilities to the downloader and player objects.
    BUt, kotlin supports this implementation Natively and we don't need to write explicitly everything in class.
    SO, we refactor the class from :

class MediaFile(
    private val downloader: DDownloader,
    private val player : PPlayer
) : DDownloader, PPlayer{

    override fun download() {
        //Delegate the Download function to downloader object
        downloader.download()
    }

    override fun play() {
        // Delegate the play function to player object
        player.play()
    }
}
*/

class MediaFile(
    private val downloader: DDownloader, private val player: PPlayer
) : DDownloader by downloader, PPlayer by player

fun main() {

    val file = "sampleFile.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePLayer(file))
    mediaFile.play()
    mediaFile.download()
}
