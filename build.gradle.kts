plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

group = "org.clevertech.gradle.pz"
version = "1.3.5"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Manifest-Version"] = "1.0"
        attributes["Main-Class"] = "org.clevertech.gradle.pz.App"
        attributes["Implementation-Version"] = version
        attributes["Implementation-Title"] = "Gradle Pz Plugin"
    }
    archiveBaseName = "utils"
}

tasks.wrapper {
    gradleVersion = "8.7"
}