package com.awesomeapp.module_2_203

sealed class State203_169 {
    data object Loading : State203_169()
    data class Success(val data: String) : State203_169()
    data class Error(val message: String) : State203_169()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}