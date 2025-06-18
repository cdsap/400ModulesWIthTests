package com.awesomeapp.module_4_364

sealed class State364_4 {
    data object Loading : State364_4()
    data class Success(val data: String) : State364_4()
    data class Error(val message: String) : State364_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}