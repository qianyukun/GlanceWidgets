package com.qyk.compose.widget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.glance.appwidget.GlanceAppWidgetManager
import com.qyk.compose.widget.ui.theme.ComposeWidgetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWidgetTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val context = LocalContext.current
    Text(text = "Hello $name!", modifier = Modifier.clickable {
        val glanceAppWidgetManager = GlanceAppWidgetManager(context)
        val requestPinGlanceAppWidget = glanceAppWidgetManager.requestPinGlanceAppWidget(
            WidgetReceiver::class.java,
            WidgetManager.currentWidget
        )
        android.util.Log.e("Glance","requestPinGlanceAppWidget $requestPinGlanceAppWidget")
    })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeWidgetTheme {
        Greeting("Android")
    }
}