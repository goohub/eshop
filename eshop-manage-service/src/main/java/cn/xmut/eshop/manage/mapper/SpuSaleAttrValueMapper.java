package cn.xmut.eshop.manage.mapper;

import cn.xmut.eshop.api.model.PmsProductSaleAttrValue;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 下午2:04
 */
public interface SpuSaleAttrValueMapper extends Mapper<PmsProductSaleAttrValue> {

    void insertBatch(@Param("spuSaleAttrValues") List<PmsProductSaleAttrValue> spuSaleAttrValues);

}
