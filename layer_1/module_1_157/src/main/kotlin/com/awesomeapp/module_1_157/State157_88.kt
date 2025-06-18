package com.awesomeapp.module_1_157

sealed class State157_88 {
    data object Loading : State157_88()
    data class Success(val data: String) : State157_88()
    data class Error(val message: String) : State157_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}