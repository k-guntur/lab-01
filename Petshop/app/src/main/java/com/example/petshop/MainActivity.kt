package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // val pet = Pet("Rocky", 3)
        val cat = Cat("Rocky", 3)
        val dog = Dog("Bobby", 2)
        val pets = mutableListOf<Pet>(cat, dog)

        val scorpion = Scorpion("Viper", 20)

        pets.add(scorpion)

        val pettablePets = mutableListOf<Pettable>(cat, dog, scorpion)


    }
}
