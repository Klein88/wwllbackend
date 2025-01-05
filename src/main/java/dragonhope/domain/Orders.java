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
 * @TableName Orders
 */
@TableName(value ="Orders")
@Data
public class Orders implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer modelId;

    /**
     * 
     */
    private Integer materialId;

    /**
     * 
     */
    private Integer openCloseId;

    /**
     * 
     */
    private Integer length;

    /**
     * 
     */
    private Integer quantity;

    /**
     * 
     */
    private BigDecimal profitRate;

    /**
     * 
     */
    private BigDecimal totalPrice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}