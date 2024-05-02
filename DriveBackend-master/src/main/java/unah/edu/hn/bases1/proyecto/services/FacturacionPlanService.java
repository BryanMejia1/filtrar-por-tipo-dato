package unah.edu.hn.bases1.proyecto.services;

import unah.edu.hn.bases1.proyecto.Entities.FacturacionPlan;
import java.util.List;

public interface FacturacionPlanService {
    
    public FacturacionPlan buscarFacturacionPlanPorId(Integer id_facturacion);

    public List<FacturacionPlan> obtenerFacturacionPlan();
}
