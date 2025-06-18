package com.awesomeapp.module_4_345

sealed class State345_61 {
    data object Loading : State345_61()
    data class Success(val data: String) : State345_61()
    data class Error(val message: String) : State345_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}