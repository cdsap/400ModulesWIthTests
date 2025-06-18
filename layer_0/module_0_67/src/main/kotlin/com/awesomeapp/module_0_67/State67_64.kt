package com.awesomeapp.module_0_67

sealed class State67_64 {
    data object Loading : State67_64()
    data class Success(val data: String) : State67_64()
    data class Error(val message: String) : State67_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}