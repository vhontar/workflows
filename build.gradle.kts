// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("com.android.application") version "8.1.0" apply false
<<<<<<< Updated upstream
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
=======
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    alias(libs.plugins.gradle.wrapperUpgrade)
    alias(libs.plugins.androidLibrary) apply false
}

wrapperUpgrade {
    gradle {
        create("projectCore") {
            repo.set("vhontar/workflows")
            baseBranch.set("develop")
        }
    }
>>>>>>> Stashed changes
}