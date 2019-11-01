package com.app.id.a5170411131_responsi1

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView

import com.app.id.a5170411131_responsi1.adapter.Adapter
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    val produk = arrayOf<String>("Apple", "Asus ROG", "MSI", "Acer Predator", "HP Omen", "Asus TUF", "AMD Ryzen", "Dell", "Alienware", "Samsung Odyddey")
    val deskripsi = arrayOf<String>(
        "Apple Merupakan produk terbaik no 1 di dunia",
        "ROG merupakan laptop gaming keluaran Asus",
        "MSI merupakan laptop gaming yang sangat familiar di kalangan para gamers",
        "Predator merupakan produk laptop gaming dari Acer",
        "Omen merupakan laptop gaming keluaran terbaru dari produk HP",
        "TUF merupakan laptop gaming ke dua dari Asus yang sebelumnya mengeluarakan gaming ROG",
        "AMD juga mengeluarkan produk laptop gaming. Yang mana AMD sebelumnya terkenal akan VGA.nya",
        "Dell mengeluarkan laptop gaming yang tidak kalah saing dengan lainnya",
        "Alienware merupakan laptop gaming yang sudah sangat familiar di dunia",
        "Samsung juga tidak mau kalah dengan lainnya. Samsung mengeluarkan produk laptop gaming terbaru yaitu Odyddey"
    )

    val imageId = arrayOf<Int>(
        R.drawable.apple,
        R.drawable.rog,
        R.drawable.msi,
        R.drawable.predator,
        R.drawable.omen,
        R.drawable.tuf,
        R.drawable.ryzen,
        R.drawable.dell,
        R.drawable.alienware,
        R.drawable.odyddey
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.title = "Home"

        val myListAdapter = Adapter(this,produk,deskripsi,imageId)
        lvProduct.adapter = myListAdapter

        lvProduct.setOnItemClickListener { parent, v, position, id ->
            if(position == 0){
                startActivity(Intent(this@Home, apple::class.java))
            }else if (position == 1){
                startActivity(Intent(this@Home, rog::class.java))
            }else if (position == 2){
                startActivity(Intent(this@Home, msi::class.java))
            }else if (position == 3){
                startActivity(Intent(this@Home, predator::class.java))
            }else if (position == 4){
                startActivity(Intent(this@Home, omen::class.java))
            }else if (position == 5){
                startActivity(Intent(this@Home, tuf::class.java))
            }else if (position == 6){
                startActivity(Intent(this@Home, ryzen::class.java))
            }else if (position == 7){
                startActivity(Intent(this@Home, dell::class.java))
            }else if (position == 8){
                startActivity(Intent(this@Home, alienware::class.java))
            }else if (position == 9){
                startActivity(Intent(this@Home, odyddey::class.java))
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(
            R.menu.biodata,
            menu
        )
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() == R.id.lihatBio) {
            startActivity(Intent(this@Home, Biodata::class.java))
            return true;
        }
        return super.onOptionsItemSelected(item)
    }
}
