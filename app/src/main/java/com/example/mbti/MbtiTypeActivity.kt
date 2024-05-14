package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mbti.ui.theme.MbtiTheme

class MbtiTypeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .background(color = Color.LightGray)
                ) {

                    IsfjText()
                    Divider(thickness = 4.dp, modifier = Modifier.fillMaxWidth())

                    EntpText()
                    Divider(thickness = 4.dp, modifier = Modifier.fillMaxWidth())

                    val context = LocalContext.current as? Activity
                    TextButton(onClick = {
                        val intent = Intent(context, MbtiSelectActivity::class.java)
                        context?.finish()
                    }) {
                        Text(text = "둘 다 아니면 터치")
                    }

                    Button(onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "메인으로 가기")
                    }
                }
            }
        }
    }

    @Composable
    fun IsfjText() {
        val context = LocalContext.current as? Activity
        Image(
            painter = painterResource(id = R.drawable.mbti),
            contentDescription = "isfj",
            Modifier
                .padding(0.dp, 50.dp)
                .size(width = 300.dp, height = 150.dp)
        )

        Text(
            text = "ISTJ는 신뢰할 수 있고 책임감이 강한 유형이다." +
                    "이들은 자신의 의무와 책임을 매우 중요하게 생각하며, " +
                    "일을 철저히 완료하기 위해 노력한다. 이들은 현실적이고 논리적으로 생각하며, " +
                    "구체적인 사실과 정보에 기반하여 결정을 내린다."
        )

        Button(onClick = {
            val intent = Intent(context, MbtiSelectActivity::class.java)
            context?.finish()
        }) {
            Text(text = "뒤로 가기")
        }
    }

    @Composable
    fun EntpText() {
        val context = LocalContext.current as? Activity

        Image(
            painter = painterResource(id = R.drawable.mbti3),
            contentDescription = "entp",
            Modifier
                .padding(0.dp, 50.dp)
                .size(width = 300.dp, height = 150.dp)
        )
        Text(
            text = "ENTP는 창의적이고 지적 호기심이 많은 사람들이다." +
                    "이들은 새로운 아이디어나 접근법을 고안하는 것을 좋아하며," +
                    "다양한 관점과 가능성을 탐구한다. 유연하며 적응력이 뛰어나," +
                    "변화와 도전을 두려워하지 않는다."
        )

        Button(onClick = {
            val intent = Intent(context, MbtiSelectActivity::class.java)
            context?.finish()
        }) {
            Text(text = "뒤로 가기")
        }
    }
}