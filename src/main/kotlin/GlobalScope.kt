import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main() {
    GlobalScope.launch {
        println("Coroutine running in GlobalScope")
    } 

}
