package co.styxproject.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class Widget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        if (appWidgetIds != null) {
            for (appWidgetId in appWidgetIds) {
                if (appWidgetManager != null) {
                    updateAppWidget(context, appWidgetManager, appWidgetId)
                }
            }
        }
    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    val views = RemoteViews(context.packageName, R.layout.widget)
    appWidgetManager.updateAppWidget(appWidgetId, views)
}