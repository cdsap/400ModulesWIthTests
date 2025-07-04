package com.awesomeapp.module_5_401

sealed class State401_82 {
    data object Loading : State401_82()
    data class Success(val data: String) : State401_82()
    data class Error(val message: String) : State401_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}