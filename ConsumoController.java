package pe.edu.upc.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.dtos.ConsumoDTO;
import pe.edu.upc.entities.Consumo;
import pe.edu.upc.serviceinterfaces.IConsumoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/consumos")
public class ConsumoController {
    @Autowired
    private IConsumoService cS;
    @GetMapping
    public List<ConsumoDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, ConsumoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody ConsumoDTO dto){
        ModelMapper m = new ModelMapper();
        Consumo c = m.map(dto,Consumo.class);
        cS.insert(c);
    }
}
