package novella


import com.xenomachina.argparser.ArgParser


fun main (args: Array<String>){
    val t = ArgParser(args).parseInto(::ResOfNovel)
    println(t.b)
    println(t.name)

}


