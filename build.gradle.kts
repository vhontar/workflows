// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    alias(libs.plugins.gradle.wrapperUpgrade)
}

wrapperUpgrade {
    gradle {
        create("projectCore") {
            repo.set("vhontar/workflows")
            baseBranch.set("develop")
        }
    }
}