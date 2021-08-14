plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
}

description = "WorldGuard Adapters API for MythicDrops"

dependencies {
    compileOnly("org.spigotmc:spigot-api:_")
    implementation(kotlin("stdlib-jdk8"))
}
