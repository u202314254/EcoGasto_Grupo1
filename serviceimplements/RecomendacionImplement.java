package pe.edu.upc.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.entities.Recomendacion;
import pe.edu.upc.repositories.IRecomendacionRepository;
import pe.edu.upc.serviceinterfaces.IRecomendacionService;

import java.util.List;
@Service
public class RecomendacionImplement implements IRecomendacionService {
    @Autowired
    private IRecomendacionRepository rS;

    @Override
    public List<Recomendacion> list(){return rS.findAll();}

    @Override
    public void insert(Recomendacion recomendacion){rS.save(recomendacion);}
}
