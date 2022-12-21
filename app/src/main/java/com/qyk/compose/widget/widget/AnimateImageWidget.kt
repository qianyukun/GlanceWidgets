package com.qyk.compose.widget.widget

import androidx.compose.runtime.Composable
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.appwidget.GlanceAppWidget
import com.qyk.compose.widget.R

class AnimateImageWidget : GlanceAppWidget() {
    var resId = R.drawable.ic_launcher_foreground

    @Composable
    override fun Content() {
        Image(provider = ImageProvider(resId = resId), contentDescription = "")
    }
}