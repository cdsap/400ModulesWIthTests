package com.awesomeapp.module_2_181

sealed class State181_82 {
    data object Loading : State181_82()
    data class Success(val data: String) : State181_82()
    data class Error(val message: String) : State181_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}