# Micronaut CLI Template

[![Build](https://github.com/leeturner/micronaut-cli-template/actions/workflows/build.yml/badge.svg)](https://github.com/leeturner/micronaut-cli-template/actions/workflows/build.yml)
[![Licence](https://img.shields.io/github/license/leeturner/micronaut-cli-template)](LICENSE)

A ready to go template for command line apps written in Kotlin with [Micronaut](https://micronaut.io/) and
[Picocli](https://picocli.info/). It starts from the standard Micronaut CLI application and adds the tooling and
libraries I set up on every project, so a new tool can start with the interesting part.

## Features

- A Gradle version catalogue (`gradle/libs.versions.toml`) for every dependency and plugin
- Java 25 through a Gradle toolchain
- [Kotlinter](https://github.com/jeremymailen/kotlinter-gradle) for formatting and [Detekt](https://detekt.dev/) for
  static analysis, with its own configuration
- [Arrow](https://arrow-kt.io/) for functional programming
- [Strikt](https://strikt.io/) for test assertions, including its Arrow support
- Commands that return proper exit codes
- A GitHub Actions build on every push and pull request to `main`
- Daily Dependabot updates for Gradle dependencies, and dependency submission for security alerts

## Requirements

- Java 25 or later

## Usage

Click **Use this template** on GitHub to create a new repository from it. Then make it your own:

1. Change the project name in `settings.gradle.kts` and `src/main/resources/application.properties`.
2. Rename the `com.example` package in `src/main` and `src/test`.
3. Use the same package in `build.gradle.kts`: `group`, `mainClass` and the `micronaut` `annotations` setting.
4. Rename or replace `DemoCommand`.

The template builds and runs as it is:

```shell
./gradlew build
./gradlew run --args="--verbose"
```

`./gradlew build` also runs the tests, Kotlinter and Detekt. To fix formatting, run `./gradlew formatKotlin`.

## Learn more

- [Micronaut user guide](https://docs.micronaut.io/latest/guide/)
- [Micronaut Picocli guide](https://micronaut-projects.github.io/micronaut-picocli/latest/guide/)
- [Micronaut Gradle plugin](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/)
- [Micronaut Kotlin annotation processing (kapt)](https://docs.micronaut.io/latest/guide/#kapt)

## Licence

Apache 2.0. See [LICENSE](LICENSE).
