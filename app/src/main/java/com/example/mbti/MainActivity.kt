package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                MainScreen()
            }

        }
    }

    @Composable
    fun MainScreen() {
        val context = LocalContext.current
        Button(onClick = {
            val intent = Intent(context, MbtiSelectActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "나의 MBTI는 무엇인가요?")
        }
    }
}