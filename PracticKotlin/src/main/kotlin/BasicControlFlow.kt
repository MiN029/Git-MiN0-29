open class Shape(){

}

private class BasicControlFlow (var height : Int , var length : Double) :Shape(){
    var perimeter = (height + length) * 2
}
fun main(args:Array<String>) {
    var basicControlFlow = BasicControlFlow(10, 12.10)
    println("The Primeter is ${basicControlFlow.perimeter}"+"\n")


    var asc = Array(10){i -> (i + i).toString()}
    asc.forEach { println(it) }
    println("the value is ${asc.get(3)}")

}