package pe.edu.upc.serviceinterfaces;

import pe.edu.upc.entities.Consumo;

import java.util.List;

public interface IConsumoService {
    public List<Consumo> list();
    public void insert(Consumo consumo);
}
