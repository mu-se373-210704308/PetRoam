package tr.edu.maltepe.project.petroam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.startedbutton)
        button.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }


    }
}