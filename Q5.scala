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

    println(toUpper("Benny"))
    println(toLower("NIROSHAN"))
    println(formatNames("Saman")(toLower(_)))
    println(formatNames("Kumara")(toUpper(_)))
    


}