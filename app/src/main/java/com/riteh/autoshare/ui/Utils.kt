package com.riteh.autoshare.ui

import android.app.Activity
import android.content.Intent
import android.view.View

/* generic function start activity*/
fun<A : Activity> Activity.startNewActivity(activity: Class<A>){
    Intent(this, activity).also{
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }
}


fun View.visible(isVisible: Boolean){
    visibility = if(isVisible) View.VISIBLE else View.GONE
}


fun View.enable(enabled: Boolean){
    isEnabled = enabled
    alpha = if(enabled) 1f else 0.5f
}

