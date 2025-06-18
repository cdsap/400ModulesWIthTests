plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.21")
}

gradlePlugin {
    plugins {
        register("kotlinPlugin") {
            id = "awesome.kotlin.plugin"
            implementationClass = "com.logic.PluginJvmLib"
        }
    }
}
