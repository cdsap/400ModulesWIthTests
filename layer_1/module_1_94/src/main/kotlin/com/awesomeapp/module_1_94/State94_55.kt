package com.awesomeapp.module_1_94

sealed class State94_55 {
    data object Loading : State94_55()
    data class Success(val data: String) : State94_55()
    data class Error(val message: String) : State94_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}