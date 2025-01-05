package dragonhope.service;

import dragonhope.domain.Materials;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author dragonhope
* @description 针对表【Materials】的数据库操作Service
* @createDate 2025-01-05 15:00:59
*/
public interface MaterialsService extends IService<Materials> {
    // 新增材料
    void addMaterials(Materials materials);

    // 根据 ID 删除材料
    void deleteMaterialsById(int id);

    // 更新材料
    void updateMaterials(Materials materials);

    // 根据 ID 查询材料
    Materials getMaterialsById(int id);

    // 查询所有材料
    List<Materials> getAllMaterials();
}
