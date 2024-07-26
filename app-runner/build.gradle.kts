tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
//    implementation(project(":app-security-token"))
    implementation(project(":app-api"))
    implementation(project(":app-domain"))
    implementation(project(":app-db-jpa"))

    compileOnly("org.springframework.boot:spring-boot-starter")
}
