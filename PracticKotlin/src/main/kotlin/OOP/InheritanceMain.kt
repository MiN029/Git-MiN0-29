package OOP

import javax.naming.Context

open class InheritanceMain (animalName : String , behavior : String){
    val animalName : String
    val behavior : String

    init {
        this.animalName = animalName
        this.behavior = behavior

    }

    open fun SoundOfAnimal (Sound : String) : Unit{
        println("the Sound of $animalName like $Sound")
    }
}

class cat (animalName: String , behavior: String) : InheritanceMain(animalName , behavior){
    override fun SoundOfAnimal(Sound: String){
        println("the sound of $animalName like $Sound")
    }
}

//inheritance from interface name Shape don't user super keyword

interface Shape{
    val vertexCount : Int
}

class Ractangle(override val vertexCount : Int = 4) : Shape{
    init {
        vertexCount.also {value -> println("the value of vertexCount: $value") }
    }
}

class Polygon : Shape{
    override val vertexCount: Int = 12
    init {
        vertexCount.also { value -> println("the value of vertexCound must be : $value") }
    }
}

open class Base (Name : String){
    init {println("Initializing a base class")}
    open val size : Int = Name.length.also { println("Initializing size in the base class : $it") }
}

class Derived(
    Name: String,
    val LastName : String
) : Base(Name.replaceFirstChar { it.uppercase().also { println("Argument for the base class : $it") } }) {
    override val size: Int = (super.size + LastName.length).also { println("Initializing size in the derived class: $it") }
}

fun main (){

    val animal1 = InheritanceMain("Dog" , "eating")
    animal1.SoundOfAnimal("Wheew Wheew")

    val animal2 = cat("Cat" , "Jumping")
    animal2.SoundOfAnimal("Meow Meow")

    val Ractangle = Ractangle()
    val Polygon = Polygon()

    println("Constructing the derived class(\"hello\", \"world\")")
    Derived("Hello" , "World")
}