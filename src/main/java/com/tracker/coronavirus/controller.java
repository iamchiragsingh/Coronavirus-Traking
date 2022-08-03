package com.tracker.coronavirus;

import com.tracker.coronavirus.LocationStats;
import com.tracker.coronavirus.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class controller {
    @Autowired
    com.tracker.coronavirus.services services;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats=services.getAllStats();
        int totalReportedCases=allStats.stream().mapToInt(stat-> stat.getLatestTotalCases()).sum();
        int totalNewCases=allStats.stream().mapToInt(stat-> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalNewCases",totalNewCases);
        return "home";
    }
}
