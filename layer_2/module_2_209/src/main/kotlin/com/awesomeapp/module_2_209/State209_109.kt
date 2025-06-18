package com.awesomeapp.module_2_209

sealed class State209_109 {
    data object Loading : State209_109()
    data class Success(val data: String) : State209_109()
    data class Error(val message: String) : State209_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}