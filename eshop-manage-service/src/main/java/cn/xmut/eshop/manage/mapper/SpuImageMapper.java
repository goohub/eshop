package cn.xmut.eshop.manage.mapper;

import cn.xmut.eshop.api.model.PmsProductImage;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 下午2:03
 */
public interface SpuImageMapper extends Mapper<PmsProductImage> {

    void insertBatch(@Param("spuImages") List<PmsProductImage> spuImages);

}
