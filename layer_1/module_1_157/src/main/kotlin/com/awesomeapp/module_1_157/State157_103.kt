package com.awesomeapp.module_1_157

sealed class State157_103 {
    data object Loading : State157_103()
    data class Success(val data: String) : State157_103()
    data class Error(val message: String) : State157_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}