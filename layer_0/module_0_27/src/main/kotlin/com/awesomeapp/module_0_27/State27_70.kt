package com.awesomeapp.module_0_27

sealed class State27_70 {
    data object Loading : State27_70()
    data class Success(val data: String) : State27_70()
    data class Error(val message: String) : State27_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}