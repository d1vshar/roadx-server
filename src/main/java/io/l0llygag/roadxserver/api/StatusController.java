package io.l0llygag.roadxserver.api;

import io.l0llygag.roadxserver.models.StatusResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @RequestMapping("/api/status")
    private static StatusResponse status() {
        return new StatusResponse(true, "alive");
    }

}
