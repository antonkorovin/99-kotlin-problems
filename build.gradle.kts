import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
}

repositories {
    jcenter()
    maven ("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:4.3.1") // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core:4.3.1") // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property:4.3.1") // for kotest property test
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// compile bytecode to java 8 (default is java 6)
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
