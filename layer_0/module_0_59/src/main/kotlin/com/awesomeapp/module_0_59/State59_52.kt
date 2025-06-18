package com.awesomeapp.module_0_59

sealed class State59_52 {
    data object Loading : State59_52()
    data class Success(val data: String) : State59_52()
    data class Error(val message: String) : State59_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}