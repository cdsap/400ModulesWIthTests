package com.awesomeapp.module_1_124

sealed class State124_131 {
    data object Loading : State124_131()
    data class Success(val data: String) : State124_131()
    data class Error(val message: String) : State124_131()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}