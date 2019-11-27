package cn.xmut.eshop.manage.mapper;

import cn.xmut.eshop.api.model.PmsBaseAttrValue;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午11:15
 */
public interface BaseAttrValueMapper extends Mapper<PmsBaseAttrValue> {

    void insertBatch(@Param("baseAttrValueList") List<PmsBaseAttrValue> baseAttrValueList);

}
