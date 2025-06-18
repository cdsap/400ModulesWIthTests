package com.awesomeapp.module_2_174

sealed class State174_55 {
    data object Loading : State174_55()
    data class Success(val data: String) : State174_55()
    data class Error(val message: String) : State174_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}