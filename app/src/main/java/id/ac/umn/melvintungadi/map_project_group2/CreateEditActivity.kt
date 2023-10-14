package id.ac.umn.melvintungadi.map_project_group2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreateEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_edit)

        if (intent != null) {
            val name = intent.getStringExtra("NAME")
            val nameText = findViewById<TextView>(R.id.item_name)
            nameText.text = name
        }
    }
}