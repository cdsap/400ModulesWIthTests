package com.awesomeapp.module_4_357

sealed class State357_82 {
    data object Loading : State357_82()
    data class Success(val data: String) : State357_82()
    data class Error(val message: String) : State357_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}