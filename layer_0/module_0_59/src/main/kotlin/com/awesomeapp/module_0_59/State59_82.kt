package com.awesomeapp.module_0_59

sealed class State59_82 {
    data object Loading : State59_82()
    data class Success(val data: String) : State59_82()
    data class Error(val message: String) : State59_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}