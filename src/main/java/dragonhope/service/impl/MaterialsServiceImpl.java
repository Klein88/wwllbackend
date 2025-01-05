package dragonhope.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dragonhope.domain.Materials;
import dragonhope.service.MaterialsService;
import dragonhope.mapper.MaterialsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author dragonhope
* @description 针对表【Materials】的数据库操作Service实现
* @createDate 2025-01-05 15:00:59
*/
@Service
public class MaterialsServiceImpl extends ServiceImpl<MaterialsMapper, Materials>
    implements MaterialsService{
    @Autowired
    private MaterialsMapper materialsMapper;

    @Override
    public void addMaterials(Materials materials) {
        materialsMapper.insertMaterials(materials);
    }

    @Override
    public void deleteMaterialsById(int id) {
        materialsMapper.deleteMaterialsById(id);
    }

    @Override
    public void updateMaterials(Materials materials) {
        materialsMapper.updateMaterials(materials);
    }

    @Override
    public Materials getMaterialsById(int id) {
        return materialsMapper.getMaterialsById(id);
    }

    @Override
    public List<Materials> getAllMaterials() {
        return materialsMapper.getAllMaterials();
    }
}




