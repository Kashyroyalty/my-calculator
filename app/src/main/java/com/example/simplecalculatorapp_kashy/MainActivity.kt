package com.example.simplecalculatorapp_kashy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtapp:TextView
    private lateinit var txtdisplay:TextView
    private lateinit var edtfirstnumber:EditText
    private lateinit var edtsecondnumber:EditText
    private lateinit var btnadd:Button
    private lateinit var btnmultiply:Button
    private lateinit var btnsubtraction:Button
    private lateinit var btndivision:Button


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        //instantiate your variables
        txtdisplay = findViewById(R.id.txtdisplay)
        edtfirstnumber = findViewById(R.id.edtfirstnumber)
        edtsecondnumber = findViewById(R.id.edtsecondnumber)
        btnadd = findViewById(R.id.btnadd)
        btnmultiply = findViewById(R.id.btn_multiply)
        btnsubtraction = findViewById(R.id.btnsubtraction)
        btndivision = findViewById(R.id.btndivision)




        btnadd.setOnClickListener {

            var first_num = edtfirstnumber.text.toString().trim() //50
            var second_num = edtsecondnumber.text.toString().trim() //20

            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter valid number", Toast.LENGTH_SHORT).show()
            } else {
                //means has some data
                var result = first_num.toDouble() + second_num.toDouble()
                txtdisplay.text = result.toString()
            }
        }

                btnmultiply.setOnClickListener {

                    var first_num = edtfirstnumber.text.toString().trim() //50
                    var second_num = edtsecondnumber.text.toString().trim() //20

                    //validation of edit text
                    if (first_num.isEmpty() || second_num.isEmpty()){
                        Toast.makeText(this, "Please enter valid number", Toast.LENGTH_SHORT).show()
                    }  else{
                        //means has some data
                        var result = first_num.toDouble() * second_num.toDouble()
                        txtdisplay.text = result.toString()


    }

    }


            btnsubtraction.setOnClickListener {

                var first_num = edtfirstnumber.text.toString().trim() //50
                var second_num = edtsecondnumber.text.toString().trim() //20

                //validation of edit text
                if (first_num.isEmpty() || second_num.isEmpty()){
                    Toast.makeText(this, "Please enter valid number", Toast.LENGTH_SHORT).show()
                }  else{
                    //means has some data
                    var result = first_num.toDouble() - second_num.toDouble()
                    txtdisplay.text = result.toString()


                }

            }


            btndivision.setOnClickListener {

                var first_num = edtfirstnumber.text.toString().trim() //50
                var second_num = edtsecondnumber.text.toString().trim() //20

                //validation of edit text
                if (first_num.isEmpty() || second_num.isEmpty()){
                    Toast.makeText(this, "Please enter valid number", Toast.LENGTH_SHORT).show()
                }  else{
                    //means has some data
                    var result = first_num.toDouble() / second_num.toDouble()
                    txtdisplay.text = result.toString()


                }

            }


    }
}