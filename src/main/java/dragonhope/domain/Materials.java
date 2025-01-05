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
 * @TableName Materials
 */
@TableName(value ="Materials")
@Data
public class Materials implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer typeId;

    /**
     * 
     */
    private Integer modelId;

    /**
     * 
     */
    private BigDecimal rollPrice;

    /**
     * 
     */
    private Integer rollLength;

    /**
     * 
     */
    private Integer wasteLength;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}