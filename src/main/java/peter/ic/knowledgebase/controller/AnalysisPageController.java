package peter.ic.knowledgebase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import peter.ic.knowledgebase.repository.AnalysisPageRepository;
import peter.ic.knowledgebase.repository.InformationSystemRepository;

@Controller
@RequestMapping("/analytic")
public class AnalysisPageController {

    final InformationSystemRepository isRepository;
    final AnalysisPageRepository apRepository;

    public AnalysisPageController(InformationSystemRepository isRepository,
                                  AnalysisPageRepository apRepository) {
        this.isRepository = isRepository;
        this.apRepository = apRepository;
    }

    @GetMapping()
    public String report(@RequestParam(defaultValue = "main") String page, Model model) {
        model.addAttribute("isList", isRepository.findAllByOrderById());
        model.addAttribute("report", apRepository.findByName(page));
        return "analytic";
    }
}
