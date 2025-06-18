package com.awesomeapp.module_0_63

sealed class State63_4 {
    data object Loading : State63_4()
    data class Success(val data: String) : State63_4()
    data class Error(val message: String) : State63_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}