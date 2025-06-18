package com.awesomeapp.module_1_105

sealed class State105_91 {
    data object Loading : State105_91()
    data class Success(val data: String) : State105_91()
    data class Error(val message: String) : State105_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}