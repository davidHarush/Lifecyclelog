package com.david.haru.lifecyclelog

import android.util.Log
import androidx.annotation.IntRange
import androidx.annotation.NonNull
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

/**
 *  Created by David Harush
 *  On 26/08/2020.
 *  log Lifecycle
 */
class LifecycleLog(
    @NonNull lifecycle: Lifecycle,
    isDebug: Boolean = true,
    @IntRange(from = 2, to = 7) private var level: Int = LEVEL_INFO
) :
    LifecycleObserver {

    companion object {
        private val TAG = LifecycleLog::class.java.simpleName

        public const val LEVEL_INFO = Log.INFO
        public const val LEVEL_VERBOSE = Log.VERBOSE
        public const val LEVEL_DEBUG = Log.DEBUG

    }

    private val line = "____"

    init {
        if (isDebug) {
            lifecycle.addObserver(this)
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun logOnResume(owner: LifecycleOwner) {
        val msg = "$line ${owner.javaClass.simpleName} onResume $line"
        Log.println(level, TAG, msg)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun logOnPause(owner: LifecycleOwner) {
        val msg = "$line ${owner.javaClass.simpleName} OnPause $line"
        Log.println(level, TAG, msg)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun logOnStop(owner: LifecycleOwner) {
        val msg = "$line ${owner.javaClass.simpleName} OnStop $line"
        Log.println(level, TAG, msg)
    }


}