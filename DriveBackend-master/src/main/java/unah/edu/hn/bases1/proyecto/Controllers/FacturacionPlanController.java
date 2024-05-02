package unah.edu.hn.bases1.proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.edu.hn.bases1.proyecto.Entities.FacturacionPlan;
import unah.edu.hn.bases1.proyecto.services.imp.FacturacionPlanServiceImp;

@RestController
@RequestMapping("drive/facturacion")
public class FacturacionPlanController {
    
    @Autowired
    private FacturacionPlanServiceImp facturacionPlanServiceImp;

    @GetMapping("/obtenerFacturaciones")
    public List<FacturacionPlan> obtenerFacturaciones() {
        return this.facturacionPlanServiceImp.obtenerFacturacionPlan();
    }

    @GetMapping("/obtenerFacturacionPorId/{id_facturacion}")
    public FacturacionPlan obtenerFacturacionPorId(@PathVariable Integer id_facturacion) {
        return this.facturacionPlanServiceImp.buscarFacturacionPlanPorId(id_facturacion);
    }
}
