plugins {
    id("java")
    application
}

group = "engetelecom.poo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
application {
    // Note o uso de ".set()" ou "=" dependendo da versão do Gradle
    mainClass.set("engetelecom.poo.Main")
}