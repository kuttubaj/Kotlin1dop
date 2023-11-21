import cars.Car
import cars.PrintInfoCar
import java.util.*
import kotlin.math.sign

fun main(args: Array<String>) {
    val characteristicsList = listOf(
        Car(" Mercedes", " GLE_Coupe", " 612л.с"),
        Car(" BMW", " x5", " 500л.с"),
        Car(" Porshe", " AG", " 430л.с"),
        Car(" Honda", " accord", " 456л.с")
    )

    val printInfo = PrintInfoCar()

    characteristicsList.forEachIndexed { index, name ->
        println("${index + 1}: ${name.brand}")
    }

    val scanner = Scanner(System.`in`)
    println("напишите номер машины , о котором вы хотите узнать:")
    val carInput = readLine()?.toIntOrNull()

    if (carInput != null && carInput >= 1 && carInput <= carInput) {
        val selectedCars = characteristicsList[carInput - 1]
        println("Информация о <<${selectedCars.model}>>:")
        printInfo.cars(selectedCars)
    } else {
        println("error")
    }
}