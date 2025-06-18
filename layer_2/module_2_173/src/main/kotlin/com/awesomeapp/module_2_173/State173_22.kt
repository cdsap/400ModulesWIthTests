package com.awesomeapp.module_2_173

sealed class State173_22 {
    data object Loading : State173_22()
    data class Success(val data: String) : State173_22()
    data class Error(val message: String) : State173_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}