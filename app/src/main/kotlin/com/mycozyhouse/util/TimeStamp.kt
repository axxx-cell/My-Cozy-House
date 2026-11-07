package com.mycozyhouse.util

import android.os.SystemClock

object GameTime {
    fun nowMs(): Long = SystemClock.elapsedRealtime()
}
