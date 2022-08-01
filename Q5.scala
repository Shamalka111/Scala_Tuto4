object fun extends App{

    def toUpper(s:String):String={

        var text:String=s.toUpperCase()
        text
    }
    def toLower(s:String):String={

        var txt:String=s.toLowerCase()
        txt
    }
    def formatNames(name: String)(func: String => String): String={
        
        func(name)
    }

    println(formatNames("Benny")(toUpper(_)))
    println(formatNames("Niroshan".substring(0,2))(toUpper(_)) + "Niroshan".substring(2))
    println(formatNames("Saman")(toLower(_)))
    println("Kumara".substring(0,5) + formatNames("Kumara".substring(5))(toUpper(_)))


}