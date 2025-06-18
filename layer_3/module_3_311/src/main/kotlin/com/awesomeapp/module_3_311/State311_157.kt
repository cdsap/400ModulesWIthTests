package com.awesomeapp.module_3_311

sealed class State311_157 {
    data object Loading : State311_157()
    data class Success(val data: String) : State311_157()
    data class Error(val message: String) : State311_157()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}