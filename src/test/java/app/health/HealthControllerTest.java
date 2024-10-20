package app.health;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import app.health.HealthController;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HealthControllerTest {

    private HealthController healthController = new HealthController();

    @Test
    public void testHealthEndpoint() {
        // when
        ResponseEntity<Map<String, String>> responseEntity = healthController.healthz();

        // then
        Map<String, String> responseBody = responseEntity.getBody();
        assertNotNull(responseEntity);
        assertNotNull(responseBody);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("healthy", responseBody.get("status"));
    }
}
