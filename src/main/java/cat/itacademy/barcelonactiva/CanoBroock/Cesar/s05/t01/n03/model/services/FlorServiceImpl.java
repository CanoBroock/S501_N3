package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.services;

import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.dto.FlorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FlorServiceImpl {

    @Value("${spring.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;

    /*private FlorDTO convertEntityToDTO(FlorEntity florEntity) {
        FlorDTO florDTO = new FlorDTO();
        florDTO.setPk_FlorID((int) florEntity.getPk_FlorID());
        florDTO.setNomFlor(florEntity.getNomFlor());
        florDTO.setPaisFlor(florEntity.getPaisFlor());
        florDTO.setTipoFlor(florEntity.getPaisFlor());
        return florDTO;
    }*/

    public List<FlorDTO> getAllFlores() {
        FlorDTO[]response = restTemplate.getForObject(basePath+"/getAll", FlorDTO[].class);
        return Arrays.asList(response);
    }

    public void saveFlor(FlorEntity florEntity) {
        restTemplate.postForObject(basePath+"/add", florEntity, FlorEntity.class);
    }

    /*public FlorEntity getFlorById(long id) {
        Optional<FlorEntity> optional = florRepository.findById(id);
        FlorEntity florEntity = null;
        if (optional.isPresent()) {
            florEntity = optional.get();
        } else {
            throw new RuntimeException(" Flor not found for id :: " + id);
        }
        return florEntity;
    }

    public void deleteFlorById(long id) {
        this.florRepository.deleteById(id);
    }*/
}
