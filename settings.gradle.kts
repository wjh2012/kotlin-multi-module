plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kotlin-multi-module"

include("app-runner")
include("app-security-token")
include("app-api")
include("app-domain")
include("app-db-jpa")
