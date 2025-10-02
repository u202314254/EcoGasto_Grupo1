package pe.edu.upc.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.entities.Meta;
import pe.edu.upc.repositories.IMetaRepository;
import pe.edu.upc.serviceinterfaces.IMetaService;

import java.util.List;
@Service
public class MetaServiceImplement implements IMetaService{
    @Autowired
    private IMetaRepository mS;

    @Override
    public List<Meta> list() {return mS.findAll();}

    @Override
    public void insert(Meta meta) { mS.save(meta); }
}
