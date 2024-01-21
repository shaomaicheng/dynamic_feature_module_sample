import com.google.wireless.android.sdk.stats.GradleBuildVariant.KotlinOptions

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.dynamic-feature") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.kapt") version "1.8.10" apply false
}

buildscript {
    dependencies{
        classpath("io.github.meituan-dianping:plugin:1.2.1") {
            exclude(group="com.android.tools.build")
        }
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
    }

}