package com.awesomeapp.module_2_184

sealed class State184_122 {
    data object Loading : State184_122()
    data class Success(val data: String) : State184_122()
    data class Error(val message: String) : State184_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}