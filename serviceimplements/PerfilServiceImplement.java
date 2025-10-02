package pe.edu.upc.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.entities.Perfil;
import pe.edu.upc.repositories.IPerfilReporitory;
import pe.edu.upc.serviceinterfaces.IPerfilService;

import java.util.List;
@Service
public class PerfilServiceImplement implements IPerfilService {
    @Autowired
    private IPerfilReporitory pS;

    @Override
    public List<Perfil> list(){return pS.findAll();}

    @Override
    public void  insert(Perfil perfil){pS.save(perfil);}
}
