package com.awesomeapp.module_2_174

sealed class State174_61 {
    data object Loading : State174_61()
    data class Success(val data: String) : State174_61()
    data class Error(val message: String) : State174_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}