package com.awesomeapp.module_2_192

sealed class State192_4 {
    data object Loading : State192_4()
    data class Success(val data: String) : State192_4()
    data class Error(val message: String) : State192_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}