package com.awesomeapp.module_1_129

sealed class State129_82 {
    data object Loading : State129_82()
    data class Success(val data: String) : State129_82()
    data class Error(val message: String) : State129_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}