package com.example.kotlinbasics

fun main(){
    val a =10
    val b =15
    if(a<b){
        println("B is Greater")
    }
    else {
        println("A is Greater")
    }
    val day = 3
    val result = when (day){
        1 -> ("Monday")
        2 -> ("Tueday")
        3 -> ("Wednesday")
        4 -> ("Thursday")
        5 -> ("Friday")
        6 -> ("Saturday")
        else -> ("Invalid")
    }
    println(result)

    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    var j = 0
    while (j < 10) {
        if (j == 4) {
            j++
            continue
        }
        println(j)
        j++
    }


    var count = 0
    while(count <5){
        println("Count is $count")
        count++

    }

    var cars = arrayOf("BMW","Audi","Benz","Santro","Ford","Renault")
    println(cars.size)

}