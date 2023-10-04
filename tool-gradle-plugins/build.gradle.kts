@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    // id("com.android.library") version("8.1.0") apply false
    kotlin("jvm") version "1.9.10"
    `java-gradle-plugin`
}

repositories {
    gradlePluginPortal()
    google()
}

dependencies {
    implementation(libs.gradlePlugins.android)
    implementation(libs.gradlePlugins.kotlin)
    implementation(libs.gradlePlugins.ktLint)
    implementation(libs.gradlePlugins.ksp)
    implementation(libs.gradlePlugins.cashappLicenseCheck)
}

gradlePlugin {
    plugins {
        register("licenseePlugin") {
            id = "com.vhontar.licensee"
            implementationClass = "com.vhontar.tool.gradle.plugins.LicenseePlugin"
        }
    }
}