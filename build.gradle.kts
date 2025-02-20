plugins {
    id("java-library")
    id("maven-publish")
}

group = "com.example"
version = "1.0.0"  // Version of Service B

repositories {
    mavenLocal()  // Fetches Service A from local Maven repo
    mavenCentral()
}

dependencies {
    implementation("com.example:service-a:1.0.0")  // Uses Service A
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

