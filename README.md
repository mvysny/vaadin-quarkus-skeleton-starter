# Vaadin+Quarkus Skeleton Starter

> Work on this project has been kindly sponsored by [Inacta AG](https://inacta.ch).

A very basic Vaadin app which runs on top of [Quarkus](https://quarkus.io/).
Contains only a minimal code to get you started. Serves as an archetype app.

Uses [Vaadin Quarkus Extension](https://github.com/urosporo/vaadin-quarkus-extension-parent)
to run smoothly on top of Quarkus.

See the [Vaadin Quarkus](https://github.com/mvysny/vaadin-quarkus/) example application
for a more complex demo.

> Note: Starting with Vaadin 22, Quarkus is now an [official Vaadin offering](https://vaadin.com/docs/latest/flow/integrations/quarkus).

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw -C clean compile quarkus:dev
```

## Packaging and running the application in production mode

The application can be packaged using:
```shell script
./mvnw -C clean package -Pproduction
```
It produces the `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw -C clean package -Dquarkus.package.type=uber-jar -Pproduction
```

The application is now runnable using `java -jar target/code-with-quarkus-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

Unsupported.

## How this works

See [Vaadin Quarkus](https://github.com/mvysny/vaadin-quarkus/).

## Adding Third-party components

See [Vaadin Quarkus](https://github.com/mvysny/vaadin-quarkus/).

# License

See [LICENSE](LICENSE) for more details.
