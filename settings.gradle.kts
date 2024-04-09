plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "AttendanceManagement"

include("app")
include("security-token")
include("api")
include("domain")
include("db-jpa")
