package com.qyk.compose.widget.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.ActionParameters
import androidx.glance.action.actionParametersOf
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.lazy.LazyColumn
import androidx.glance.appwidget.lazy.items
import androidx.glance.background
import androidx.glance.layout.padding
import androidx.glance.text.*
import androidx.glance.unit.ColorProvider

class ListWidget : GlanceAppWidget() {
    private val list = arrayListOf("Java", "Kotlin", "Python", "C++", "C", "Object C")

    @Composable
    override fun Content() {
        LazyColumn(modifier = GlanceModifier.padding(8.dp).background(Color.White)) {
            items(list) {
                Text(
                    text = it,
                    modifier = GlanceModifier.padding(10.dp).clickable(
                        onClick = actionRunCallback<ListClickActionCallback>(
                            parameters = actionParametersOf(
                                language to it,
                                languageIndex to it
                            )
                        )
                    ),
                    style = TextStyle(
                        color = ColorProvider(Color.Black),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }
        }
    }
}

class ListClickActionCallback : ActionCallback {
    override suspend fun onAction(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        android.util.Log.e("Glance", "ListClickActionCallback $context $glanceId $parameters")
    }
}

val language = ActionParameters.Key<String>("language")
val languageIndex = ActionParameters.Key<String>("languageIndex")