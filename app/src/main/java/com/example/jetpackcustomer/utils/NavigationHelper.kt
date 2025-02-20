package com.example.jetpackcustomer.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import java.lang.ref.WeakReference

/**
 * val context = this // A strong reference to the Activity context
 * ----------------------------------------------------------------
 * Why use WeakReference<Context>?
 * In Android development, especially when dealing with UI elements like Activity or Context,
 * holding a strong reference to them for a long time (like in a singleton or global class)
 * can cause memory leaks because the garbage collector cannot clean up these objects if they are
 * still being referenced. If Context (or an Activity) is kept alive unnecessarily, it can lead to
 * increased memory usage, and eventually, an OutOfMemoryError can occur.
 * By using a WeakReference<Context>, you allow the Context (or Activity) to be garbage collected
 * when it's no longer needed, preventing potential memory leaks.
 * */

/**
 * ------intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK // Add this line------
 * The error is happening because you're trying to start an Activity from a non-Activity context
 * without adding the FLAG_ACTIVITY_NEW_TASK flag, which is required for Context objects that aren't
 * tied to an Activity. In cases where the Context comes from a non-Activity source (like an Application context),
 * Android requires the FLAG_ACTIVITY_NEW_TASK flag to be set on the Intent.
 *
 * To fix this, modify the Intent creation by adding FLAG_ACTIVITY_NEW_TASK in the navigateTo
 * */

object NavigationHelper {

    private var contextRef: WeakReference<Context>? = null

    // Initialize with an Activity or Context
    fun initialize(context: Context) {
        contextRef = WeakReference(context)
    }

    fun navigateTo(
        targetActivity: Class<*>,
        shouldFinish: Boolean = false,
        activity: Activity? = null,
        extras: (Intent.() -> Unit)? = null // Lambda for custom extras
    ) {
        contextRef?.get()?.let { context ->
            val intent = Intent(context, targetActivity)

            // Apply custom extras if provided
            extras?.invoke(intent)

            if (context !is Activity) {
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            context.startActivity(intent)

            // Finish the provided activity if shouldFinish is true
            if (shouldFinish) {
                activity?.finish()
            }
        }
    }
}

// Generic function to navigate to any target activity
/*fun navigateTo(context: Context, targetActivity: Class<*>) {
    val intent = Intent(context, targetActivity)
    context.startActivity(intent)
}*/

/*fun Context.navigateTo(targetActivity: Class<*>) {
    val intent = Intent(this, targetActivity)
    startActivity(intent)
}*/