package com.app.id.a5170411131_responsi1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("Registered")
class msi : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_product2)


        val img = findViewById(R.id.imgHeader) as ImageView
        val header = findViewById(R.id.tvHeader) as TextView
        val deskripsi = findViewById(R.id.tvDeskripsi_detail) as TextView

        header.setText("MSI")
        deskripsi.setText("MSI merupakan laptop gaming yang sangat familiar di kalangan para gamers. Laptop ini berasal dari Asia tepatnya di Taiwan")
        img.setImageResource(R.drawable.msi)
    }
}