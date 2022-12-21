package com.qyk.compose.widget

import androidx.glance.appwidget.GlanceAppWidget
import com.qyk.compose.widget.widget.ActionsWidget
import com.qyk.compose.widget.widget.HelloWorldWidget
import com.qyk.compose.widget.widget.ImageWidget
import com.qyk.compose.widget.widget.ListWidget

object WidgetManager {
    private val widgets: List<GlanceAppWidget> =
        arrayListOf(ImageWidget(), ListWidget(), ActionsWidget(), HelloWorldWidget())

    val currentWidget: GlanceAppWidget = widgets[0]
}