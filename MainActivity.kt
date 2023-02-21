package com.example.bai7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtImportA = findViewById<EditText>(R.id.edtImportA)
        val edtImportB = findViewById<EditText>(R.id.edtImportB)
        val edtKq = findViewById<EditText>(R.id.edtKq)
        val btnSum = findViewById<Button>(R.id.btnSum)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnCore = findViewById<Button>(R.id.btnCore)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

//        set text cho importA
        btnSum.setOnClickListener {
            val a = edtImportA.text.toString().toInt()
            val b = edtImportB.text.toString().toInt()
            val kq = a + b
            edtKq.setText(kq.toString())
        }
        btnReset.setOnClickListener {
           edtImportA.setText("")
            edtImportB.setText("")
            edtKq.setText("")
//            Thông báo nhanh trên màn hình
            Toast.makeText(this,"Đã xóa",Toast.LENGTH_SHORT).show()
        }
//        var suKienChiaSe:View.OnClickListener? = null
//        suKienChiaSe = View.OnClickListener {
//            if(it==btnCore){
//                val a = edtImportA.text.toString().toInt()
//                val b = edtImportB.text.toString().toInt()
//                val kq = a * b
//                edtKq.setText(kq.toString())
//            }else if(it==btnDivide){
//                val a = edtImportA.text.toString().toDouble()
//                val b = edtImportB.text.toString().toDouble()
//                val kq = a / b
//                edtKq.setText(kq.toString())
//            }
//        }
//        btnCore.setOnClickListener(suKienChiaSe)
//        btnDivide.setOnClickListener(suKienChiaSe)
        btnCore.setOnClickListener {
            val a = edtImportA.text.toString().toInt()
            val b = edtImportB.text.toString().toInt()
            val kq = a * b
            edtKq.setText(kq.toString())
        }
        btnDivide.setOnClickListener {
            val a = edtImportA.text.toString().toDouble()
            val b = edtImportB.text.toString().toDouble()
            val kq = a / b
            edtKq.setText(kq.toString())
        }
    }
}