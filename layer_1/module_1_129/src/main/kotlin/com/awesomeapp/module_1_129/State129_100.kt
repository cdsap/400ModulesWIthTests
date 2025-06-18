package com.awesomeapp.module_1_129

sealed class State129_100 {
    data object Loading : State129_100()
    data class Success(val data: String) : State129_100()
    data class Error(val message: String) : State129_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}