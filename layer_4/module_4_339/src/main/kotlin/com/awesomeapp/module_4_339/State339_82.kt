package com.awesomeapp.module_4_339

sealed class State339_82 {
    data object Loading : State339_82()
    data class Success(val data: String) : State339_82()
    data class Error(val message: String) : State339_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}