package com.awesomeapp.module_2_173

sealed class State173_19 {
    data object Loading : State173_19()
    data class Success(val data: String) : State173_19()
    data class Error(val message: String) : State173_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}