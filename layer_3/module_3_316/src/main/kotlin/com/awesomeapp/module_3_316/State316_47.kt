package com.awesomeapp.module_3_316

sealed class State316_47 {
    data object Loading : State316_47()
    data class Success(val data: String) : State316_47()
    data class Error(val message: String) : State316_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}