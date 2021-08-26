package com.train
import java.util.*

fun main(Args: Array<String>){
    val scanner = Scanner(System.`in`)
    var tickets = 0
    while (tickets!= -1) {
        print("Please enter number of tickets:")
        tickets = scanner.nextInt()
        if (tickets == -1){
            break
        }
        print("How many round-trip tickets: ")
        val roundTrip = scanner.nextInt()
        var tic = TrainTicket(tickets, roundTrip)
        tic.show()

    }
}

class TrainTicket(var tickets: Int, var roundTrip: Int) {

    fun show(){
        var total =(tickets-roundTrip)*1000+(roundTrip*2000)*0.9

        println("Total tickets:" + tickets+ "\n"
                +"Round-trip:"+ roundTrip +"\n"
                +"Total:"+total)

    }
  }

