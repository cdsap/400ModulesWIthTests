package com.awesomeapp.module_4_388

sealed class State388_29 {
    data object Loading : State388_29()
    data class Success(val data: String) : State388_29()
    data class Error(val message: String) : State388_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}