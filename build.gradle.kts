plugins {
    kotlin("jvm")  version "1.8.10"
    checkstyle
}
checkstyle {
    configFile = rootProject.file("checkstyle.xml")
}

group = "ru.job4j"
version = "1.0"

repositories {
    mavenCentral()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    implementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}