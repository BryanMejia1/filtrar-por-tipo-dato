package unah.edu.hn.bases1.proyecto.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.edu.hn.bases1.proyecto.Entities.FacturacionPlan;
import unah.edu.hn.bases1.proyecto.repository.FacturacionPlanRepository;
import unah.edu.hn.bases1.proyecto.services.FacturacionPlanService;

@Service
public class FacturacionPlanServiceImp implements FacturacionPlanService{

    @Autowired
    private FacturacionPlanRepository facturacionPlanRepository;

    @Override
    public FacturacionPlan buscarFacturacionPlanPorId(Integer id_facturacion) {
        if (this.facturacionPlanRepository.existsById(id_facturacion)) {
            return this.facturacionPlanRepository.findById(id_facturacion).get();
        }
        return null;
    }

    @Override
    public List<FacturacionPlan> obtenerFacturacionPlan() {
        return (List<FacturacionPlan>) this.facturacionPlanRepository.findAll();
    }
    
}
