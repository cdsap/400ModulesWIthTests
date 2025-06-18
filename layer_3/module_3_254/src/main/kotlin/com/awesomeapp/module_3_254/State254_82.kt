package com.awesomeapp.module_3_254

sealed class State254_82 {
    data object Loading : State254_82()
    data class Success(val data: String) : State254_82()
    data class Error(val message: String) : State254_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}