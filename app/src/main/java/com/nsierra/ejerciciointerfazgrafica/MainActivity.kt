package com.nsierra.ejerciciointerfazgrafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val botonCalcular:Button=findViewById(R.id.btnPresioname)
        botonCalcular.setOnClickListener { realizarCalculo() }
    }

    private fun realizarCalculo() {
        val campoTexto:EditText= findViewById(R.id.editTextComponentes)
        var text = campoTexto.text.toString()

        val radioButton:RadioGroup= findViewById(R.id.radioGroup)
        val radio: Int =radioButton.checkedRadioButtonId
        val selectRadioButton:RadioButton=findViewById(radio)
        val textRadioG: String = selectRadioButton.text.toString()

        val checkBox1: CheckBox= findViewById(R.id.checkBox)
        var check1 = checkBox1.isChecked

        val checkBox2: CheckBox= findViewById(R.id.checkBox2)
        var check2 = checkBox2.isChecked

        val ToggleButton: ToggleButton = findViewById(R.id.toggleButton)
        val estado: Boolean = ToggleButton.isChecked

        val switchButton: Switch = findViewById(R.id.switch1)
        val estadoSwitch: Boolean = switchButton.isChecked



        Toast.makeText(this,"$text, $textRadioG, $check1, $check2, $estadoSwitch",Toast.LENGTH_LONG).show()
   }
}