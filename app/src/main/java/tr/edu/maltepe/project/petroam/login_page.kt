package tr.edu.maltepe.project.petroam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val button: Button = findViewById(R.id.registerbutton)
        button.setOnClickListener {
            val intent = Intent(this, register_page::class.java)
            startActivity(intent)
        }



    }
}