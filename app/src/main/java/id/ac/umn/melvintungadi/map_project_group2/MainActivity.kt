package id.ac.umn.melvintungadi.map_project_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private val addButton: Button
        get() = findViewById(R.id.add_item)

    private val cardItem: CardView
        get() = findViewById(R.id.card_item1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            val addIntent = Intent(this, CreateEditActivity::class.java)
            addIntent.putExtra("NAME", "")
            startActivity(addIntent)
        }

        cardItem.setOnClickListener {
            val editIntent = Intent(this, CreateEditActivity::class.java)
            editIntent.putExtra("NAME", "Placeholder")
            startActivity(editIntent)
        }
    }
}