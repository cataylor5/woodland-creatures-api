package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // <-- Change: using @Controller now, not @RestController
import org.springframework.ui.Model; // <-- Change: added to support Model attributes
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/woodlandcreatures")
public class WCController {

    @Autowired
    private WCService service;

    // GET all creatures
    @GetMapping("/all")
    public String getAllCreatures(Model model) {
        model.addAttribute("creatureList", service.getAllCreatures());
        return "animal-list"; // <-- matches the .ftlh file name (without .ftlh extension)
    }


    // GET creature by ID
    @GetMapping("/{creatureId}")
    public String getOneCreature(@PathVariable int creatureId, Model model) { // <-- Change: Return String and use Model
        WoodlandCreatures creature = service.getCreatureById(creatureId);
        if (creature == null) {
            return "error"; // <-- Change: Return error page if not found
        }
        model.addAttribute("creature", creature); // <-- Change: Attach creature to model
        return "animal-details"; // <-- Change: Return the view name
    }

    // GET creatures by species
    @GetMapping("/species/{species}")
    public String getCreaturesBySpecies(@PathVariable String species, Model model) { // <-- Change: Return String and use Model
        model.addAttribute("creatureList", service.getCreaturesBySpecies(species)); // <-- Change: Attach list
        return "animal-list"; // <-- Change: Return the view name
    }

    // GET creatures taller than a height
    @GetMapping("/tall")
    public String getTallCreatures(@RequestParam(name = "height", defaultValue = "0") double height, Model model) { // <-- Change
        model.addAttribute("creatureList", service.getTallCreatures(height)); // <-- Change
        return "animal-list"; // <-- Change
    }

    // GET creatures by description search
    @GetMapping("/description")
    public String getCreaturesByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) { // <-- Change
        model.addAttribute("creatureList", service.getCreaturesByName(search)); // <-- Change
        return "animal-list"; // <-- Change
    }

    // Show form to create a creature
    @GetMapping("/createForm")
    public String showCreateForm(Model model) { // <-- Change: Added form endpoint
        model.addAttribute("creature", new WoodlandCreatures()); // <-- Change: Attach empty object
        return "animal-create"; // <-- Change: Return the view for create
    }

    // POST new creature (submit form)
    @PostMapping("/new")
    public String addNewCreature(@ModelAttribute WoodlandCreatures creature) { // <-- Change: Use @ModelAttribute instead of @RequestBody
        service.addNewCreature(creature);
        return "redirect:/woodlandcreatures/all"; // <-- Change: Redirect after creation
    }

    // Show form to update a creature
    @GetMapping("/update/{creatureId}")
    public String showUpdateForm(@PathVariable int creatureId, Model model) { // <-- Change
        WoodlandCreatures creature = service.getCreatureById(creatureId);
        if (creature == null) {
            return "error"; // <-- Change
        }
        model.addAttribute("creature", creature); // <-- Change
        return "animal-update"; // <-- Change
    }

    // POST updated creature (submit form)
    @PostMapping("/update/{creatureId}")
    public String updateCreature(@PathVariable int creatureId, @ModelAttribute WoodlandCreatures creature) { // <-- Change
        service.updateCreature(creatureId, creature);
        return "redirect:/woodlandcreatures/" + creatureId; // <-- Change
    }

    // GET delete creature
    @GetMapping("/delete/{creatureId}")
    public String deleteCreatureById(@PathVariable int creatureId) { // <-- Change: GET instead of DELETE
        service.deleteCreatureById(creatureId);
        return "redirect:/woodlandcreatures/all"; // <-- Change: Redirect after delete
    }
}
