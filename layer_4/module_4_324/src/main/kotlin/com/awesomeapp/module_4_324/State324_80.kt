package com.awesomeapp.module_4_324

sealed class State324_80 {
    data object Loading : State324_80()
    data class Success(val data: String) : State324_80()
    data class Error(val message: String) : State324_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}