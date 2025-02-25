description = "A fluent expectation function API in en_GB with a focus on code completion"

val niokVersion: String by rootProject.extra

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(prefixedProject("logic"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation("ch.tutteli.niok:niok:$niokVersion")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(prefixedProject("specs"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(prefixedProject("specs"))
            }
        }
    }
}

val jacocoAdditional: List<Project> by extra(
    listOf(
        prefixedProject("translations-en_GB"),
        prefixedProject("logic"),
        prefixedProject("core")
    )
)
