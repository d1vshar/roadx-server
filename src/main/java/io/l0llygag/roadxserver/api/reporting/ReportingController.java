package io.l0llygag.roadxserver.api.reporting;

import io.l0llygag.roadxserver.database.AccidentRepository;
import io.l0llygag.roadxserver.database.BadRoadRepository;
import io.l0llygag.roadxserver.database.BreakdownRepository;
import io.l0llygag.roadxserver.database.CongestionRepository;
import io.l0llygag.roadxserver.models.reporting.AccidentPost;
import io.l0llygag.roadxserver.models.reporting.BadRoadPost;
import io.l0llygag.roadxserver.models.reporting.BreakdownPost;
import io.l0llygag.roadxserver.models.reporting.CongestionPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportingController {

    @Autowired
    private
    BreakdownRepository breakdownRepository;
    @Autowired
    private
    CongestionRepository congestionRepository;
    @Autowired
    private
    BadRoadRepository badRoadRepository;
    @Autowired
    private
    AccidentRepository accidentRepository;

    @GetMapping("/api/breakdown/")
    private List<BreakdownPost> getAllBreakdowns() {
        return breakdownRepository.findAll();
    }

    @PostMapping("/api/breakdown/")
    private void newBreakdown(@RequestBody BreakdownPost breakdownPost) {
        breakdownRepository.insert(breakdownPost);
    }

    @GetMapping("/api/congestion/")
    private List<CongestionPost> getAllCongestion() {
        return congestionRepository.findAll();
    }

    @PostMapping("/api/congestion/")
    private void newCongestion(@RequestBody CongestionPost congestionPost) {
        congestionRepository.insert(congestionPost);
    }

    @GetMapping("/api/badroad/")
    private List<BadRoadPost> getAllBadRoads() {
        return badRoadRepository.findAll();
    }

    @PostMapping("/api/badroad/")
    private void newAllBadRoads(@RequestBody BadRoadPost badRoadPost) {
        badRoadRepository.insert(badRoadPost);
    }

    @GetMapping("/api/accident/")
    private List<AccidentPost> getAllAccidents() {
        return accidentRepository.findAll();
    }

    @PostMapping("/api/accident/")
    private void newAllBadRoads(@RequestBody AccidentPost accidentPost) {
        accidentRepository.insert(accidentPost);
    }

}
