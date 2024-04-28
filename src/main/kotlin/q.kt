import kotlinx.coroutines.*

fun main() {
    val job = GlobalScope.launch(start = CoroutineStart.UNDISPATCHED) {
        println("Coroutine is executing...")
        delay(1000)
        println("Coroutine has finished executing.")
    }

    println("Main function continues executing...")

    Thread.sleep(2000)
}
