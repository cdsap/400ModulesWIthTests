package com.awesomeapp.module_1_160

sealed class State160_131 {
    data object Loading : State160_131()
    data class Success(val data: String) : State160_131()
    data class Error(val message: String) : State160_131()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}