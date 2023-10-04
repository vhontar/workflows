pluginManagement {
    includeBuild("tool-gradle-plugins")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "Workflows"
include(":app")
