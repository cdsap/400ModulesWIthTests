package com.awesomeapp.module_1_95

sealed class State95_31 {
    data object Loading : State95_31()
    data class Success(val data: String) : State95_31()
    data class Error(val message: String) : State95_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}