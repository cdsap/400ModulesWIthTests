package com.awesomeapp.module_1_124

sealed class State124_137 {
    data object Loading : State124_137()
    data class Success(val data: String) : State124_137()
    data class Error(val message: String) : State124_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}