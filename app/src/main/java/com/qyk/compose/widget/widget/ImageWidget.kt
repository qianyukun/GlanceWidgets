package com.qyk.compose.widget.widget

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.background
import androidx.glance.layout.ContentScale
import androidx.glance.layout.fillMaxSize
import androidx.glance.unit.ColorProvider
import com.qyk.compose.widget.R

class ImageWidget : GlanceAppWidget() {

    @Composable
    override fun Content() {
        Image(
            modifier = GlanceModifier.fillMaxSize().background(ColorProvider(Color.Cyan)),
            provider = ImageProvider(resId = R.drawable.ic_hello_world),
            contentScale = ContentScale.Fit,
            contentDescription = ""
        )
    }
}