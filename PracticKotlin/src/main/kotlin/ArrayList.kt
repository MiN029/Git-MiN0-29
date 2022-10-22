fun main(args:Array<String>){
    foo()
    foo2()
}
fun foo(){
    listOf(1,2,3,5,1).forEach lit@{
        if (it == 3)  return@lit
        println(it)
    }
    println("this point is unreachable");
}

fun foo2(){
    listOf(1,2,4,5,6).forEach (fun(value: Int){
       if(value == 4) return
        println(value)
    })
    println("done with anonymous fucntion")
}

