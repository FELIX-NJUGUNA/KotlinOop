package com.example.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        //instantiating each of our classes
        val soldier = Soldier()
        val message = Message()
        val particlesystem = ParticleSystem()

        val soldier1 = Soldier()
        val strongSoldier = Soldier()
        //accessing the classes
        soldier1.rank = "private"

        soldier1.getStatus()

        Log.i("Name: ","${soldier.name}")
        Log.i("Rank: ","${soldier.rank}")
        Log.i("Missing: ","${soldier.missing}")

        //access the value of the bullets
        Log.i("Bullets= ","${soldier.bullets}")//getter will execute

        //reduce number of bullets by one
        soldier.bullets--
        Log.i("Bullets= ","${soldier.bullets}")//setter will execute

        //using strongSoldier variable
        Log.i("Totalweight= ","${strongSoldier.totalWeight}")
        strongSoldier.packWeight  = 300 //overrides the current variable
        Log.i("Totalweight= ","${strongSoldier.totalWeight}")
    }

}
