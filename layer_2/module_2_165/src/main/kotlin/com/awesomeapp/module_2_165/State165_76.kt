package com.awesomeapp.module_2_165

sealed class State165_76 {
    data object Loading : State165_76()
    data class Success(val data: String) : State165_76()
    data class Error(val message: String) : State165_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}