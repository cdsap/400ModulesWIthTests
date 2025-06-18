package com.awesomeapp.module_2_205

sealed class State205_94 {
    data object Loading : State205_94()
    data class Success(val data: String) : State205_94()
    data class Error(val message: String) : State205_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}