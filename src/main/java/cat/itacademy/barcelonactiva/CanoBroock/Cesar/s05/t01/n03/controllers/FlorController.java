package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.controllers;

import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.services.FlorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flor")
public class FlorController {

    @Autowired
    private FlorServiceImpl florServiceImpl;

    @PostMapping("/clientFlorsAdd")
    @ResponseStatus(HttpStatus.CREATED)
    public void anadirFlor(@RequestBody FlorEntity florEntity) {

    }

    @PutMapping("/clientFlorsUpdate/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFlor(@PathVariable("id") long id, @RequestBody FlorEntity florEntity) {

    }

    @DeleteMapping("/clientFlorsDelete/{id}")
    public void deleteFlor(@PathVariable("id") int id) {

    }

    /*@GetMapping("/clientFlorsGetOne/{id}")
    public ResponseEntity<FlorEntity> getFlorById(@PathVariable("id") int id) {
        Optional<FlorEntity> florData = florRepository.findById((long) id);

        if (florData.isPresent()) {
            return new ResponseEntity<>(florData.get(), HttpStatus.OK);
    }*/

    @GetMapping("/clientFlorsAll")
    public ResponseEntity<List<FlorDTO>> getAllFlores() {
        return new ResponseEntity<>(florServiceImpl.getAllFlores(), HttpStatus.OK);
    }
}

