package com.awesomeapp.module_3_309

sealed class State309_4 {
    data object Loading : State309_4()
    data class Success(val data: String) : State309_4()
    data class Error(val message: String) : State309_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}