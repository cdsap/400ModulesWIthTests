package com.awesomeapp.module_1_124

sealed class State124_8 {
    data object Loading : State124_8()
    data class Success(val data: String) : State124_8()
    data class Error(val message: String) : State124_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}