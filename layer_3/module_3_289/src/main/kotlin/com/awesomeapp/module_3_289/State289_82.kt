package com.awesomeapp.module_3_289

sealed class State289_82 {
    data object Loading : State289_82()
    data class Success(val data: String) : State289_82()
    data class Error(val message: String) : State289_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}