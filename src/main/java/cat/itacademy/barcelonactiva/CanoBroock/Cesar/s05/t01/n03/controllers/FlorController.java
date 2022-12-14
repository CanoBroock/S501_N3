package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.controllers;

import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.dto.FlorDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/flor")
public class FlorController {

    private WebClient webClient;

    public FlorController(WebClient webClient) {
        this.webClient = webClient;
    }

    //FUNCIONA
    @PostMapping("/clientFlorsAdd")
    public FlorEntity anadirFlor(@RequestBody FlorEntity florEntity) {
        return webClient.post().uri("http://localhost:9001/flor/add")
                .syncBody(florEntity)
                .retrieve()
                .bodyToMono(FlorEntity.class)
                .block();
    }
    /*
    @PutMapping("/clientFlorsUpdate/{id}")
    public void updateFlor(@PathVariable("id") int idFlor, @RequestBody FlorEntity florEntity) {
        webClient.put().uri("http://localhost:9001/update/{id}", idFlor)
                .syncBody(florEntity)
                .retrieve()
                .bodyToMono(FlorEntity.class)
                .block();
    }*/

    //FUNCIONA
    @DeleteMapping("/clientFlorsDelete/{id}")
    public String deleteFlor(@PathVariable("id") int idFlor) {
        return webClient.delete().uri("http://localhost:9001/flor/delete/{id}", idFlor)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


        @GetMapping("/clientFlorsGetOne/{id}")
        public FlorEntity getFlorById(@PathVariable("id")int id){
            return webClient.get().uri("http://localhost:9001/getOne/{id}",id)
                    .retrieve()
                    .bodyToMono(FlorEntity.class)
                    .block();
        }
    //FUNCIONA
    @GetMapping("/clientFlorsAll")
    public List<FlorDTO> getAllFlores() {
        return webClient.get().uri("http://localhost:9001/flor/getAll")
                .retrieve()
                .bodyToFlux(FlorDTO.class)
                .collectList()
                .block();
    }
}

