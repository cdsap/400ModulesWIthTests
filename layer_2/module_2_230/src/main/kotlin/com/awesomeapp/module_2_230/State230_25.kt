package com.awesomeapp.module_2_230

sealed class State230_25 {
    data object Loading : State230_25()
    data class Success(val data: String) : State230_25()
    data class Error(val message: String) : State230_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}