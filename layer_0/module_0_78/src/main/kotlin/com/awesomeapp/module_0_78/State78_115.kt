package com.awesomeapp.module_0_78

sealed class State78_115 {
    data object Loading : State78_115()
    data class Success(val data: String) : State78_115()
    data class Error(val message: String) : State78_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}