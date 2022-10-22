import java.lang.IllegalArgumentException

fun main(){
    fail("It's Error")
}
fun fail(message : String) : Nothing{
    throw IllegalArgumentException(message)
}