import kotlinx.coroutines.*

suspend fun main() {
    val deferred = GlobalScope.async {
        println("Coroutine is executing...")
        delay(1000)
        println("Coroutine has finished executing.")
        "Coroutine result"
    }

    println("Main function continues executing...")

    val result = deferred.await()
    println("Coroutine result: $result")
}
