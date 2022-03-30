fun main(){
    var car=Car("Benz","E240","Black",20)
    var bus=Bus("Mitsubishi","Suzuki","Grey",30)
    car.Carry(50)
    car.identity()
    car.calculateparkingfees(10)
    bus.maxTripFare(100.50)
   bus.calculateparkingfees(12)
}
  open class Car(var Make:String,var Model:String,var color:String,var Capacity:Int){
     open fun Carry(people:Int){
    var x=people-Capacity
    if (people<=Capacity){

      println("Carrying $people passangers")}
    else
       println("Over capacity by $x people")

    }
      fun identity(){
          println("I have a $color $Make $Model")
      }
      fun calculateparkingfees(Hours:Int):Int{
      var passenger=20*Hours
          println(passenger)
          return passenger
      }
}
class Bus(Make: String, Model: String, color: String, Capacity: Int):Car(Model,Make,color,Capacity){
       fun maxTripFare(fare: Double){
          var trip=10*fare
        println(trip)
      }


}

