package com.awesomeapp.module_0_58

sealed class State58_82 {
    data object Loading : State58_82()
    data class Success(val data: String) : State58_82()
    data class Error(val message: String) : State58_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}