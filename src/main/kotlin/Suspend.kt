import kotlinx.coroutines.*

data class UserDetails(val userId: String, val name: String, val age: Int)
//
//fun fetchUserDetails(userId: String, callback: (UserDetails) -> Unit) {
//
//    val userDetails = UserDetails(userId, "John Doe", 25)
//    callback(userDetails)
//}
//
//fun processUserDetails(callback: (UserDetails) -> Unit) {
//    fetchUserDetails("123456") { userDetails ->
//        callback(userDetails)
//    }
//}
//
//fun someFunction() {
//    processUserDetails { userDetails ->
//        printUserDetails(userDetails)
//    }
//}
//
//
//
//fun printUserDetails(userDetails: UserDetails) {
//    println("User ID: ${userDetails.userId}")
//    println("Name: ${userDetails.name}")
//    println("Age: ${userDetails.age}")
//}

suspend fun fetchUserDetails(userId: String): UserDetails {
    delay(1000) // Simulating delay
    return UserDetails(userId, "John Doe", 25)
}

suspend fun processUserDetails() {
    val userDetails = fetchUserDetails("123456")
    printUserDetails(userDetails)
}

suspend fun someFunction() {
    coroutineScope {
        launch {
            processUserDetails()
        }
    }
}
fun printUserDetails(userDetails: UserDetails) {
    println("User ID: ${userDetails.userId}")
    println("Name: ${userDetails.name}")
    println("Age: ${userDetails.age}")
}

