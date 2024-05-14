package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MbtiTheme

class MbtiSelectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Column {
                    val context = LocalContext.current as? Activity

                    Button(onClick = {
                        val intent = Intent(context, MbtiTypeActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "ISFJ")
                    }

                    Button(onClick = {
                        val intent = Intent(context, MbtiTypeActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "ENTP")
                    }

                    Button(onClick = {
                        val intent = Intent(context, MbtiTypeActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "둘다 아님")
                    }

                    Button(onClick = {
                        context?.finish()
                    }) {
                        Text(text = "뒤로가기")
                    }
                }

            }
        }
    }
}