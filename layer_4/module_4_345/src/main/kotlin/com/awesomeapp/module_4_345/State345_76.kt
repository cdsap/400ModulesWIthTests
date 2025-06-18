package com.awesomeapp.module_4_345

sealed class State345_76 {
    data object Loading : State345_76()
    data class Success(val data: String) : State345_76()
    data class Error(val message: String) : State345_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}