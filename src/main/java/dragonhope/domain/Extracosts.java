package dragonhope.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName ExtraCosts
 */
@TableName(value ="ExtraCosts")
@Data
public class Extracosts implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private BigDecimal cost;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}