pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "ImageSearchForKakao"
include(":app")
include(":core:domain")
include(":core:data")
include(":core:data-implement")
include(":feature:search")
include(":feature:storage")
include(":core:base")
include(":core:network")
