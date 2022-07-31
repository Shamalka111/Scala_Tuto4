object pattern extends App{

    def read()={

        print("Enter Number: ")
        val res = scala.io.StdIn.readInt()

        if(res <= 0){
            println("Negative/Zero")
            
        }else{
            if(res%2 ==0){
                println("Even Number")

            }else{
                println("Odd Number")
            }
        }
    }

    read()
}