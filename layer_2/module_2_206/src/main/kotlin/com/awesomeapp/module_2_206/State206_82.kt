package com.awesomeapp.module_2_206

sealed class State206_82 {
    data object Loading : State206_82()
    data class Success(val data: String) : State206_82()
    data class Error(val message: String) : State206_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}