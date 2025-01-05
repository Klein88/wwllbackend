package dragonhope.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName OpenCloseTypes
 */
@TableName(value ="OpenCloseTypes")
@Data
public class Openclosetypes implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private Integer lengthAdjust;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}