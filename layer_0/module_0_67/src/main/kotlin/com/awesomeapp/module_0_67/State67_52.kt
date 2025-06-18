package com.awesomeapp.module_0_67

sealed class State67_52 {
    data object Loading : State67_52()
    data class Success(val data: String) : State67_52()
    data class Error(val message: String) : State67_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}