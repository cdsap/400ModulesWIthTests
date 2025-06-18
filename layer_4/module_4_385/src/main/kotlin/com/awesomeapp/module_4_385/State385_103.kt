package com.awesomeapp.module_4_385

sealed class State385_103 {
    data object Loading : State385_103()
    data class Success(val data: String) : State385_103()
    data class Error(val message: String) : State385_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}