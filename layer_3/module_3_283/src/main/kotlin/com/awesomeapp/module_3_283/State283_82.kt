package com.awesomeapp.module_3_283

sealed class State283_82 {
    data object Loading : State283_82()
    data class Success(val data: String) : State283_82()
    data class Error(val message: String) : State283_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}