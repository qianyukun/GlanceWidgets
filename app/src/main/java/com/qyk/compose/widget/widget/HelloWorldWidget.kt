package com.qyk.compose.widget.widget

import androidx.compose.runtime.Composable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.text.Text

class HelloWorldWidget : GlanceAppWidget() {
    @Composable
    override fun Content() {
        Text(text = "Hello World")
    }
}