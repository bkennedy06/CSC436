package com.zybooks.graduationrsvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zybooks.graduationrsvp.ui.theme.GraduationRSVPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraduationRSVPTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GradScreen()
                }
            }
        }
    }
}

@Composable
fun GradScreen(modifier: Modifier = Modifier) {
    Image( // this works like layers. Image drawn first
        painter = painterResource(R.drawable.grad_cap),
        contentDescription = "Graduation cap",
        alpha = 0.3f
    )
    Text( // then text gets drawn
        text = stringResource(R.string.graduation_announcement),
        textAlign = TextAlign.Center,
        lineHeight = 50.sp,
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp,
        color = Color.Red,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GradPreview() {
    GraduationRSVPTheme {
        GradScreen()
    }
}