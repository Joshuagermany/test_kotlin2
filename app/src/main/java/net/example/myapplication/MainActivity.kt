package net.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intArr:IntArray = IntArray(10)

        //컬랙션
        var list = mutableListOf<Int>(10)
        list.add(2)
        list.add(9)
        Log.d("테스트","${list.get(2)}")
        val button : Button = findViewById(R.id.buttonLog)
            button.setOnClickListener{
                Log.d("TAG", "버튼이 눌러짐")
            }
    }
}