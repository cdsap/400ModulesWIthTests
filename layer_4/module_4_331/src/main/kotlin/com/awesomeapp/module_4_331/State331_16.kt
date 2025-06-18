package com.awesomeapp.module_4_331

sealed class State331_16 {
    data object Loading : State331_16()
    data class Success(val data: String) : State331_16()
    data class Error(val message: String) : State331_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}