package com.awesomeapp.module_2_238

sealed class State238_82 {
    data object Loading : State238_82()
    data class Success(val data: String) : State238_82()
    data class Error(val message: String) : State238_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}