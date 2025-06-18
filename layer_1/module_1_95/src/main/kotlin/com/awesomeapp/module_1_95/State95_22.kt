package com.awesomeapp.module_1_95

sealed class State95_22 {
    data object Loading : State95_22()
    data class Success(val data: String) : State95_22()
    data class Error(val message: String) : State95_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}