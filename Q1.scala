object interest extends App{

    def interest(x:Double):Double= x match{

            case n if(n<=20000) => n*2/100
            case n if(n<=200000) => n*4/100 
            case n if(n>200000) => n*6.5/100
    }
    println("rate is "+interest(200000))
}