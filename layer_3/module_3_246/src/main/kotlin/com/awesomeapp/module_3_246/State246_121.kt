package com.awesomeapp.module_3_246

sealed class State246_121 {
    data object Loading : State246_121()
    data class Success(val data: String) : State246_121()
    data class Error(val message: String) : State246_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}