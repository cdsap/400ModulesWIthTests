package com.awesomeapp.module_4_400

sealed class State400_53 {
    data object Loading : State400_53()
    data class Success(val data: String) : State400_53()
    data class Error(val message: String) : State400_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}