package com.awesomeapp.module_2_230

sealed class State230_55 {
    data object Loading : State230_55()
    data class Success(val data: String) : State230_55()
    data class Error(val message: String) : State230_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}