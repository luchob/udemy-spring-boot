plugins {
    id("java")
    id("war")
}

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.springframework:spring-webmvc:6.1.14")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.0.0")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}