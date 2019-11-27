package cn.xmut.eshop.api.service;

import cn.xmut.eshop.api.model.PmsProductInfo;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 下午1:50
 */
public interface SpuService {

    List<PmsProductInfo> listSpuInfo(String catalog3Id);

    void saveSpuInfo(PmsProductInfo spuInfo);
}
