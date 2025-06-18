package com.awesomeapp.module_0_48

sealed class State48_47 {
    data object Loading : State48_47()
    data class Success(val data: String) : State48_47()
    data class Error(val message: String) : State48_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}