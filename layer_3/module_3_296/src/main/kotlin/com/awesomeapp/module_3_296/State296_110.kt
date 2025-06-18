package com.awesomeapp.module_3_296

sealed class State296_110 {
    data object Loading : State296_110()
    data class Success(val data: String) : State296_110()
    data class Error(val message: String) : State296_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}