package dragonhope.mapper;

import dragonhope.domain.Materials;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author dragonhope
* @description 针对表【Materials】的数据库操作Mapper
* @createDate 2025-01-05 15:00:59
* @Entity dragonhope.domain.Materials
*/
@Mapper
public interface MaterialsMapper extends BaseMapper<Materials> {
    // 新增材料
    void insertMaterials(Materials materials);

    // 根据 ID 删除材料
    void deleteMaterialsById(int id);

    // 更新材料
    void updateMaterials(Materials materials);

    // 根据 ID 查询材料
    Materials getMaterialsById(int id);

    // 查询所有材料
    List<Materials> getAllMaterials();
}




