dependencies {
    implementation(project(":domain"))
//    runtimeOnly(project(":db-jpa")) // 배포시
    implementation(project(":db-jpa"))
    implementation(project(":security-token"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
