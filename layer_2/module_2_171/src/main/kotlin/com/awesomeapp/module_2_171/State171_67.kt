package com.awesomeapp.module_2_171

sealed class State171_67 {
    data object Loading : State171_67()
    data class Success(val data: String) : State171_67()
    data class Error(val message: String) : State171_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}