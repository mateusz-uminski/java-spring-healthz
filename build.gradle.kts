plugins {
    id("java")
    id("jacoco")
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.3"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        html.required.set(true)
        csv.required.set(true)
    }
}
