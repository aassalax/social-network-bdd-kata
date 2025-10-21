plugins {
    kotlin("jvm") version "2.2.20"
}

group = "com.aassalax"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.cucumber:cucumber-java8:7+")
    testImplementation("io.cucumber:cucumber-picocontainer:7+")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7+")
    testImplementation("org.assertj:assertj-core:3+")
    testImplementation("org.junit.platform:junit-platform-suite:6+")
    testImplementation("org.junit.jupiter:junit-jupiter:5+")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}