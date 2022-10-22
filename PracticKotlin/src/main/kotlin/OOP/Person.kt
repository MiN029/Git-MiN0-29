package OOP

import java.awt.Color

class Person (firstName : String , LastName : String){
    var fullName = """
        |firstName : $firstName
        |LastName  : $LastName
        |fullName  : ${firstName.uppercase() +" "+ LastName}
    """.trimMargin()
    fun showName () : String{
        println("Student name is\n $fullName")
        return fullName
    }
}

class InitOrderDemo(name : String){
    val firtProperty = "First Property : $name".also(::println)
    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second Propery: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class House(Color : String , room : Int){

    val Color : String
    val room : Int
    init {
        this.Color = Color
        this.room = room
    }

    constructor(room : Int , Color : String , Bathroom : Int) : this(Color, room){
      println("The color of Room : $room is $Color")
    }

}
fun main(){
    //var s1 = Person("Sovan" , "Chanmony")
    //s1.showName()

    //val s2 = InitOrderDemo("Sovan Chanmony")

    val newHouse = House("Red" , 1)
    val secondHouse = House("Blue" , 2)

}