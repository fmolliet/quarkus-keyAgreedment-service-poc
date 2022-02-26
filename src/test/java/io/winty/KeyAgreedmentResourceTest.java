package io.winty;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class KeyAgreedmentResourceTest {

    @Test
    public void testKeysEndpoint() {
        given()
            .contentType("application/json")
            .when()
            .body(new Request("1234"))
            .post("/keys")
            .then()
                .statusCode(200)
                .body( is(new Response("teste", "1234").toJson()) );
    }

}