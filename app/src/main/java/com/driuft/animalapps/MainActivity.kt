package com.example.animalapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.animalapps.databinding.ActivityMainBinding

// Data class representing an Animal
data class Animal(val name: String, val imageResId: Int)

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var animalList: List<Animal>
    private lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize animal data
        initAnimals()

        // Set up RecyclerView
        adapter = AnimalAdapter(animalList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    private fun initAnimals() {
        animalList = listOf(
            Animal("Dog", R.drawable.dog_image),
            Animal("Cat", R.drawable.cat_image),
            Animal("Elephant", R.drawable.elephant_image),
            Animal("Lion", R.drawable.lion_image),
            Animal("Tiger", R.drawable.tiger_image)
        )
    }
}
