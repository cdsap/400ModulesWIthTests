package com.awesomeapp.module_1_114

sealed class State114_61 {
    data object Loading : State114_61()
    data class Success(val data: String) : State114_61()
    data class Error(val message: String) : State114_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}