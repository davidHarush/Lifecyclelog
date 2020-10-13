package com.david.haru.lifecyclelogsample.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.david.haru.lifecyclelog.LifecycleLog
import com.david.haru.lifecyclelogsample.BuildConfig

/**
 * Created by David Harush
 * On 13/10/2020.
 */
open class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifecycleLog(lifecycle = lifecycle, isDebug = BuildConfig.DEBUG, level = LifecycleLog.LEVEL_INFO)

    }
}