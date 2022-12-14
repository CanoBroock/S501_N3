package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.controllers;

import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.dto.FlorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/flor")
public class FlorController {

    private WebClient webClient;
    public FlorController(WebClient webClient){this.webClient = webClient;}

    /*@PostMapping("/clientFlorsAdd")
    @ResponseStatus(HttpStatus.CREATED)
    public void anadirFlor(@RequestBody FlorEntity florEntity) {

    }

    @PutMapping("/clientFlorsUpdate/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFlor(@PathVariable("id") long id, @RequestBody FlorEntity florEntity) {

    }

    @DeleteMapping("/clientFlorsDelete/{id}")
    public ResponseEntity<HttpStatus> deleteFlor(@PathVariable("id") int id) {

    }*/

    @GetMapping("/clientFlorsGetOne/{id}")
    public FlorEntity getFlorById(@PathVariable("id") int id){
        return webClient.get().uri("http://localhost:9001/getOne/",id)
                .retrieve()
                .bodyToMono(FlorEntity.class)
                .block();
    }

    @GetMapping("/clientFlorsAll")
    public List<FlorDTO> getAllFlores() {
    return webClient.get().uri("http://localhost:9001/flor/getAll")
            .retrieve()
            .bodyToFlux(FlorDTO.class)
            .collectList()
            .block();
    }
}

