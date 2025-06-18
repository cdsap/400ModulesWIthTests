package com.awesomeapp.module_2_237

sealed class State237_94 {
    data object Loading : State237_94()
    data class Success(val data: String) : State237_94()
    data class Error(val message: String) : State237_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}