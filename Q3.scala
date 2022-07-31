object Car extends App{

    case class Car(name: String,price: Double)

    class CarUUID(car: Car){
        var uuid:String=s"car uuid = ${car.name} - ${car.name.hashCode}"
    }
    implicit def uuid(car: Car): CarUUID = {
        new CarUUID(car)
    }

    var car1=Car("bmw 3 series",20000)
    var car2=Car("bmw 5 series",50000)
    var car3=Car("vw passat",10000)
    var car4=Car("vw golf",12000)
    var car5=Car("mazda 3",15000)

    var carList=List(car1,car2,car3,car4,car5)
    
    def displayCar(x:List[Car]):Any={
        if(!x.isEmpty){
            println(x.head.uuid)
            displayCar(x.tail)
        }
    }

    displayCar(carList)
    
  }

