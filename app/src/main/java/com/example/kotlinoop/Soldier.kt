package com.example.kotlinoop

import android.util.Log

 class Soldier {
    //class members
    val name = "Felix"
    var rank:String = "Commander"
    val missing = true
    var bullets = 100
    var packWeight = 150
     private val gunWeight = 30
     var totalWeight = packWeight + gunWeight

         //getter function for the total weight
         get() = packWeight + gunWeight


    //class functions
    fun getStatus(){
        var status = "$rank $name"
        if(missing){
            status = "$status is missing!"
        }else{
            status = "$status ready for duty."
        }

        //print out the status
        Log.i("Status: ",status)
    }
    //getters and getters

}