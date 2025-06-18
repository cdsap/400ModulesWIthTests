package com.awesomeapp.module_3_248

sealed class State248_80 {
    data object Loading : State248_80()
    data class Success(val data: String) : State248_80()
    data class Error(val message: String) : State248_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}