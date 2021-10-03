package com.example.calculatorapp

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import java.lang.Exception
class MainViewModel: ViewModel() {

    var num1=""
    var num2=""
    var result=0.0
    var operation=""
    var displayText="0"

    fun setNum(num:String){
        if (operation.equals("")){
            num1 += num
            displayText = num1
        }else
        {
            num2 += num
            displayText = num1 + operation + num2
        }
    } //end setNum()


    //when user click /,*,- or +
    fun setOp (op: String){
        operation = op
        displayText = num1 + operation
    }//end setOp

    //when user click =
    fun calculate(){
            when (operation) {
                "/" -> divide()
                "*" -> multyply()
                "-" -> sub()
                "+" -> add()
            }
    }//end calculate()

    fun add(){
        result=num1.toDouble() + num2.toDouble()
        displayText=result.toString()
    }
    fun sub(){
        result=num1.toDouble() - num2.toDouble()
        displayText=result.toString()
    }
    fun multyply(){
        result=num1.toDouble() * num2.toDouble()
        displayText=result.toString()
    }
    fun divide (){
        try {
            result=num1.toDouble() / num2.toDouble()
            displayText=result.toString()
        }catch (e:Exception){
            displayText="Error.. you divide by zero"
        }
    }///////////


    fun clear (){
        displayText="0"
        num2=""
        num1=""
        result=0.0
        operation=""
    }//end clear

    fun PlusMinus(){
        if (operation.equals("")){
             if (num1.startsWith("-")){
               num1= num1.substring(1,num1.length)
                 displayText=num1
            }else {
                 num1 = "-$num1"
                 displayText=num1
             }
        } else
        {
            if (num2.startsWith("-")){
                num2= num2.substring(1,num2.length)
                displayText=num2
            }else{
                num2="-$num2"
                displayText=num2
            }
        }
    }//end plusMinus

    fun del (){
        if (operation.equals("")){
            if (num1.isNotEmpty()){
                num1=num1.substring(0, num1.length-1)
                if (num1.isEmpty()){
                    displayText="0"
                }else
                    displayText=num1
            }
        }else{
            if (num2.isNotEmpty()){
                num2=num2.substring(0, num2.length-1)
                if (num2.isEmpty()){
                    displayText="0"
                }else
                    displayText=num1+ operation + num2
            }
        }
    }//end del

    fun point(){
        if (operation.equals("")&&!num1.contains(".")){
            setNum(".")
        }else if (!operation.equals("")&&!num2.contains(".")) {
            setNum(".")
        }
    }//end point()

}//end class