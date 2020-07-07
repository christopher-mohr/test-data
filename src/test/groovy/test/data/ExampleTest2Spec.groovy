package test.data

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest

import javax.inject.Inject

@MicronautTest(transactional = false)
class ExampleTest2Spec extends TestContainerSpecification{

    @Inject
    ApplicationContext applicationContext

    @Inject
    EmbeddedServer embeddedServer

    @Inject
    @Client('/')
    RxHttpClient httpClient

    void "hello endpoint should reply Hello World again"() {
        when:
        HttpResponse response = httpClient.toBlocking().exchange("/hello", String)

        then:
        response.status == HttpStatus.OK
        response.body() == "Hello World"
    }


}