package com.awesomeapp.module_0_34

sealed class State34_82 {
    data object Loading : State34_82()
    data class Success(val data: String) : State34_82()
    data class Error(val message: String) : State34_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}