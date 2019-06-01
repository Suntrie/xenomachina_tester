@file:Suppress("UNUSED_PARAMETER", "unused")
package novella
import com.xenomachina.argparser.ArgParser

@Suppress("UNREACHABLE_CODE")
class ResOfNovel (parser: ArgParser){

    val b by parser.flagging("help text")
    val name by parser.storing(
        "-N", "--name",
        help = "name of the user")


}
