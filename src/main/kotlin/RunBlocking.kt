import kotlinx.coroutines.*

fun main() {
    println("Main starts")

    runBlocking {
        println("Coroutine starts")
        delay(1000)
        println("Coroutine ends")
    }

    println("Main ends")
}
