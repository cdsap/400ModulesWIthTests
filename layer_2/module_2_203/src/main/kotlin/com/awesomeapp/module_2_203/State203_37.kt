package com.awesomeapp.module_2_203

sealed class State203_37 {
    data object Loading : State203_37()
    data class Success(val data: String) : State203_37()
    data class Error(val message: String) : State203_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}