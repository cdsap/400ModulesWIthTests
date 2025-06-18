package com.awesomeapp.module_2_211

sealed class State211_130 {
    data object Loading : State211_130()
    data class Success(val data: String) : State211_130()
    data class Error(val message: String) : State211_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}