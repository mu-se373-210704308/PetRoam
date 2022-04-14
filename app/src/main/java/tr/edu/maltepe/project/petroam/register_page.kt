package tr.edu.maltepe.project.petroam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        // login ekranına geri döndüren back to login butonu.
        val button: Button = findViewById(R.id.backtologinpagebutton)
        button.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }


    }
}