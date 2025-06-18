package com.awesomeapp.module_3_246

sealed class State246_157 {
    data object Loading : State246_157()
    data class Success(val data: String) : State246_157()
    data class Error(val message: String) : State246_157()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}