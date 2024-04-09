dependencies {
    implementation(project(":app-domain"))
//    runtimeOnly(project(":app-db-jpa")) // 배포시
    implementation(project(":app-db-jpa"))
    implementation(project(":app-security-token"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
