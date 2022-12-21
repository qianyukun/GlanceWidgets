package com.qyk.compose.widget.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.action.ActionParameters
import androidx.glance.action.actionParametersOf
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetManager
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import com.qyk.compose.widget.ui.theme.ComposeWidgetTheme

class ActionsWidget : GlanceAppWidget() {
    @Composable
    override fun Content() {
        Button(
            text = "Log on a click event",
            onClick = actionRunCallback<LogActionCallback>(
                parameters = actionParametersOf(
                    actionWidgetKey to "log event"
                )
            )
        )
    }
}

class LogActionCallback : ActionCallback {

    override suspend fun onAction(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        android.util.Log.e("GLANCE","Item with id $glanceId and params $parameters clicked.")

    }
}

val actionWidgetKey = ActionParameters.Key<String>("action-widget-key")