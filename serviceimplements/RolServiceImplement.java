package pe.edu.upc.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.entities.Rol;
import pe.edu.upc.repositories.IRolRepository;
import pe.edu.upc.serviceinterfaces.IRolService;

import java.util.List;
@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rS;

    @Override
    public List<Rol> list(){return rS.findAll();}

    @Override
    public void insert(Rol rol){rS.save(rol);}
}
