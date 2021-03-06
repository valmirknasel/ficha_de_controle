import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.3.72"
    war
    kotlin("jvm") version "1.4.31"
    kotlin("plugin.spring") version "1.4.31"
    kotlin("plugin.jpa") version "1.4.31"
}

group = "com.knasel.app"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    /* Spring Data JPA */
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    /* Thymeleaf */
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    /* Spring Boot Starter */
    implementation("org.springframework.boot:spring-boot-starter-web")
    /* Parser para exibir objetos em formato JSON */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    /* Kotlin */
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    /* Spring Boot Dev Tools */
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    /* Postgres */
    runtimeOnly("org.postgresql:postgresql")
    /* Bootstrap CSS */
    implementation("org.webjars:bootstrap:4.5.2")
    implementation("org.webjars:popper.js:2.5.2")
    implementation("org.webjars:jquery:3.5.1")
    /* Tomcat */
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    /* Testes */
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
