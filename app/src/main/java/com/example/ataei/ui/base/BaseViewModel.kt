package com.example.ataei.ui.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import com.example.ataei.util.livedata.ActivityActionLiveData
import com.example.ataei.util.livedata.FragmentActionLiveData

/**
 * All of ViewModels should be inherited from [BaseViewModel]
 */

abstract class BaseViewModel() : ViewModel(), LifecycleObserver {

    val activityAction = ActivityActionLiveData()
    val fragmentAction = FragmentActionLiveData()

    /**
     * We can use lifeCycle in inherited classes if we need
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    open fun onStart() {}

    /**
     * We can use lifeCycle in inherited classes if we need
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    open fun onStop() {}
}