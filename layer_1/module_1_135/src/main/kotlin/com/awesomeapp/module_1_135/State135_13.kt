package com.awesomeapp.module_1_135

sealed class State135_13 {
    data object Loading : State135_13()
    data class Success(val data: String) : State135_13()
    data class Error(val message: String) : State135_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}