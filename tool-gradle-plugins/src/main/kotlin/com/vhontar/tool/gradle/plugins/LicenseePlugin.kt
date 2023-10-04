package com.vhontar.tool.gradle.plugins

import app.cash.licensee.LicenseeExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class LicenseePlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.pluginManager.apply("app.cash.licensee")
        target.afterEvaluate {
            target.extensions.configure<LicenseeExtension>("licensee") { ext ->
                ext.allow(spdxId = "Apache-2.0")
                ext.allow(spdxId = "MIT")
//                ext.allow(spdxId = "Apache 2.0")
//                ext.allow(spdxId = "EPL-1.0")
//                ext.allow(spdxId = "BSD-2-Clause")
//                ext.allow(spdxId = "CC0-1.0")
//
//                ext.allowUrl(url = "https://developer.android.com/studio/terms.html")
//                ext.allowUrl(url = "https://developer.android.com/guide/playcore/license")
//                ext.allowUrl(url = "https://developer.android.com/google/play/integrity/overview#tos")
//                ext.allowUrl(url = "https://cloud.google.com/maps-platform/terms/")
            }
        }
    }
}