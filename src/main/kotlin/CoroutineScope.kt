import kotlinx.coroutines.*

fun main() {
    val customScope = CoroutineScope(Dispatchers.Default)

    customScope.launch {
        println("Coroutine running in custom CoroutineScope")
    }

    Thread.sleep(1000)
}
