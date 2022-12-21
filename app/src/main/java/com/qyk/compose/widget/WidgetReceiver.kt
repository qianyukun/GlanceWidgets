package com.qyk.compose.widget

import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import com.qyk.compose.widget.WidgetManager.currentWidget

class WidgetReceiver : GlanceAppWidgetReceiver() {

    override val glanceAppWidget: GlanceAppWidget
        get() = currentWidget

    override fun onAppWidgetOptionsChanged(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetId: Int,
        newOptions: Bundle
    ) {
        android.util.Log.e("Glance", "onAppWidgetOptionsChanged $appWidgetId $newOptions")
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions)
    }

    override fun onDeleted(context: Context, appWidgetIds: IntArray) {
        android.util.Log.e("Glance", "onDeleted ${appWidgetIds[0]}")
        super.onDeleted(context, appWidgetIds)
    }

    override fun onDisabled(context: Context?) {
        android.util.Log.e("Glance", "onDisabled")
        super.onDisabled(context)
    }

    override fun onEnabled(context: Context?) {
        android.util.Log.e("Glance", "onEnabled")
        super.onEnabled(context)
    }

    override fun onReceive(context: Context, intent: Intent) {
        android.util.Log.e("Glance", "onReceive $intent")
        super.onReceive(context, intent)
    }

    override fun onRestored(context: Context?, oldWidgetIds: IntArray?, newWidgetIds: IntArray?) {
        android.util.Log.e("Glance", "onRestored $oldWidgetIds $newWidgetIds")
        super.onRestored(context, oldWidgetIds, newWidgetIds)
    }

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        android.util.Log.e("Glance", "onUpdate $appWidgetManager $appWidgetIds")
        super.onUpdate(context, appWidgetManager, appWidgetIds)
    }
}