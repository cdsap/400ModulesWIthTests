package com.awesomeapp.module_3_314

sealed class State314_22 {
    data object Loading : State314_22()
    data class Success(val data: String) : State314_22()
    data class Error(val message: String) : State314_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}