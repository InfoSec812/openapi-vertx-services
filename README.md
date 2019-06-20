# Vert.x Pet Store From OpenAPI Specification

## Getting started

1. Grab a copy of the default Pet Store [API Specification](https://raw.githubusercontent.com/InfoSec812/openapi-vertx-services/master/src/main/resources/petstore.yml)
1. Open the API specification in your favorite text editor. There is good support via plugins for OpenAPI in VSCode, IntelliJ, and Eclipse.
1. Add the Vert.x extensions to the API endpoints as demonstrated below:
   ```yaml
   paths:
     /pet:
       put:
         tags:
         - pet
         summary: Update an existing pet
         operationId: updatePet
         x-vertx-event-bus:
           address: petstore.svc.pet
           class: PetService
           timeout: 500
   ```
   - The settings nested under `x-vertx-event-bus` will cause a new class `PetService` to be created and a method in that class called `updatePet`. The `MainVerticle` will also automatically attach that service to the event bus using the address `petstore.svc.pet`.
1. Proceed to update ALL of the API endpoints. Anything under the `/pet` path should be in the `PetService` class, anything under `/store` should be in the `StoreService` class, and so on.
1. Once all of the API endpoints have been updated, we can now generate our stubbed code.
   - npx create-vertx-app⏎
   - **? Choose the build tool (Use arrow keys)** maven⏎
   - **? Project Name** petstore⏎
   - **? Project Description (Optional)** A Vert.x Pet Store API⏎
   - **? Maven Group Id (Optional) (com.example)** com.redhat⏎
   - **? Maven Artifact Id (Optional) (myapp)** petstore⏎
   - **? Project Version (Optional) (0.0.1-SNAPSHOT)** ⏎
   - **? GraalVM native-image (y/N)** ⏎
   - **? Choose your language (Use arrow keys)** java⏎
   - **? Choose the project type** OpenAPI Server With Event Bus Services⏎
   - **? OpenAPI file (YAML or JSON)** /path/to/petstore.yml⏎
   - **? Choose your additional dependencies (Press \<space\> to select, \<a\> to toggle all, \<i\> to invert selection)**
     - io.netty:netty-tcnative-boringssl-static␠
     - io.vertx:vertx-lang-js␠
     - io.vertx:vertx-sockjs-service-proxy␠
     - io.vertx:vertx-circuit-breaker␠
     - io.vertx:vertx-config␠
     - io.vertx:vertx-config-kubernetes-configmap␠
     - io.vertx:vertx-health-check␠
     - io.reactiverse:reactive-pg-client␠⏎
1. The `create-vertx-app` code generator is not perfect, so there is a bit of cleanup we will need to do:
   - In `MainVerticle` add imports for:
     - `java.util.ArrayList`
     - `io.vertx.ext.web.api.contract.RouterFactoryOptions`
   - In `MainVerticle`, remove the import for `com.redhat.petstore.handlers.*`
     - Because we specified the class name in the spec, we did not actually generate handler classes
   - In the `UserServiceTest` class, comment out the lines like the following:
     - `context.assertEquals(default, result.getStatusCode());`
       - This is caused because the specification doesn't define the default return code
   - In the `pom.xml`, remove the `<classifier>processor</classifier>` line from the `vertx-web-api-service` dependency
1. Now we should be able to compile and run... Right now, the API is defined and you can make requests, but all requests will return an error of "Not Implemented".


## Getting started coding

The generated code created some interfaces for the services under `<base package>/services`, and some anemic implementations under `<base package>/services/impl`. In order to get up and running, we just need to implement our business logic in those implementation classes. This means that we can mostly ignore the complexities of writing a REST API and just get to writing business logic and producing business value . . . QUICKLY.


Some other things to note which were generated:
- Models for all of the data types defined in the Specification
- Stubbed unit tests
- Security Handlers

We will discuss each of these as we progress through this tutorial.
