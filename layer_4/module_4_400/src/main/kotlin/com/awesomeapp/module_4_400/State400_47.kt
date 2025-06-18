package com.awesomeapp.module_4_400

sealed class State400_47 {
    data object Loading : State400_47()
    data class Success(val data: String) : State400_47()
    data class Error(val message: String) : State400_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}