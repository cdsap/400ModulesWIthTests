package com.awesomeapp.module_0_67

sealed class State67_82 {
    data object Loading : State67_82()
    data class Success(val data: String) : State67_82()
    data class Error(val message: String) : State67_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}