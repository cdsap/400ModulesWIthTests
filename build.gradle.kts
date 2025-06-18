plugins {
    kotlin("jvm") version("2.1.21") apply false
    id("com.autonomousapps.dependency-analysis") version "2.18.0" apply true

}
allprojects {
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        develocity.testDistribution {
            enabled.set(true)
            remoteExecutionPreferred.set(true)
            maxLocalExecutors.set(0)
        }

    }
}
