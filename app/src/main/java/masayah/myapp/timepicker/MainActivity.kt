package masayah.myapp.timepicker

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.time_picker_actions)
        img.setOnClickListener {
            // ドラムロール式DatePickerを呼び出す
            val eText = findViewById<View>(R.id.time) as EditText
            MyTimePicker.showTimePicker(eText)
        }
    }
}