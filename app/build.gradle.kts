tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":security-token"))
    implementation(project(":api"))
    implementation(project(":domain"))
    implementation(project(":db-jpa"))

    compileOnly("org.springframework.boot:spring-boot-starter")
}
