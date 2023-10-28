package id.ac.umn.melvintungadi.map_project_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.umn.melvintungadi.map_project_group2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.addItem.setOnClickListener {
            val createIntent = Intent(this, CreateEditActivity::class.java)
            startActivity(createIntent)
        }
    }
}