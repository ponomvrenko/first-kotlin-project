package danil.ponomarenko

fun main() {
    getUserCityInput()
}

fun getUserCityInput() {
    println("Enter your city...")
    var city : String? = readLine()

    while (city.isNullOrBlank()) {
        println("City can't be null or empty! Please, enter your city again:")
        city = readLine()
    }

    println("User lives in $city")
}