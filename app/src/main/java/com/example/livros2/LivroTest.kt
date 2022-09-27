package com.example.livros2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.livros2.Vari

class LivroTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livro_test)
        var lerlivro = findViewById<Button>(R.id.lerlivro)
        lerlivro.setOnClickListener {
            irParaWebView()
        }
        var livro2 = Vari(pdf = "https://www.unifucamp.edu.br/wp-content/uploads/2020/09/Livros-gra%CC%81tis.pdf")


    }

    private fun irParaWebView(){
        val intent = Intent(this@LivroTest, MainActivity::class.java)
        startActivity(intent)


    }


}




