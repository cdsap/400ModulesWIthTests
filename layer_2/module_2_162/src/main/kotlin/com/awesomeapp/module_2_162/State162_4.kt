package com.awesomeapp.module_2_162

sealed class State162_4 {
    data object Loading : State162_4()
    data class Success(val data: String) : State162_4()
    data class Error(val message: String) : State162_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}