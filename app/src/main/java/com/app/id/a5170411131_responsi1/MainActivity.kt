package com.app.id.a5170411131_responsi1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.register.view.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Login"

        btnLogin.setOnClickListener {
            val u = user.getUsername
            val p = user.getPassword
            Log.d("user ", u.toString())
            Log.d("pass ", p.toString())

            if((txtUsernameValidation.text.toString().equals(u)) && (txtPasswordValidation.text.toString().equals(p))){
                startActivity(Intent(this@MainActivity, Home::class.java))
            }else{
                Toast.makeText(this,"Username atau Password Salah!", Toast.LENGTH_LONG).show()
            }

        }

        btnDaftar.setOnClickListener {
            popup()
        }
    }

    fun popup(){
        val builder = AlertDialog.Builder(this@MainActivity)
        val inflater = this@MainActivity.layoutInflater
        val view = inflater.inflate(R.layout.register, null)
        builder.setTitle("Registrasi")

        var userr = view.findViewById<EditText>(R.id.txtUsername)
        var pass = view.findViewById<EditText>(R.id.txtPassword)
        var jk: Int = view.rg1.checkedRadioButtonId
        var almt = view.findViewById<EditText>(R.id.txtAlamat)

        builder.setPositiveButton("Daftar"){dialog, which ->
            Log.d("user ", userr.text.toString())
            Log.d("pass ", pass.text.toString())
            Log.d("jk ", jk.toString())
            Log.d("alamat ", almt.text.toString())
            var username = user.setUsername(userr.text.toString())
            var password = user.setPassword(pass.text.toString())
            var jenis_kelamin = user.setJenisKel(jk.toString())
            var alamat = user.setAlamat(almt.text.toString())
        }

        builder.setNegativeButton("Batal"){dialog, which ->
            dialog.dismiss()
        }

        builder.setCancelable(false)
        builder.setView(view)
        val al = builder.create()
        al.show()
    }
}
