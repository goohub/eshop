package cn.xmut.eshop.manage.mapper;

import cn.xmut.eshop.api.model.PmsProductSaleAttr;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 下午2:04
 */
public interface SpuSaleAttrInfoMapper extends Mapper<PmsProductSaleAttr> {

    void insertBatch(@Param("spuSaleAttrInfos") List<PmsProductSaleAttr> spuSaleAttrInfos);

}
