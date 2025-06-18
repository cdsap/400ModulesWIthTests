package com.awesomeapp.module_3_302

sealed class State302_118 {
    data object Loading : State302_118()
    data class Success(val data: String) : State302_118()
    data class Error(val message: String) : State302_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}