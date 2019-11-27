package cn.xmut.eshop.manage.service.impl;

import cn.xmut.eshop.api.model.PmsBaseAttrInfo;
import cn.xmut.eshop.api.model.PmsBaseAttrValue;
import cn.xmut.eshop.api.service.AttrService;
import cn.xmut.eshop.manage.mapper.BaseAttrInfoMapper;
import cn.xmut.eshop.manage.mapper.BaseAttrValueMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午11:08
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private BaseAttrInfoMapper baseAttrInfoMapper;

    @Autowired
    private BaseAttrValueMapper baseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> listBaseAttrInfo(String catalog3Id) {
        PmsBaseAttrInfo baseAttrInfo = new PmsBaseAttrInfo();
        baseAttrInfo.setCatalog3Id(catalog3Id);

        return baseAttrInfoMapper.select(baseAttrInfo);
    }

    @Override
    public List<PmsBaseAttrValue> listBaseAttrValue(String attrInfoId) {
        PmsBaseAttrValue baseAttrValue = new PmsBaseAttrValue();
        baseAttrValue.setAttrId(attrInfoId);

        return baseAttrValueMapper.select(baseAttrValue);
    }

    @Override
    public void saveBaseAttrInfo(PmsBaseAttrInfo baseAttrInfo) {
        baseAttrInfoMapper.insert(baseAttrInfo);
        baseAttrValueMapper.insertBatch(baseAttrInfo.getAttrValueList());
    }

    @Override
    public void updateBaseAttrInfo(PmsBaseAttrInfo baseAttrInfo) {
        baseAttrInfoMapper.updateByPrimaryKey(baseAttrInfo);

        PmsBaseAttrValue baseAttrValue = new PmsBaseAttrValue();
        baseAttrValue.setAttrId(baseAttrInfo.getId());
        baseAttrValueMapper.delete(baseAttrValue);
        baseAttrValueMapper.insertBatch(baseAttrInfo.getAttrValueList());
    }
}
