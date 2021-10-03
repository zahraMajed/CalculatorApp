package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var tvDispaly:TextView
    //operations btns
    lateinit var btnEqule:Button
    lateinit var btnDivide:Button
    lateinit var btnMulty:Button
    lateinit var btnSub:Button
    lateinit var btnAdd:Button

    //numbers btns
    lateinit var btn0:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button

    //other btns
    lateinit var btnClear:Button
    lateinit var btnPlusMinus:Button
    lateinit var btnDel:Button
    lateinit var btnPoint:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //view model will handle math operation and all function and we well only take the text form it
        //declare the view model
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //initialize the display text and assign view model text to it
        tvDispaly=findViewById(R.id.tvDiaplay)
        tvDispaly.text=viewModel.displayText

        //initialize other components

        //make calculations
        btnEqule=findViewById(R.id.btnEqule)
        btnEqule.setOnClickListener(){viewModel.calculate(); tvDispaly.text=viewModel.displayText}
        //set op
        btnDivide=findViewById(R.id.btnDivide)
        btnDivide.setOnClickListener(){viewModel.setOp(btnDivide.text.toString());tvDispaly.text=viewModel.displayText }

        btnMulty=findViewById(R.id.btnMultyplay)
        btnMulty.setOnClickListener(){viewModel.setOp(btnMulty.text.toString());tvDispaly.text=viewModel.displayText }

        btnSub=findViewById(R.id.btnSub)
        btnSub.setOnClickListener(){viewModel.setOp(btnSub.text.toString());tvDispaly.text=viewModel.displayText }

        btnAdd=findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener(){viewModel.setOp(btnAdd.text.toString());tvDispaly.text=viewModel.displayText }

        //others
        btnClear=findViewById(R.id.btnClear)
        btnClear.setOnClickListener(){viewModel.clear();tvDispaly.text=viewModel.displayText }

        btnPlusMinus=findViewById(R.id.btnPlusMinus)
        btnPlusMinus.setOnClickListener(){viewModel.PlusMinus();tvDispaly.text=viewModel.displayText }

        btnDel=findViewById(R.id.btnDEL)
        btnDel.setOnClickListener(){viewModel.del();tvDispaly.text=viewModel.displayText }

        btnPoint=findViewById(R.id.btnPoint)
        btnPoint.setOnClickListener(){viewModel.point();tvDispaly.text=viewModel.displayText }

        //set numbers
        btn0=findViewById(R.id.btnZero)
        btn0.setOnClickListener(){viewModel.setNum(btn0.text.toString()); tvDispaly.text=viewModel.displayText}

        btn1=findViewById(R.id.btnOne)
        btn1.setOnClickListener(){viewModel.setNum(btn1.text.toString()); tvDispaly.text=viewModel.displayText}

        btn2=findViewById(R.id.btnTwo)
        btn2.setOnClickListener(){viewModel.setNum(btn2.text.toString()); tvDispaly.text=viewModel.displayText}

        btn3=findViewById(R.id.btnThree)
        btn3.setOnClickListener(){viewModel.setNum(btn3.text.toString()); tvDispaly.text=viewModel.displayText}

        btn4=findViewById(R.id.btnFour)
        btn4.setOnClickListener(){viewModel.setNum(btn4.text.toString()); tvDispaly.text=viewModel.displayText}

        btn5=findViewById(R.id.btnFive)
        btn5.setOnClickListener(){viewModel.setNum(btn5.text.toString()); tvDispaly.text=viewModel.displayText}

        btn6=findViewById(R.id.btnSex)
        btn6.setOnClickListener(){viewModel.setNum(btn6.text.toString()); tvDispaly.text=viewModel.displayText}

        btn7=findViewById(R.id.btnSeven)
        btn7.setOnClickListener(){viewModel.setNum(btn7.text.toString()); tvDispaly.text=viewModel.displayText}

        btn8=findViewById(R.id.btnEight)
        btn8.setOnClickListener(){viewModel.setNum(btn8.text.toString()); tvDispaly.text=viewModel.displayText}

        btn9=findViewById(R.id.btnNine)
        btn9.setOnClickListener(){viewModel.setNum(btn9.text.toString()); tvDispaly.text=viewModel.displayText}

    }
}


