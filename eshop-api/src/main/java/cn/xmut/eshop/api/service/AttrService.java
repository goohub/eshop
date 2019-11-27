package cn.xmut.eshop.api.service;

import cn.xmut.eshop.api.model.PmsBaseAttrInfo;
import cn.xmut.eshop.api.model.PmsBaseAttrValue;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午11:08
 */
public interface AttrService {

    List<PmsBaseAttrInfo> listBaseAttrInfo(String catalog3Id);

    List<PmsBaseAttrValue> listBaseAttrValue(String attrInfoId);

    void saveBaseAttrInfo(PmsBaseAttrInfo baseAttrInfo);

    void updateBaseAttrInfo(PmsBaseAttrInfo baseAttrInfo);
}
