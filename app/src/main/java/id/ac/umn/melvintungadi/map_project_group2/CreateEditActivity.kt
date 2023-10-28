package id.ac.umn.melvintungadi.map_project_group2

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.DatePicker
import id.ac.umn.melvintungadi.map_project_group2.databinding.ActivityCreateEditBinding
import java.util.Calendar

class CreateEditActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {
    private lateinit var binding: ActivityCreateEditBinding

    private var day = 0
    private var month = 0
    private var year = 0

    private var dayPick = 0
    private var monthPick = 0
    private var yearPick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.dateButton.setOnClickListener {
            onDateClick()
        }
    }

    private fun onDateClick() {
        getDateTimeCalendar()
        DatePickerDialog(this, this, year, month, day).show()
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        dayPick = dayOfMonth
        monthPick = month + 1
        yearPick = year

        val date = Editable.Factory.getInstance().newEditable("$dayPick/$monthPick/$yearPick")
        binding.itemExp.text = date
    }

    private fun getDateTimeCalendar() {
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
    }
}