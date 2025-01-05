package dragonhope.controller;

import dragonhope.domain.Materials;
import dragonhope.service.MaterialsService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materials")
@CrossOrigin(origins = "http://127.0.0.1:9000", allowCredentials = "true")
public class MaterialController {

    @Autowired
    private MaterialsService materialService;

    // 新增材料
    @PostMapping
    public void addMaterial(@RequestBody Materials material) {
        materialService.addMaterials(material);
    }

    // 根据 ID 删除材料
    @DeleteMapping("/{id}")
    public void deleteMaterialById(@PathVariable int id) {
        materialService.deleteMaterialsById(id);
    }

    // 更新材料
    @PutMapping
    public void updateMaterial(@RequestBody Materials material) {
        materialService.updateMaterials(material);
    }

    // 根据 ID 查询材料
    @GetMapping("/{id}")
    public Materials getMaterialById(@PathVariable int id) {
        return materialService.getMaterialsById(id);
    }

    // 查询所有材料
    @GetMapping
    public List<Materials> getAllMaterials() {
        return materialService.getAllMaterials();
    }
}