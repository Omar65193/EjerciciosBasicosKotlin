fun main(args: Array<String>){
    print("Escribe 1 2 o 3 para ejecutar un ejercicio: ")
    val ejercicio = readLine()!!.toInt()
    print("\n")

    when(ejercicio){
        1 -> {
            //EJERCICIO 1
            val morningNotification = 51
            val eveningNotification = 135

            printNotificationSummary(morningNotification)
            printNotificationSummary(eveningNotification)
        }
        2 -> {
            //EJERCICIO 2
            val child = 5
            val adult = 28
            val senior = 87

            val isMonday = true

            println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
            println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
            println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")

        }
        3 -> {
            //EJERCICIO 3

            printFinalTemperature(27.0,"Celsius","Farenheit", { temperature: Double -> (9.0*temperature)/5.0 + 32.0})
            printFinalTemperature(350.0,"Kelvin","Celsius", { temperature: Double -> temperature-273.15})
            printFinalTemperature(10.0,"Farenheit","Kelvin", { temperature: Double -> ((5.0/9.0)*(temperature-32.0))+273.15})

        }
    }




}

//EJERCICIO 1
fun printNotificationSummary(numberOfMessages: Int){
    if(numberOfMessages<100) println("You have $numberOfMessages notifications.")
    else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

//EJERCICIO 2
fun ticketPrice(age: Int, isMonday: Boolean): Int{
    var res: Int = 0

    if(age <= 12){
        res += 15

    }else if(age in 13..60){
        res = if(isMonday) 25 else 30

    }else if (age>=61){
        res = 20

    }else{
        res = -1
    }

    return res
}

//EJERCICIO 3
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
){
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}