package com.awesomeapp.module_1_135

sealed class State135_94 {
    data object Loading : State135_94()
    data class Success(val data: String) : State135_94()
    data class Error(val message: String) : State135_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}