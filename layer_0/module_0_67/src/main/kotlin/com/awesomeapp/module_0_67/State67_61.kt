package com.awesomeapp.module_0_67

sealed class State67_61 {
    data object Loading : State67_61()
    data class Success(val data: String) : State67_61()
    data class Error(val message: String) : State67_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}