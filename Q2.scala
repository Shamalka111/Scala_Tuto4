object cart extends App{

  case class ShoppingCartItem(name: String, price: Double, bougthQty: Int)

  var item1 = ShoppingCartItem("vanilla ice cream",3.99,13)
  var item2 = ShoppingCartItem("chocolate biscuits",4,6)
  var item3 = ShoppingCartItem("cupcakes",7.77,7)

  var basket = List(item1,item2,item3)

  def displayCart(x:List[ShoppingCartItem]):Any={
    if(!x.isEmpty){
      println(s"${x.head.bougthQty} ${x.head.name} at Rs ${x.head.price} each")
      displayCart(x.tail)
    }
  }

  def findIceCream(x:List[ShoppingCartItem]):Any={
    if(!x.isEmpty){
      if(x.head.name=="vanilla ice cream"){
        println(s"${x.head.bougthQty} ${x.head.name} at Rs ${x.head.price} each")
      }else{
        println("Found another item")
      }
      findIceCream(x.tail)
    }
  }

  displayCart(basket)
  println(" ")
  findIceCream(basket)

}



