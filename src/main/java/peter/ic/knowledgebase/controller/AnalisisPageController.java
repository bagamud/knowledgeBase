package peter.ic.knowledgebase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import peter.ic.knowledgebase.entity.AnalisisPage;
import peter.ic.knowledgebase.entity.InformationSystem;
import peter.ic.knowledgebase.repository.AnalisisPageRepository;
import peter.ic.knowledgebase.repository.InformationSystemRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/analytic")
public class AnalisisPageController {

    final InformationSystemRepository isRepository;
    final AnalisisPageRepository apRepository;

    public AnalisisPageController(InformationSystemRepository isRepository,
                                  AnalisisPageRepository apRepository) {
        this.isRepository = isRepository;
        this.apRepository = apRepository;
    }

    @GetMapping()
    public String main(Model model) {
        Map<String, List<String>> reportsList = new HashMap<>();
        for (InformationSystem is : isRepository.findAll()) {
            List<String> reportsName = new ArrayList<>();
            for (AnalisisPage analisisPage : apRepository.findAllByInformationSystem(is.getName())) {
                reportsName.add(analisisPage.getReportName());
            }
            reportsList.put(is.getName(), reportsName);
        }
        model.addAttribute("reportsList", reportsList);
        
        return "analytic";
    }

    @GetMapping()
    public String report(@RequestParam String report, Model model) {

        return "analytic";
    }
}
