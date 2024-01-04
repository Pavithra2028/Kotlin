package com.example.kotlinbasics

fun main(){
    Makecoffee()
    AddSugarCount(2)

    //Function with Return type in User Input
    println("Enter the Number 1")
    val num1str = readln().toInt()
    println("Enter the Number 2")
    val num2str = readln().toInt()
    val myresult = AddTwoNumbers(num1str,num2str)
    println(myresult)

}
//Function
fun Makecoffee(){
    println("Buy Beans")
    println("Grind Beans")
    println("Heat Water to 90degree celsius")
    println("Add Water")
    println("Push Hot water through the Grinded Beans")

}
//Function with Parameter
fun AddSugarCount(sugar:Int){
    println("Sugar Added $sugar spoon ")
}
//Function with Return Type
fun AddTwoNumbers(num1:Int,num2:Int):Int{
    val result = num1+num2
    return result
}




