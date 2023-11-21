package cars

class PrintInfoCar {
    fun cars(car: Car) {
        println("Марка: ${car.brand}")
        println("Модель: ${car.model}")
        println("Двигатель: ${car.engine}")
    }

}